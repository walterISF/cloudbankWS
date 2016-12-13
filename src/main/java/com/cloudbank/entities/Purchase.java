package com.cloudbank.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Allan on 01/12/2016.
 */
@Data
@Entity
@Table(name = "Compras")
public class Purchase {

    @Id
    private Integer orderNum;
    private Float valor;
    private Float latitude;
    private Float longitude;
    private String items;
    private String place;

}
