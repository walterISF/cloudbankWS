package com.cloudbank.repositories;

import com.cloudbank.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Allan on 02/12/2016.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByRegEmployeeAndUserPassword(Integer regEmployee, String userPassword);
}
