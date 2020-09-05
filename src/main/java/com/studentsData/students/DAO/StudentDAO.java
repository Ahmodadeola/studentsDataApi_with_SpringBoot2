package com.studentsData.students.DAO;

import com.studentsData.students.model.Student;

import java.util.List;

public interface StudentDAO{
    public List<Student> getAllStudents();
    public Student getStudentById(String id);
    public  Student getStudentByName(String name);
    public Student addStudent(Student student);
    public Student updateStudent(Student student);
    public void deleteStudent(Student student);
}
