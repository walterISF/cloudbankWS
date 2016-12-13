package com.cloudbank.services;

import com.cloudbank.dtos.UserDTO;
import com.cloudbank.entities.Employee;
import com.cloudbank.entities.User;
import com.cloudbank.repositories.EmployeeRepository;
import com.cloudbank.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Allan on 02/12/2016.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    public UserDTO authUser(Integer regEmployee, String userPassword){

        User user = userRepository.findByRegEmployeeAndUserPassword(regEmployee, userPassword);
        Employee employee = employeeRepository.findByRegistration(user.getRegEmployee());

        UserDTO userDTO = new UserDTO(employee, user);

        return userDTO;
    }
}
