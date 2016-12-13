package com.cloudbank.repositories;

import com.cloudbank.entities.PurchaseInCash;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Allan on 01/12/2016.
 */
public interface PurchaseInCashRepository extends JpaRepository<PurchaseInCash, Integer> {
    List<PurchaseInCash> findByCodInvoice(Integer codInvoice);
}
