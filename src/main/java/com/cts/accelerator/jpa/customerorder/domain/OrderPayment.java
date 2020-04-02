package com.cts.accelerator.jpa.customerorder.domain;

import com.cts.accelerator.jpa.customerorder.AuditModel;

import javax.persistence.*;

@Entity
@Table(name="ORDER_PAYMENTS")
public class OrderPayment extends AuditModel {

    @Id
    @Column(name="ORDER_PAYMENTS_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="ORDER_ID")
    private Long orderId;
    @Column(name="PAYMENT_TYPE_ID")
    private Long paymentTypeId;
    @Column(name="PAYMENT_AMOUNT")
    private Number paymentAmount;

    public OrderPayment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(Long paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public Number getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Number paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
