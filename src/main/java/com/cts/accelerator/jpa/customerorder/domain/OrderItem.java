package com.cts.accelerator.jpa.customerorder.domain;

import com.cts.accelerator.jpa.customerorder.AuditModel;

import javax.persistence.*;

@Entity
@Table(name="ORDER_ITEMS")
public class OrderItem extends AuditModel {

    @Id
    @Column(name="ORDER_ITEMS_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="ITEM_ID")
    private Long item_id;

    @Column(name="Quantity")
    private Integer quantity;

    public OrderItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
