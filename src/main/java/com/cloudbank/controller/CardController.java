package com.cloudbank.controller;

import com.cloudbank.entities.Card;
import com.cloudbank.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by Allan on 02/12/2016.
 */
@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Card> getCards (@RequestParam Integer clientId){
        return cardService.findCards(clientId);
    }

    @RequestMapping(value = "/cancel", method = RequestMethod.GET)
    public Boolean cancelCard(@RequestParam String cardNumber, @RequestParam Integer registration){
        return cardService.cancelCard(cardNumber, registration);
    }
}
