package com.studentsData.students.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Student {
    private final String name;
    private final String department;

    @Id
    private String id;

    public Student(@JsonProperty("name") String name, @JsonProperty("department") String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getId() {
        return id;
    }
}
