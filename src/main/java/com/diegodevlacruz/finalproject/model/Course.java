package com.diegodevlacruz.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    Integer idCourse;
    String name;
    String acronym;
    boolean status;

}
