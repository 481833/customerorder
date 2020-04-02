package com.cts.accelerator.jpa.customerorder.domain;

import com.cts.accelerator.jpa.customerorder.AuditModel;

import javax.persistence.*;

@Entity
@Table(name="PAYMENT_TYPES")
public class PaymentType extends AuditModel {

    @Id
    @Column(name="PAYMENT_TYPES_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name="PAYMENT_TYPE_NAME")
    private String paymentTypeName;
    @Column(name="DESCRIPTION")
    private String description;

    public PaymentType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
