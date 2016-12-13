package com.cloudbank.repositories;

import com.cloudbank.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Allan on 30/11/2016.
 */
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
    Invoice findByCardNumberAndRefMonth(String cardNumber, Integer refMonth);
}