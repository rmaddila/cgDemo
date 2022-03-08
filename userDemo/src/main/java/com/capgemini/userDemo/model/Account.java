package com.capgemini.userDemo.model;

import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name="Account")

public class Account extends BaseModel{

    @Id
    @GeneratedValue
    @Column(name="account_number")
    private Long accountNumber;

    @Column(name="account_name")
    private String accountName;

    @Column(name="contact_name")
    private String contactName;

    @Column(name="contact_email")
    private String contactEmail;

    @Column(name="contact_number")
    private String contactPhoneNumber;
}
