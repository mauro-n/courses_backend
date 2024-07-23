package com.udemyclone.app.domain.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "")
    public ResponseEntity<List<Student>> list() {
        List<Student> students = studentService.list();
        return ResponseEntity.ok(students);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Student> get(@PathVariable Long id) {

        Optional<Student> student = studentService.findById(id);

        if (student.isPresent()) {
            return ResponseEntity.ok(student.get());
        }

        return ResponseEntity.noContent().build();
    }
}
