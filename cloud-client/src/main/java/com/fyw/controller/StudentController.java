package com.fyw.controller;

import com.fyw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by fyw on 2019/7/30.
 */
@RestController
@RequestMapping("/studentController")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/findAll")
    public Map findAll() {
        return studentService.findAll();
    }

    @GetMapping("/getPort")
    public String getPort() {
        return studentService.getPort();
    }
}
