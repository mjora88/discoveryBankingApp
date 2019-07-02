package com.khoza.atm.service;

import com.khoza.atm.model.Client;
import com.khoza.atm.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService
{
  @Autowired
  private ClientRepository clientRepository;

  public List<Client> getAllClients()
  {
    return (List<Client>) clientRepository.findAll();
  }

  public Client getCustomerById(Integer customerID)
  {
    return clientRepository.findOne(customerID);
  }
}
