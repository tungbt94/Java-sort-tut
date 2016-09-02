package model;

import java.util.Comparator;

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

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
       return (int) (o.getScore() - score);
    }

    public static Comparator<Student> studentScoreAndNameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            if(s1.getScore() == s2.getScore()) {
                String s1Name = s1.getName().toLowerCase();
                String s2Name = s2.getName().toLowerCase();
                return s2Name.compareTo(s1Name);
            }else{
                return (int) (s2.getScore() - s1.getScore());
            }
        }
    };

    @Override
    public String toString() {
        return name + "\t" + score;
    }
}
