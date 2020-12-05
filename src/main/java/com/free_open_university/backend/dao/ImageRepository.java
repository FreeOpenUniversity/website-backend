package com.free_open_university.backend.dao;

import com.free_open_university.backend.bean.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
