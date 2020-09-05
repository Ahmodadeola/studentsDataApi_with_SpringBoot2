package com.studentsData.students.api;

import com.studentsData.students.model.Student;
import com.studentsData.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/student")
@RestController
public class StudentController {

    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Get http methods controllers

    @GetMapping
    public List<Student> getAll(){
     return studentService.getAllStudents();
    }

    @GetMapping(value = "{id}")
    public Student getById(@PathVariable("id") String id){
        return studentService.getStudent(id);
    }


    //Non-Get http method controllers

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping(value = "{id}")
    public void removeStudent(@PathVariable String id){
        studentService.removeStudent(id);
    }
}
