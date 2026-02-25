package com.diegodevlacruz.finalproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    Integer idStudent;

    @Column(nullable = false, length = 50, name = "name_student")
    String name;

    @Column(nullable = false, length = 60)
    String lastName;

    @Column(nullable = false, length = 16)
    String identityCard;

    @Column(nullable = false, length = 2)
    int age;

}
