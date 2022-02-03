package com.sourcedrift.microservices.service.repository;

import com.sourcedrift.microservices.service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {


}
