package com.capgemini.userDemo.repository;

import com.capgemini.userDemo.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface PolicyRepository extends CrudRepository<Policy, Long> {

    List<Policy> findByAccountNumber(BigInteger accountNumber);
}
