package com.capgemini.userDemo.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name="Policy")
public class Policy extends BaseModel{

    @Id
    @GeneratedValue
    @Column(name="policy_number")
    private Long policyNumber;

    @Column(name="policy_name")
    private String policyName;

    @Column(name="business_line")
    private String businessLine;

    @Column(name="issued_country")
    private String issuedCountry;

    @Column(name="policy_currency")
    private String policyCurrency;

    @Column(name="policy_type")
    private String policyType;

    @Column(name="inception_date")
    private String inceptionDate;

    @Column(name="expiration_date")
    private String expirationDate;

    @Column(name="issue_date")
    private String issueDate;

    @Column(name="policy_Limit")
    private BigDecimal policyLimit;

    @Column(name="policy_premium")
    private BigDecimal policyPremium;

    @Column(name="coverage_type")
    private String coverageType;

    @Column(name="broker_name")
    private String brokerName;

    @Column(name="insured_name")
    private String insuredName;

    @Column(name="account_number")
    private BigInteger accountNumber;
}
