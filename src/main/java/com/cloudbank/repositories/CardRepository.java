package com.cloudbank.repositories;

import com.cloudbank.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Created by Allan on 02/12/2016.
 */
public interface CardRepository extends JpaRepository<Card, String> {
    List<Card> findByClientId(Integer clientId);
}
