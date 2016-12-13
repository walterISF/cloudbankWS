package com.cloudbank.dtos;

import com.cloudbank.entities.Employee;
import com.cloudbank.entities.User;

/**
 * Created by Allan on 10/12/2016.
 */
public class UserDTO {

    private String nome;
    private Integer regEmployee;
    private Integer profileCod;

    public UserDTO(Employee employee, User user){
        this.nome = employee.getNome();
        this.regEmployee = employee.getRegistration();
        this.profileCod = user.getProfileCod();
    }

    public String getNome() {
        return nome;
    }

    public Integer getRegEmployee() {
        return regEmployee;
    }

    public Integer getProfileCod() {
        return profileCod;
    }
}
