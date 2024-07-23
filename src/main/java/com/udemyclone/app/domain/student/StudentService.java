package com.udemyclone.app.domain.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Optional<Student> findById(long id) {
        return studentRepository.get(id);
    }

    public List<Student> list() {
        return studentRepository.list();
    }
}
