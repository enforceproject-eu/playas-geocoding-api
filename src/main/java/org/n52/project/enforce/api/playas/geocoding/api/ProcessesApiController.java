package org.n52.project.enforce.api.playas.geocoding.api;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.apache.commons.io.IOUtils;
import org.n52.project.enforce.api.playas.geocoding.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import jakarta.annotation.Generated;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-11-16T16:34:56.811400200+01:00[Europe/Berlin]",
        comments = "Generator version: 7.25.0")
@Controller
@RequestMapping("${openapi.eNFORCEPlayasGeocoding.base-path:/playas-geocoding-api}")
public class ProcessesApiController implements ProcessesApi {

    private static Logger LOG = LoggerFactory.getLogger(ProcessesApiController.class);

    private ObjectMapper objectMapper;

    private HttpServletRequest request;

    private Utils utils;

    @Autowired
    public ProcessesApiController(HttpServletRequest request) {
        this.objectMapper = new ObjectMapper();
        this.utils = new Utils();
        this.request = request;
    }

    @Override
    public ResponseEntity<Serializable> getProcessDescription() {
        return getRequest("processdescription.json");
    }

    @Override
    public ResponseEntity<Serializable> getProcesses() {
        return getRequest("processlist.json");
    }

    private ResponseEntity<Serializable> getRequest(String name) {
        StringWriter writer = new StringWriter();
        String encoding = StandardCharsets.UTF_8.name();
        try {
            IOUtils.copy(getClass().getResourceAsStream(name), writer, encoding);
            String processDescription = writer.toString();
            processDescription = processDescription.replace("%API_URL%",
                    this.request != null ? this.request.getRequestURI() : "http://localhost:8080/");
            return ResponseEntity.ok(processDescription);
        } catch (IOException e) {
            LOG.error(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<Serializable> execute(@Valid String response,
            String prefer,
            @Valid Resource body) {
        try {
            JsonNode executeRequest = objectMapper.readTree(body.getInputStream());
            JsonNode inputs = executeRequest.get("inputs");
            JsonNode playasInput = inputs.get("playasInput");
            JsonNode value = playasInput.get("value");
            byte[] decodedString = Base64.getDecoder().decode(value.asText());
            OutputStream outputStream = utils.readExcelFile(decodedString);
            byte[] bytes = ((ByteArrayOutputStream) outputStream).toByteArray();
            ResponseEntity<Serializable> responseEntity = ResponseEntity.ok(bytes);
            responseEntity.getHeaders().setContentType(MediaType.APPLICATION_OCTET_STREAM);
            return responseEntity;
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
