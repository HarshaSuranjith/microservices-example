package com.sourcedrift.microservices.service.controller;

import com.sourcedrift.microservices.service.entity.Department;
import com.sourcedrift.microservices.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/department")
@Slf4j
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping(path = "/")
    public Department create(@RequestBody Department department){
        log.info("Creating new department with info: " +  department);
        return departmentService.create(department);
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id){
        return departmentService.findById(id);
    }
}
