package com.cts.accelerator.jpa.customerorder.domain;

import com.cts.accelerator.jpa.customerorder.AuditModel;

import javax.persistence.*;

@Entity
@Table(name="CUSTOMERS")
public class Customer extends AuditModel {

    @Id
    @Column(name="CUSTOMER_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="CUSTOMER_NAME")
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
