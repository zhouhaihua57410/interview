package com.sansux.springboot.controller;

import com.sansux.springboot.model.Person;
import com.sansux.springboot.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping("/say")
    public String say() {
        logger.info("hello, supervisor");
        return "I am sansux";
    }


    @RequestMapping("/toLogin")
    public String login(Model model) throws InterruptedException {

        Person p = new Person();
        p.setLastName("sansux");
        p.setAge(26);
        p.setBirth(new Date());

        List<Person> list = new ArrayList<>();
        Person p2 = null;
        for (int i = 0; i < 10; i++) {
            p2 = new Person();
            p2.setLastName("user" + i);
            p2.setAge(10 + i);
            p2.setBirth(new Date());
            list.add(p2);
        }
        model.addAttribute("hello", "你好");
        model.addAttribute("p", p);
        model.addAttribute("list", list);
        return "login";
    }


    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("/upload")
    public String upload(@RequestParam("pic")MultipartFile file, HttpServletRequest request) {

        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();

        String filePath = "/Users/zhouhaihua/Pictures/upload/";

        try {
            testService.uploadFile(file.getBytes(),filePath,fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }


}
