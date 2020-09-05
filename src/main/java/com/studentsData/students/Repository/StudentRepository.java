package com.studentsData.students.Repository;

import com.studentsData.students.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {
    public Student findByName(String name);
}
