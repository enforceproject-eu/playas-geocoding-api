package org.n52.project.enforce.api.playas.geocoding.api;

import org.n52.project.enforce.api.playas.geocoding.model.Exception;
import org.springframework.lang.Nullable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:34:56.811400200+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
@Controller
@RequestMapping("${openapi.eNFORCEPlayasGeocoding.base-path:/playas-geocoding-api}")
public class ApiApiController implements ApiApi {

    @Autowired
    public ApiApiController() {
    }

    @Override
    public ResponseEntity<Object> getAPI(@Valid String f) {
        // TODO Auto-generated method stub
        return null;
    }

}
