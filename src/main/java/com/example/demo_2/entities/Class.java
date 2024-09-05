package com.example.demo_2.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String description;


}
