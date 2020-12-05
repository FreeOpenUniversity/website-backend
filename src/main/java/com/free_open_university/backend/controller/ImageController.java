package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.Image;
import com.free_open_university.backend.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping
    public Image getImage(Long id)
    {
        return imageService.get(id);
    }
}
