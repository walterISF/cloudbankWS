package com.cloudbank.repositories;

import com.cloudbank.entities.PurchaseInInstallment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Created by Allan on 01/12/2016.
 */
public interface PurchaseInInstallmentRepository extends JpaRepository<PurchaseInInstallment, Integer> {
    List<PurchaseInInstallment> findByCodInvoice(Integer codInvoice);
}
