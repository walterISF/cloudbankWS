package com.cloudbank.repositories;

import com.cloudbank.entities.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Allan on 01/12/2016.
 */
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
    Purchase findByOrderNum(Integer orderNum);
}
