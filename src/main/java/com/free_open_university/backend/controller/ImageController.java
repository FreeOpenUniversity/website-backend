package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.Image;
import com.free_open_university.backend.service.ImageService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping
    @RequestMapping("{id}")
    public Image getImage(@PathVariable Long id)
    {
        return imageService.get(id);
    }

    // post using multi-part file
    @PostMapping("/upload")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public long setImage(@RequestBody final MultipartFile imageFile) throws IOException {
        Image newImage = new Image(imageFile.getOriginalFilename(), imageFile.getContentType(),
                Base64.encodeBase64String(imageFile.getBytes () ) );
        return imageService.save(newImage);
    }
}
