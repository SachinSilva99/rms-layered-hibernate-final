package com.sachin.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "item")
public class Item implements SuperEntity{
    @Column(nullable = false)
    private int qty;
    @Id
    private String id;
    @Column(nullable = false)

    private int qtyOnHand;
    @Column(nullable = false)

    private String des;
    @Column(nullable = false)

    private double price;
    @Column(nullable = false)

    private String category;
    @Column(nullable = false)

    private String subCategory;
    @Column(nullable = false)

    private String size;
    @OneToMany(mappedBy = "item",cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails = new ArrayList<>();

}
