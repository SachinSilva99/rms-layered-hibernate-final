package com.sachin.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Salary implements SuperEntity{
    @Column(nullable = false)
    private String enic;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double salary;
    @Column(nullable = false)
    private LocalDate month;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private  String status;
    @Id
    private int id;


}
