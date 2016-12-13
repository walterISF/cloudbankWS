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
@Table(name = "Faturas")
public class Invoice {

    @Id
    private Integer codInvoice;
    private Integer refMonth;
    private Boolean paidStatus;
    private Integer closeDay;
    private Integer expDay;
    private String cardNumber;

}
