package com.capgemini.userDemo.service;

import com.capgemini.userDemo.dto.AccountDto;
import com.capgemini.userDemo.dto.PolicyDto;
import com.capgemini.userDemo.model.Account;
import com.capgemini.userDemo.model.Policy;
import com.capgemini.userDemo.repository.AccountRepository;
import com.capgemini.userDemo.repository.PolicyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountService {

    private static final String TEST_DATA = "TEST";
    private final SampleDataService sampleDataService;

    @Autowired
     private final AccountRepository accountRepository;
    @Autowired
     private final PolicyRepository policyRepository;

    public List<AccountDto> getAccountDetails(String testData) {
        if (TEST_DATA.equalsIgnoreCase(testData)) {
            return sampleDataService.getSampleAccountData();
        }
        Collection<Account> accounts = iterableToCollection(accountRepository.findAll());
        return accounts.stream().map(AccountDto::new).collect(Collectors.toList());
    }

    public List<PolicyDto> getPolicyInformation(BigInteger accountNumber, String testData) {
        if (TEST_DATA.equalsIgnoreCase(testData)) {
            return sampleDataService.getSamplePolicyData();
        }
        List<Policy> policies = policyRepository.findByAccountNumber(accountNumber);
        return policies.stream().map(PolicyDto::new).collect(Collectors.toList());
    }

    public static <T> Collection<T> iterableToCollection(Iterable<T> iterable)
    {
        if (iterable instanceof List) {
            return (List<T>) iterable;
        }

        return StreamSupport.stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
    }

}
