package com.diegodevlacruz.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    Integer idStudent;
    String name;
    String lastName;
    String identityCard;
    int age;

}
