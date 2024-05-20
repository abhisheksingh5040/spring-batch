package com.tecnoelevate.batchprocessing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer_info")
public class Customer {

    @Id
    @Column(name = "customer_id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "contact_no")
    private String contactNo;

    @Column(name = "country")
    private String country;

    @Column(name = "DOB")
    private String dob;
}
