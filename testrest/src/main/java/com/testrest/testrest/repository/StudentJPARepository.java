package com.testrest.testrest.repository;

import com.testrest.testrest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJPARepository extends JpaRepository<Student, Long> {
    Student findByName(String name);
}
