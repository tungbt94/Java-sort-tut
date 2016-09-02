package controller;

import model.Student;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by tungb on 9/3/2016.
 */
public class StudentController {
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public StudentController() {
        studentArrayList = new ArrayList<>();
    }

    public void addStudents() {
        studentArrayList.add(new Student("A", 9));
        studentArrayList.add(new Student("B", 10));
        studentArrayList.add(new Student("C", 8));
    }

    public void sortByStudentScore() {
        Collections.sort(studentArrayList);
    }

    public void showListStudent() {
        System.out.println("List student:");
        for (Student s : studentArrayList)
            System.out.println(s.toString());
    }
}
