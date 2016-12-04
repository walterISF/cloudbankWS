package com.cloudbank.services;

import com.cloudbank.entities.Card;
import com.cloudbank.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by Allan on 02/12/2016.
 */
@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public List<Card> findCards(Integer clientId){
        return cardRepository.findByClientId(clientId);
    }
}
