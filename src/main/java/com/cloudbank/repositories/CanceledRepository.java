package com.cloudbank.repositories;

import com.cloudbank.entities.Canceled;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

/**
 * Created by Allan on 12/12/2016.
 */
public interface CanceledRepository extends JpaRepository<Canceled, Date> {
    Canceled save (Canceled cancelments);

    Canceled findByCardNumber(String cardNumber);
}
