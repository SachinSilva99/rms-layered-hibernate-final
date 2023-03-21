package com.sachin.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Orders implements SuperEntity{
    @Id
    private String id;
    @Column(nullable = false)
    private LocalDate date;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;
    @Column(nullable = false)
    private String orderType;


}
