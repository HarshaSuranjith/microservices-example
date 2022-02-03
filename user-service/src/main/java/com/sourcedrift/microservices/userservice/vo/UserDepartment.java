package com.sourcedrift.microservices.userservice.vo;

import com.sourcedrift.microservices.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDepartment {

    private User user;
    private Department department;

}
