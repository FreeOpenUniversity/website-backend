package com.free_open_university.backend.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;

@RestController
//@RequestMapping("/pythonscript")
public class ExecuteShellProcessBuilderController {


@RequestMapping(value = "/pythonscript", method = RequestMethod.GET, produces = "application/pdf")
public ResponseEntity<InputStreamResource> downloadPDFFile()
        throws IOException {

    ClassPathResource pdfFile = new ClassPathResource("log.txt");

    return ResponseEntity
            .ok()
            .contentLength(pdfFile.contentLength())
            .contentType(
                    MediaType.parseMediaType("application/octet-stream"))
            .body(new InputStreamResource(pdfFile.getInputStream()));
}



//    //Run "ExecuteShellProcessBuilder.java" and return "log.txt"
//    @GetMapping
//    public String index() {
//        return "Hello World";
//    }
}


