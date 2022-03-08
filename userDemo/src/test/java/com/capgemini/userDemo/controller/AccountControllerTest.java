package com.capgemini.userDemo.controller;

import com.capgemini.userDemo.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static com.capgemini.userDemo.mock.MockData.accountDetailsSetup;
import static com.capgemini.userDemo.mock.MockData.policyDetailsSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.lenient;

@RunWith(MockitoJUnitRunner.class)
public class AccountControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    AccountController accountController;

    @Mock
    AccountService accountService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(accountController).build();
    }

    @Test
    public void fetchAccountDetails() throws Exception {
        lenient().when(accountService.getAccountDetails(Mockito.any())).thenReturn(accountDetailsSetup());
        mockMvc.perform(get("/version1/account-list")
                        .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void fetchPolicyDetails() throws Exception {
        lenient().when(accountService.getPolicyInformation(Mockito.any(),Mockito.any())).thenReturn(policyDetailsSetup());
        mockMvc.perform(get("/version1/policy-list")
                        .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful());
    }


}
