package com.capgemini.userDemo.dto;

import com.capgemini.userDemo.model.Account;
import lombok.*;

import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AccountDto {
    private Long accountNumber;
    private String accountName;
    private String contactName;
    private String contactEmail;
    private String contactPhoneNumber;

    public AccountDto(Account src) {
        this.accountNumber = src.getAccountNumber();
        this.accountName = src.getAccountName();
        this.contactEmail = src.getContactEmail();
        this.contactName = src.getContactName();
        this.contactPhoneNumber = src.getContactPhoneNumber();
    }

}
