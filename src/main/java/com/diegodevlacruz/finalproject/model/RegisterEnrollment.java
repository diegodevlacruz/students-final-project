package com.diegodevlacruz.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterEnrollment {

    LocalDateTime enrollmentDate;
    Student student;
    RegisterDetails registerDetails [];
    boolean status;
}
