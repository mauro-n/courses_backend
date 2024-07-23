package com.udemyclone.app.domain.student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PostgresStudentRepository implements StudentRepository {

    private EntityManager em;

    @Autowired
    public PostgresStudentRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Optional<Student> get(long id) {
        TypedQuery<Student> query = em.createQuery("from Student s where s.id = :id", Student.class);
        query.setParameter("id", id);
        return query.getResultStream().findFirst();
    }

    @Override
    public List<Student> list() {
        TypedQuery<Student> query = em.createQuery("from Student", Student.class);
        return query.getResultList();
    }

    @Override
    public Student save(Student student) {
        return null;
    }

}
