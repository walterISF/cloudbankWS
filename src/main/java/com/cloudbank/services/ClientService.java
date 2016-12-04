package com.cloudbank.services;

import com.cloudbank.entities.Client;
import com.cloudbank.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Allan on 24/11/2016.
 */
@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public Client login (String email, String senha){
        return repository.findByEmailAndSenha(email, senha);
    }

    public Client insert(Client client){
        return repository.save(client);
    }
}
