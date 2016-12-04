package com.cloudbank.entities;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Allan on 02/12/2016.
 */
@Data
@Entity
@Table(name = "Usuario")
public class User {

    @Id
    private Integer cod;
    private String userPassword;
    private Integer regEmployee;
    private Integer profileCod;
}
