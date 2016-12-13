package com.cloudbank.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Allan on 12/12/2016.
 */
@Data
@Entity
@Table(name = "Cancelamentos")
public class Canceled {

    @Id
    private Date cancelDate;
    private String cardNumber;
    private Integer registration;

}
