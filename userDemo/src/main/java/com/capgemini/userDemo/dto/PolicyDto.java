package com.capgemini.userDemo.dto;

import com.capgemini.userDemo.model.Policy;
import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder(toBuilder = true)
public class PolicyDto {

    private Long policyNumber;
    private String policyName;
    private String businessLine;
    private String issuedCountry;
    private String policyCurrency;
    private String policyType;
    private String inceptionDate;
    private String expirationDate;
    private String issueDate;
    private BigDecimal policyLimit;
    private BigDecimal policyPremium;
    private String coverageType;
    private String brokerName;
    private String insuredName;
    private BigInteger accountNumber;

    public PolicyDto(Policy src) {
        this.policyNumber = src.getPolicyNumber();
        this.policyName = src.getPolicyName();
        this.businessLine = src.getBusinessLine();
        this.issueDate = src.getIssueDate();
        this.issuedCountry = src.getIssuedCountry();
        this.policyCurrency = src.getPolicyCurrency();
        this.policyType = src.getPolicyType();
        this.inceptionDate = src.getInceptionDate();
        this.expirationDate = src.getExpirationDate();
        this.policyLimit = src.getPolicyLimit();
        this.policyPremium = src.getPolicyPremium();
        this.coverageType = src.getCoverageType();
        this.brokerName = src.getBrokerName();
        this.insuredName = src.getInsuredName();
        this.accountNumber = src.getAccountNumber();

    }
}
