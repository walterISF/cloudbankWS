package com.cloudbank.dtos;

import com.cloudbank.entities.Invoice;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Allan on 01/12/2016.
 */
@Data
public class InvoiceDTO implements Serializable {

    private Integer refMonth;
    private Integer expDay;
    private Boolean paidStatus;
    private List<PurchaseDTO> purchases;

    public InvoiceDTO (Invoice invoice, List<PurchaseDTO> purchases ){
        this.refMonth = invoice.getRefMonth();
        this.expDay = invoice.getExpDay();
        this.paidStatus = invoice.getPaidStatus();

        this.purchases = purchases;
    }
}
