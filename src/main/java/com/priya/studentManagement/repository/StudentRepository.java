package com.priya.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priya.studentManagement.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
