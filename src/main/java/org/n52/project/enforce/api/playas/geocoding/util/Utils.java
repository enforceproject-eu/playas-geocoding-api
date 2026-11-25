package org.n52.project.enforce.api.playas.geocoding.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.PrecisionModel;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.geojson.GeoJsonReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Utils {
    
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");

    GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);
    
    GeoJsonReader geoJsonReader =  new GeoJsonReader(geometryFactory);

    private Geometry bboxSpain;
    
    private static Logger LOG = LoggerFactory.getLogger(Utils.class);
    
    private Map<String, String> geocodedLoactionMap = new HashMap<>();

    public Utils() {
        try {
            bboxSpain = geoJsonReader.read(new InputStreamReader(getClass().getResourceAsStream("bbox_barcelona.geojson")));
            LOG.info("Successfully parsed BBox of Spain.");
        } catch (ParseException e) {
            LOG.error("Could not parse BBox of Spain.");
            LOG.error(e.getMessage());
        }
        try {
            readGeocodedLocations();
        } catch (IOException e) {
            LOG.error("Could not parse create geocoded location map.");
            LOG.error(e.getMessage());
        }
    }
    
    private void readGeocodedLocations() throws IOException {
        String line = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("geocoding.csv")));        
        while((line = bufferedReader.readLine()) != null) {
            String[] locationNameCoordinateArray = line.split(";");
            if(locationNameCoordinateArray.length == 3) {
                geocodedLoactionMap.put(locationNameCoordinateArray[0], locationNameCoordinateArray[1] + "," + locationNameCoordinateArray[2]);
            }
        }
    }

    public OutputStream readExcelFile(byte[] xcelFileAsByteArray) throws IOException {
        return readExcelFile(new ByteArrayInputStream(xcelFileAsByteArray));
    }

    public OutputStream readExcelFile(String excelFileAsString) throws IOException {
        return readExcelFile(new ByteArrayInputStream(excelFileAsString.getBytes()));
    }
    
    public OutputStream readExcelFile(InputStream inputstream) throws IOException {
        File tmpExcelFile = File.createTempFile("excel", ".xlsx");
        IOUtils.copy(inputstream, new FileOutputStream(tmpExcelFile));
        Workbook workbook = new XSSFWorkbook(new FileInputStream(tmpExcelFile));
        Sheet sheet = workbook.getSheetAt(0);
        Row firstRow = sheet.getRow(0);
        short columnCount = firstRow.getLastCellNum();
        Row row = null;
        Cell cell = null;
        for (int j = 2; j < columnCount; j++) {
            String locationName = "";
            String locationString = "";
            String checkedLocationString = "";
            for (int k = 0; k < 15; k++) {
                row = sheet.getRow(k);
                cell = row.getCell(j);
                switch (k) {
                case 0:
                    locationName = cell.getStringCellValue();
                    break;
                case 11:
                case 12:
                    //final location
                    locationString = cell.getStringCellValue();
                    LOG.debug("Original location string = " + locationString);
                    checkedLocationString = checkAndCorrectLocation(locationString, locationName, false);
                    if(!locationString.equals(checkedLocationString)) {
                        LOG.info("Using corrected location string = " + checkedLocationString);
                        cell.setCellValue(checkedLocationString);
                    }
                    break;
                default:
                    break;
                }
            }
//            LOG.info(String.format("Data with id %d added to cs4 data.", data.getId()));
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        workbook.write(outputStream);
        workbook.close();
        return outputStream;
        
    }

    private String checkAndCorrectLocation(String locationString, String locationName, boolean reversed) {
        Point locationPoint = this.createPoint(locationString, reversed);
        if(locationPoint != null) {
            if(!bboxSpain.contains(locationPoint)) {
                LOG.info("Location not in BBox of Spain. Used reversed coordinates: " + reversed);
                if(!reversed) {
                    return checkAndCorrectLocation(locationString, locationName, true);
                }
                //get location from geocoding map
                locationString = geocodedLoactionMap.get(locationName);
            } else {
                LOG.info("Switched X and Y for: " + locationName);
                //check if coordinates are within buffer of location from geocoded map
                String locationStringFromGeocodingMap = geocodedLoactionMap.get(locationName);
                Point pointFromGeocodingMap = createPoint(locationStringFromGeocodingMap, false);
                Geometry bufferedPointFromGeocodingMap = pointFromGeocodingMap.buffer(0.005d);
                if(!bufferedPointFromGeocodingMap.contains(locationPoint)) {
                    //possible incorrect coordinates from input data
                    LOG.info("Coordinates from input outside of location from geocoded map. Using the latter.");
                    locationString = locationStringFromGeocodingMap;
                } else {
                    locationString = locationPoint.getY() + "," + locationPoint.getX();                    
                }
            }
        }
        return locationString;
    }
    
    private Point createPoint(String pointAsString, boolean reversed) {
        if (pointAsString != null) {
            String[] coordinateArray = pointAsString.split(",");
            if (coordinateArray.length == 2) {
                String latStrg = "";
                String lngStrg = "";
                if(reversed) {
                    latStrg = coordinateArray[0];
                    lngStrg = coordinateArray[1];
                } else {
                    latStrg = coordinateArray[1];
                    lngStrg = coordinateArray[0];
                }
                if ((latStrg != null && !latStrg.isEmpty()) && (lngStrg != null && !lngStrg.isEmpty())) {
                    double lat = Double.parseDouble(latStrg);
                    double lng = Double.parseDouble(lngStrg);
                    return geometryFactory.createPoint(new Coordinate(lat, lng));
                }
            }
        }
        return geometryFactory.createPoint(new Coordinate(0, 0));
    }
    
}
