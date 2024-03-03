package com.project.startingspringboot.helper;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUploadHelper
{

    public static boolean upload(MultipartFile file)
    {
        try
        {
            String path = new ClassPathResource("static/image/").getFile().getAbsolutePath();
//            byte[] imageBytes = file.getBytes();
//            FileOutputStream outputStream = new FileOutputStream(path + Paths.get(File.separator + file.getOriginalFilename()) + StandardCopyOption.REPLACE_EXISTING);
//            outputStream.write(imageBytes);
//            outputStream.flush();
//            outputStream.close();
            Files.copy(file.getInputStream(), Paths.get(path + File.separator + file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
