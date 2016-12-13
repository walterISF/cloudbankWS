package com.cloudbank.repositories;

import com.cloudbank.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Allan on 10/12/2016.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByRegistration(Integer registration);
}
