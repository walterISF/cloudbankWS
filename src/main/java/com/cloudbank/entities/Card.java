package com.cloudbank.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by Allan on 02/12/2016.
 */
@Data
@Entity
@Table(name = "Cartoes")
public class Card {

    @Id
    private String numero;
    private String securityNumber;
    private Float totalLim;
    private Float usedLim;
    private Date expiration;
    private String brand;
    private Integer clientId;

}
