package com.cloudbank.services;

import com.cloudbank.entities.Canceled;
import com.cloudbank.entities.Card;
import com.cloudbank.repositories.CanceledRepository;
import com.cloudbank.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Allan on 02/12/2016.
 */
@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private CanceledRepository canceledRepository;

    public List<Card> findCards(Integer clientId){

        List<Card> cards = cardRepository.findByClientId(clientId);
        Canceled canceled;
        Card card;

        for(int i=0; i<cards.size(); i++){
            card = cards.get(i);
            canceled = canceledRepository.findByCardNumber(card.getNumero());
            if(canceled!=null){
                cards.remove(i);
            }
        }

        return cards;
    }

    public Boolean cancelCard(String cardNumber, Integer registration) {

        Canceled canceled = new Canceled();
        canceled.setCancelDate(new Date());
        canceled.setCardNumber(cardNumber);
        canceled.setRegistration(registration);

        Canceled cancel = canceledRepository.save(canceled);

        if(cancel != null)
            return true;

        return false;
    }
}
