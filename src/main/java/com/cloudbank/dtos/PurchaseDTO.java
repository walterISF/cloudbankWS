package com.cloudbank.dtos;

import com.cloudbank.entities.Purchase;
import com.cloudbank.entities.PurchaseInInstallment;
import lombok.Data;
import java.io.Serializable;

/**
 * Created by Allan on 01/12/2016.
 */
@Data
public class PurchaseDTO implements Serializable {

    private Float valor;
    private String items;
    private String place;
    private Float installmentValue;
    private Float latitude;
    private Float longitude;
    private Integer totalInstallment;
    private Integer paidInstallment;

    public PurchaseDTO (Purchase purchase){
        this.valor = purchase.getValor();
        this.items = purchase.getItems();
        this.place = purchase.getPlace();
        this.installmentValue = purchase.getValor();
        this.latitude = purchase.getLatitude();
        this.longitude = purchase.getLongitude();
        this.totalInstallment = 1;
        this.paidInstallment = 0;
    }
    public PurchaseDTO (PurchaseInInstallment inInstallment, Purchase purchase){
        this.valor = purchase.getValor();
        this.items = purchase.getItems();
        this.place = purchase.getPlace();
        this.installmentValue = inInstallment.getInstallmentValue();
        this.latitude = purchase.getLatitude();
        this.longitude = purchase.getLongitude();
        this.totalInstallment = inInstallment.getTotalInstalment();
        this.paidInstallment = inInstallment.getPaidInstallment();
    }

    public void paidStatus(Boolean status){
        if(status){
            this.paidInstallment++;
        }
    }

}
