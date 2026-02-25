package com.diegodevlacruz.finalproject.service;

import com.diegodevlacruz.finalproject.model.Student;
import com.diegodevlacruz.finalproject.repository.IStudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {

    private final IStudentRepo repo;

    @Override
    public Student save(Student student) throws Exception {
        return repo.save(student);
    }

    @Override
    public Student update(Integer id, Student student) throws Exception {
        student.setIdStudent(id);
        return repo.save(student);
    }

    @Override
    public List<Student> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Student findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Student());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }

}
