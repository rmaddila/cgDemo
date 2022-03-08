package com.capgemini.userDemo.mock;

import com.capgemini.userDemo.dto.AccountDto;
import com.capgemini.userDemo.dto.PolicyDto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MockData {

    public static List<AccountDto> accountDetailsSetup() {

        List<AccountDto> accountList = new ArrayList<>();

        accountList.add(AccountDto.builder()
                .accountNumber(1001L)
                .accountName("McDonlands USA LLC")
                .contactName("Richard Jack")
                .contactEmail("rjk@abc.com")
                .contactPhoneNumber("1232342323")
                .build());

        accountList.add(AccountDto.builder()
                .accountNumber(1002L)
                .accountName("Burger King USA LLC")
                .contactName("Mike Rom")
                .contactEmail("mkr@abc.com")
                .contactPhoneNumber("9289283923")
                .build());

        accountList.add(AccountDto.builder()
                .accountNumber(1003L)
                .accountName("WalMart USA LLC")
                .contactName("Adam Jones")
                .contactEmail("dji23@abc.com")
                .contactPhoneNumber("3434343433")
                .build());

        return accountList;
    }

    public static List<PolicyDto> policyDetailsSetup() {

        List<PolicyDto> policyDtoList = new ArrayList<>();

        policyDtoList.add(PolicyDto.builder()
                .policyNumber(91232L)
                .policyName("USA Policy for Denver")
                .brokerName("abc ciro")
                .insuredName("Burger King")
                .businessLine("Property♥")
                .policyType("local")
                .coverageType("Business Interruption")
                .inceptionDate("01/01/2020")
                .expirationDate("01/01/2021")
                .issueDate("01/10/2022")
                .issuedCountry("USA")
                .policyCurrency("USD")
                .policyLimit(BigDecimal.valueOf(1029292L))
                .policyPremium(BigDecimal.valueOf(19232L))
                .accountNumber(BigInteger.valueOf(1001L))
                .build());

        policyDtoList.add(PolicyDto.builder()
                .policyNumber(91232L)
                .policyName("India Policy for Denver")
                .brokerName("abc ciro")
                .insuredName("Burger King")
                .businessLine("Property♥")
                .policyType("local")
                .coverageType("Business Interruption")
                .inceptionDate("01/01/2020")
                .expirationDate("01/01/2021")
                .issueDate("01/10/2022")
                .issuedCountry("IND")
                .policyCurrency("INR")
                .policyLimit(BigDecimal.valueOf(1029292L))
                .policyPremium(BigDecimal.valueOf(19232L))
                .accountNumber(BigInteger.valueOf(1001L))
                .build());

        policyDtoList.add(PolicyDto.builder()
                .policyNumber(91232L)
                .policyName("German Policy for Denver")
                .brokerName("abc ciro")
                .insuredName("Burger King")
                .businessLine("Property♥")
                .policyType("local")
                .coverageType("Business Interruption")
                .inceptionDate("01/01/2020")
                .expirationDate("01/01/2021")
                .issueDate("01/10/2022")
                .issuedCountry("EUR")
                .policyCurrency("EUR")
                .policyLimit(BigDecimal.valueOf(1029292L))
                .policyPremium(BigDecimal.valueOf(19232L))
                .accountNumber(BigInteger.valueOf(1001L))
                .build());

        policyDtoList.add(PolicyDto.builder()
                .policyNumber(91232L)
                .policyName("USA Policy for Kansas")
                .brokerName("abc ciro")
                .insuredName("Burger King")
                .businessLine("Property♥")
                .policyType("local")
                .coverageType("Business Interruption")
                .inceptionDate("01/01/2020")
                .expirationDate("01/01/2021")
                .issueDate("01/10/2022")
                .issuedCountry("USD")
                .policyCurrency("USD")
                .policyLimit(BigDecimal.valueOf(1029292L))
                .policyPremium(BigDecimal.valueOf(19232L))
                .accountNumber(BigInteger.valueOf(1002L))
                .build());

        return policyDtoList;

    }
}
