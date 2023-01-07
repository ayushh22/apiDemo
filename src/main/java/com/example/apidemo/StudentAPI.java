package com.example.apidemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentAPI {
    Map<Integer, Student> stuDB= new HashMap<>();

    @PostMapping("/add_student")
    public String addStudent(@RequestBody() Student student) {
        int rollno= student.rollno;
        stuDB.put(rollno, student);
        return "Student Added";
    }

    @GetMapping("/get_all_student")
    public List<Student> getAllStudent() {
        List<Student> lst= new ArrayList<>();
        for(Map.Entry<Integer,Student> studentEntry: stuDB.entrySet()) {
            int rollno= studentEntry.getKey();
            Student s= studentEntry.getValue();
            lst.add(s);
        } return lst;
    }

    @GetMapping("/get_by_rollno")
    public Student getByRollno(@RequestParam("rollno") int rollno) {
        return stuDB.get(rollno);
    }
}


