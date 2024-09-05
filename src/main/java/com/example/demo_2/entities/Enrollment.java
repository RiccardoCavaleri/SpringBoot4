package com.example.demo_2.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student students;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private Class classes;

}
