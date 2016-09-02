package model;

/**
 * Created by tungb on 9/3/2016.
 */
public class Student implements Comparable<Student> {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
       return (int) (o.getScore() - score);
    }

    @Override
    public String toString() {
        return name + "\t" + score;
    }
}
