package com.udemyclone.app.domain.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataStudentRepository extends JpaRepository<Student, Long> {
}
