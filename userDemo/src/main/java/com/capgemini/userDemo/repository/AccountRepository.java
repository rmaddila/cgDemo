package com.capgemini.userDemo.repository;

import com.capgemini.userDemo.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

}
