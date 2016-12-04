package com.cloudbank.controller;

import com.cloudbank.dtos.InvoiceDTO;
import com.cloudbank.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Allan on 30/11/2016.
 */
@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public InvoiceDTO getInvoice(@RequestParam String cardNumber, @RequestParam Integer refMonth) {
        return invoiceService.getInvoice(cardNumber, refMonth);
    }
}