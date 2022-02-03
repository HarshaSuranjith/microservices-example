package com.sourcedrift.microservices.userservice.service;

import com.sourcedrift.microservices.userservice.entity.User;
import com.sourcedrift.microservices.userservice.repository.UserRepository;
import com.sourcedrift.microservices.userservice.vo.Department;
import com.sourcedrift.microservices.userservice.vo.UserDepartment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final RestTemplate restTemplate;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.restTemplate = new RestTemplate();
    }

    public User create(User user) {
        return this.userRepository.save(user);
    }

    public User findById(Long id) {
        return this.userRepository.findById(id).get();
    }

    public UserDepartment findUserDepartment(Long id) {
        User user = this.userRepository.findById(id).get();
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/" + user.getDepartmentId(), Department.class);
        return new UserDepartment(user, department);
    }
}
