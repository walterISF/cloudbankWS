package com.cloudbank.controller;

import com.cloudbank.entities.Client;
import com.cloudbank.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Allan on 23/11/2016.
 */
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/auth", method = RequestMethod.GET)
    public Client login(@RequestParam String email, @RequestParam String senha){
        return clientService.login(email, senha);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Client insert(@RequestBody Client client) {
        return clientService.insert(client);
    }
}
