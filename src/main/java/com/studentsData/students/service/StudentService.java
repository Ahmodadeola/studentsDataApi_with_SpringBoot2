package com.studentsData.students.service;

import com.studentsData.students.DAO.StudentDAOImpl;
import com.studentsData.students.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentDAOImpl studentDAO;

    @Autowired
    public StudentService(StudentDAOImpl studentDAO) {
        this.studentDAO = studentDAO;
    }

    public List<Student> getAllStudents(){
        return studentDAO.getAllStudents();
    }

    public Student getStudent(String id){
        return studentDAO.getStudentById(id);
    }

    public Student getStudentByName(String name){
        return studentDAO.getStudentByName(name);
    }

    public Student addStudent(Student student){
        return studentDAO.addStudent(student);
    }

    public Student updateStudent(Student student){
        return studentDAO.updateStudent(student);
    }

    public void removeStudent(String id){
        Student student = studentDAO.getStudentById(id);
        studentDAO.deleteStudent(student);
    }
}
