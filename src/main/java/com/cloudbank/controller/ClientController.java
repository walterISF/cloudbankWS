package com.cloudbank.controller;

import com.cloudbank.entities.Client;
import com.cloudbank.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Client> searchClient(@RequestParam String cpf){
        return clientService.searchClient(cpf);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Client> searchAll(){
        return clientService.searchAll();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Client insert(@RequestBody Client client) {
        return clientService.insert(client);
    }

    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public Client getOne(@RequestParam Integer id){
        return clientService.getOne(id);
    }

}
