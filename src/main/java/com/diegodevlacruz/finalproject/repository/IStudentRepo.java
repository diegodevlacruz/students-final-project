package com.diegodevlacruz.finalproject.repository;

import com.diegodevlacruz.finalproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student, Integer> {

    //public Student getById(Integer id);
}
