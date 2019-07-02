package com.khoza.atm.repository;

import com.khoza.atm.model.Client;
import com.khoza.atm.model.ClientAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<ClientAccount, String>
{
  List<ClientAccount> findAllByClient(Client client);
}
