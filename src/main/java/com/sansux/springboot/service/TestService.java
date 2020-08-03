package com.sansux.springboot.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class TestService {

    public void uploadFile(byte[] file, String filePath, String fileName) throws IOException {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdir();
        }

        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }
}
