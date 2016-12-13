package com.cloudbank.services;

import com.cloudbank.dtos.InvoiceDTO;
import com.cloudbank.dtos.PurchaseDTO;
import com.cloudbank.entities.Invoice;
import com.cloudbank.entities.Purchase;
import com.cloudbank.entities.PurchaseInCash;
import com.cloudbank.entities.PurchaseInInstallment;
import com.cloudbank.repositories.InvoiceRepository;
//import com.cloudbank.repositories.PurchaseInCashRepository;
import com.cloudbank.repositories.PurchaseInCashRepository;
import com.cloudbank.repositories.PurchaseInInstallmentRepository;
import com.cloudbank.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allan on 30/11/2016.
 */
@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private PurchaseInCashRepository purchaseInCashRepository;
    @Autowired
    private PurchaseInInstallmentRepository purchaseInInstallmentRepository;
    @Autowired
    private PurchaseRepository purchaseRepository;

    public InvoiceDTO getInvoice(String cardNumber, Integer refMonth){
        Invoice invoice = invoiceRepository.findByCardNumberAndRefMonth(cardNumber, refMonth);
        List<PurchaseInCash> inCash = purchaseInCashRepository.findByCodInvoice(invoice.getCodInvoice());
        List<PurchaseInInstallment> inInstallment = purchaseInInstallmentRepository.findByCodInvoice(invoice.getCodInvoice());

        List<PurchaseDTO> purchases = new ArrayList<>();
        Purchase purchase;
        PurchaseDTO purchaseDTO;

        for(int i=0; i<inCash.size(); i++){
            purchase = purchaseRepository.findByOrderNum(inCash.get(i).getOrderNum());
            purchaseDTO = new PurchaseDTO(purchase);

            purchaseDTO.paidStatus(invoice.getPaidStatus());

            purchases.add(purchaseDTO);
        }
        for(int i=0; i<inInstallment.size(); i++){
            purchase = purchaseRepository.findByOrderNum(inInstallment.get(i).getOrderNum());
            purchaseDTO = new PurchaseDTO(inInstallment.get(i),purchase);

            purchaseDTO.paidStatus(invoice.getPaidStatus());

            purchases.add(purchaseDTO);
        }

        return new InvoiceDTO(invoice, purchases);
    }
}
