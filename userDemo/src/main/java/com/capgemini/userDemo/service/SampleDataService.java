package com.capgemini.userDemo.service;

import com.capgemini.userDemo.dto.AccountDto;
import com.capgemini.userDemo.dto.PolicyDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class SampleDataService {

    public List<AccountDto> getSampleAccountData() {

        ObjectMapper objectMapper = new ObjectMapper();
        List<AccountDto> accountList = new ArrayList<>();
        try {
            ClassPathResource resource = new ClassPathResource("Data/AccountDetails.json");
            InputStream inputStream = resource.getInputStream();
            accountList = objectMapper.readValue(inputStream, new TypeReference<List<AccountDto>>() {
            });

        } catch (Exception e) {
            log.error("Problem reading the Account Data", e);
        }
        return accountList;
    }

    public List<PolicyDto> getSamplePolicyData() {

        ObjectMapper objectMapper = new ObjectMapper();
        List<PolicyDto> policyList = new ArrayList<>();
        try {
            ClassPathResource resource = new ClassPathResource("Data/PolicyDetails.json");
            InputStream inputStream = resource.getInputStream();
            policyList = objectMapper.readValue(inputStream, new TypeReference<List<PolicyDto>>() {
            });

        } catch (Exception e) {
            log.error("Problem reading the Policy Data", e);
        }
        return policyList;
    }


}
