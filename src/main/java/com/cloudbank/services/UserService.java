package com.cloudbank.services;

import com.cloudbank.entities.User;
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

    public User authUser(Integer regEmployee, String userPassword){
        return userRepository.findByRegEmployeeAndUserPassword(regEmployee, userPassword);
    }
}
