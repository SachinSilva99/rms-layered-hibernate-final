package com.sachin.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "food")
public class Food implements SuperEntity{
    @Id
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private String subCategory;

}
