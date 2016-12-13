package com.cloudbank.entities;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Allan on 07/12/2016.
 */
@Data
@Entity
@Table(name = "Funcionarios")
public class Employee {

    @Id
    private Integer registration;
    private String nome;
    private String address;
    private String telphone;
    private Float salary;
    private String office;
    
}
