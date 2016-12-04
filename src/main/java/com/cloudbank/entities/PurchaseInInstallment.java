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
@Table(name = "Parcelada")
public class PurchaseInInstallment {

    private Float installmentValue;
    private Integer totalInstalment;
    private Integer paidInstallment;
    @Id
    private Integer orderNum;
    private Integer codInvoice;

}
