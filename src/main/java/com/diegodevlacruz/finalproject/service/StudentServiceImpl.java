package com.diegodevlacruz.finalproject.service;

import com.diegodevlacruz.finalproject.model.Student;
import com.diegodevlacruz.finalproject.repository.IStudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {

    private final IStudentRepo repo;

    /*
    public StudentServiceImpl(IStudentRepo repo) {
        this.repo = repo;
    }

     */

    public Student validAndGet(Integer id) {
        Student student = null;
        if (id > 0) {
            //repo = new StudentRepo();
            student = repo.getById(id);
        }
        return student;
    }

}
