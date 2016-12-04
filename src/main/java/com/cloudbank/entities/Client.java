package com.cloudbank.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Allan on 24/11/2016.
 */
@Data
@Entity
@Table(name = "Clientes")
public class Client {

    @Id
    private Integer id;
    private String nome;
    private String email;
    private String telphone;
    private String address;
    private String cpf;
    private String senha;

}
