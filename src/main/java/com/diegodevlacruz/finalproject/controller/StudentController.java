package com.diegodevlacruz.finalproject.controller;

import com.diegodevlacruz.finalproject.model.Student;
import com.diegodevlacruz.finalproject.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/students")
public class StudentController {

    private final IStudentService service;

    /*
    public StudentController(IStudentService service) {
        this.service = service;
    }

     */

    @GetMapping
    public Student getStudent(){
        //service = new StudentService();
        return service.validAndGet(1);
    }

}
