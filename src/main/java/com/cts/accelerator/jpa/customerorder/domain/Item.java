package com.cts.accelerator.jpa.customerorder.domain;

import com.cts.accelerator.jpa.customerorder.AuditModel;

import javax.persistence.*;

@Entity
@Table(name="ITEMS")
public class Item extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ITEM_ID")
    private Long id;

    @Column(name="ITEM_NUMBER")
    private String item_number;
    @Column(name="Description")
    private String description;
    @Column(name="ITEM_PRICE")
    private Number item_price;

    public Item() {
    }

    public String getItem_number() {
        return item_number;
    }

    public void setItem_number(String item_number) {
        this.item_number = item_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Number getItem_price() {
        return item_price;
    }

    public void setItem_price(Number item_price) {
        this.item_price = item_price;
    }
}
