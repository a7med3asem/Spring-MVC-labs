package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Controller
public class UploadController {

    @GetMapping("/upload")
    public String getUpload(){

        return "upload";
    }

    @PostMapping("/upload")
    public String uploadFileHandler(MultipartFile file, Map<String, Object> model){

        if(!file.isEmpty()){
            System.out.println("file is " + file.getOriginalFilename());
            model.put("uploded", "File Uploaded is " + file.getOriginalFilename());

            return "upload";
        }
        else{
            return "redirect:registration";
        }
    }
}
