package com.auca.restfulapi.student.repository;

import com.auca.restfulapi.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByMajor(String major);
    List<Student> findByGpaGreaterThanEqual(Double gpa);
}
