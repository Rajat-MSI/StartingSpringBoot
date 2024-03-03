package com.project.startingspringboot.controller;

import com.project.startingspringboot.helper.FileUploadHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class FileController
{
    @PostMapping(path = "/file-upload")
    public ResponseEntity<String> fileUpload(@RequestParam("image") MultipartFile file)
    {
        System.out.println(file.getOriginalFilename());
        if(file.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        if(!file.getContentType().equals("image/jpeg") || file.getContentType().equals("image/png"))
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only JPEG or PNG contents are allowed");
        }

        if(FileUploadHelper.upload(file))
        {
           return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
