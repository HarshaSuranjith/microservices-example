package com.sourcedrift.microservices.service.service;

import com.sourcedrift.microservices.service.entity.Department;
import com.sourcedrift.microservices.service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department create(Department department) {
        return departmentRepository.save(department);
    }

    public Department findById(Long id) {
        return departmentRepository.findById(id).get();
    }
}
