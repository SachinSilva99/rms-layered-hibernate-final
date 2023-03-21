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
@Entity(name = "customer")
@Table()
public class Customer implements SuperEntity {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String gender;
    @Column()
    private String address;
    @Id
    private String id;
    @Column(nullable = false)
    private String phoneNumber;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Orders> orders = new ArrayList<>();

}
