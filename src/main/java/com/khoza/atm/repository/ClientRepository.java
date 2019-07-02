package com.khoza.atm.repository;

import com.khoza.atm.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>
{
}
