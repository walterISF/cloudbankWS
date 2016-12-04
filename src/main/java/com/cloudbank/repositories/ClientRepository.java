package com.cloudbank.repositories;


import com.cloudbank.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Allan on 24/11/2016.
 */
public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByEmailAndSenha (String email, String senha);

}
