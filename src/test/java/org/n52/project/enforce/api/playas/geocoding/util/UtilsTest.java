package org.n52.project.enforce.api.playas.geocoding.util;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UtilsTest {

    @Test
    public void testReadExcelFile() {
        Utils utils = new Utils();
        try {
            OutputStream outputStream = utils.readExcelFile(getClass().getResourceAsStream("Playas.xlsx"));
            FileOutputStream fileOutputStream = new FileOutputStream(File.createTempFile("Playas_Test", ".xlsx"));
            
            if(outputStream instanceof ByteArrayOutputStream) {
                byte[] bytes = ((ByteArrayOutputStream)outputStream).toByteArray();
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            }            
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testReadFromStream() {
        Utils utils = new Utils();
        
        try {
            JsonNode executeRequest = new ObjectMapper().readTree(getClass().getResourceAsStream("execute.json"));
            JsonNode inputs = executeRequest.get("inputs");
            JsonNode playasInput = inputs.get("playasInput");
            JsonNode value = playasInput.get("value");
            byte[] decodedString = Base64.getDecoder().decode(value.asText());
            OutputStream outputStream = utils.readExcelFile(decodedString);
            
        } catch (IOException e) {
            fail(e.getMessage());
        }
        
    }
    
}
