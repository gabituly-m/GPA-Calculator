package com.company;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private double credit;
    private double grade;

    public Course(String courseName, double credit, double grade) {
        this.courseName = courseName;
        this.credit = credit;
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getGrade() {
        setGrade(grade);
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", credit=" + credit +
                ", grade=" + grade +
                '}';
    }
}
