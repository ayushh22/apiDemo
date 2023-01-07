package com.example.apidemo;

public class Student {
    public int rollno;
    public String name;
    public int marks;

    public Student() { };
    public Student(int rollno, String name, int marks) {
        this.name= name;
        this.rollno= rollno;
        this.marks= marks;
    }
}
