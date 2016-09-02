package main;

import controller.StudentController;

/**
 * Created by tungb on 9/3/2016.
 */
public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.addStudents();
        studentController.sortByStudentScore();
        studentController.showListStudent();
    }
}
