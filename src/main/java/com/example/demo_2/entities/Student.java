package com.example.demo_2.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String email;

}
