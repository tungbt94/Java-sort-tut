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
        studentArrayList.add(new Student("A", 8));
        studentArrayList.add(new Student("B", 10));
        studentArrayList.add(new Student("C", 9));
        studentArrayList.add(new Student("D", 8));
    }

    public void sortByStudentScore() {
        Collections.sort(studentArrayList);
    }

    public void sortByStudentScoreAndName(){
        Collections.sort(studentArrayList,Student.studentScoreAndNameComparator);
    }

    public void showListStudent() {
        System.out.println("List student:");
        for (Student s : studentArrayList)
            System.out.println(s.toString());
    }

    public void showTop3Student(){
        System.out.println("Top 3 student:");
        for(int i = 0; i < 3; i++)
            System.out.println(studentArrayList.get(i).toString());
    }
}
