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
@Table(name = "Avista")
public class PurchaseInCash {

    @Id
    private Integer orderNum;
    private Integer codInvoice;

}
