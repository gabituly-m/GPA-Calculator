package com.company;

import java.util.ArrayList;

public class Process {
    private final ArrayList<Course> courses;

    public Process() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course c){
        courses.add(c);
        System.out.println(c.getCourseName()+" was added. Credits are: "+c.getCredit()+" Grade is: "+c.getGrade());
    }

    public void showCourse(){
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i+1)+". Course name: " +courses.get(i).getCourseName() + " Credits: " + courses.get(i).getCredit()
                    + " Grade: " + courses.get(i).getGrade());
        }
        System.out.println("----------------------------");
        System.out.println("Information about Course(-s) was/were printed");
    }

    public void calculateGPA() {
        double gpa = 0.0;
        double credit = 0;
        double gradePoints=0.0;
        for (Course course : courses) {
            gradePoints += (course.getCredit() * course.getGrade());
            credit += course.getCredit();
        }
        gpa += gradePoints / credit;
        System.out.println("Your Grade Point Average is "+gpa);
    }
}
