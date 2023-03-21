package com.sachin.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "orderdetail")
public class OrderDetail implements SuperEntity {
    @Id
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Orders orders;
    @Id
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Item item;
    @Column(nullable = false)
    private int qty;
    @Column(nullable = false)
    private double unitPrice;


}
