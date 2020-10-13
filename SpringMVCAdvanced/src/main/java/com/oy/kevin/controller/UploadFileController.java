package com.oy.kevin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Kevin on 2020/9/27
 */

@Controller
@RequestMapping("upload")
public class UploadFileController {

    @ResponseBody
    @RequestMapping("uploadFile")
    public String uploadFile(@RequestParam("desc") String desc, @RequestParam("file") MultipartFile file) throws IOException {
        InputStream inputStream = file.getInputStream();
        String filename = file.getOriginalFilename();
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\" + filename);
        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = inputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }
        fileOutputStream.close();
        inputStream.close();
        System.out.println(desc);
        return "success";
    }
}
