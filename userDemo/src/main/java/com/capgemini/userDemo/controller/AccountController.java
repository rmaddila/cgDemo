package com.capgemini.userDemo.controller;

import com.capgemini.userDemo.dto.AccountDto;
import com.capgemini.userDemo.dto.PolicyDto;
import com.capgemini.userDemo.service.AccountService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/version1")
public class AccountController {

    private final AccountService accountService;


    @GetMapping(value = "/account-list", produces = "application/json")
    @ApiOperation("Fetch all Account Details")
    public ResponseEntity<List<AccountDto>> fetchAccountDetails(@RequestParam(value = "TestData", required = false) String testData) {
        System.out.println("Ravi");
        val response = accountService.getAccountDetails(testData);
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/policy-list", produces = "application/json")
    @ApiOperation("Fetch all policy Details for given Account Number")
    public ResponseEntity<List<PolicyDto>> fetchPolicyDetails(@RequestParam(value = "AccountNumber", required = false) BigInteger accountNumber,
                                                              @RequestParam(value = "TestData", required = false) String testData) {
        val response = accountService.getPolicyInformation(accountNumber, testData);
        return ResponseEntity.ok(response);
    }


}
