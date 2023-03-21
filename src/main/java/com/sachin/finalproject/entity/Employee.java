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
@Entity(name = "employee")
public class Employee implements SuperEntity{

    @Column(nullable = false)
    private String phoneNumber;
    @Id
    private String nic;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String role;
    @Column(nullable = false)
    private double salary;
    @Column(nullable = false)
    private LocalDate dob;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String gender;


}
