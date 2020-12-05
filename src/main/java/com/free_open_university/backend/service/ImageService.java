package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.Image;
import com.free_open_university.backend.dao.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public long save(Image image)
    {
        return  1;  // return id of the image
    }

    public Image get(Long id)
    {
        return imageRepository.getOne(id);
    }

}
