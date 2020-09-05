package com.studentsData.students.DAO;

import com.studentsData.students.Repository.StudentRepository;
import com.studentsData.students.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentDAOImpl implements StudentDAO{

    @Autowired
    private final StudentRepository studentRepository;


    public StudentDAOImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.insert(student);
    }

    @Override
    public Student getStudentById(String id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.get();
    }

    @Override
    public Student getStudentByName(String name) {
        return studentRepository.findByName(name);
    }


    @Override
    public Student updateStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }
}
