package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Process p = new Process();
        String courseName;
        double grade, credit;
        int choice = -1;

        while(choice!=0){
            System.out.println("Welcome to the Grade Point Average Calculator!");
            System.out.println("1. Add course");
            System.out.println("2. Show Course");
            System.out.println("3. Calculate GPA");
            System.out.println("0. Exit");

            choice = in.nextInt();
            in.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Please enter Course name, double Credits, double Grade");
                    courseName = in.nextLine();
                    credit = in.nextDouble();
                    System.out.println("Grade out of 4.00");
                    System.out.println("95-100 --> write as 4.00") ;
                    System.out.println("94-90 --> write as 3.67") ;
                    System.out.println("85-89 --> write as 3.33") ;
                    System.out.println("80-84 --> write as 3.00") ;
                    System.out.println("75-79 --> write as 2.67") ;
                    System.out.println("70-74 --> write as 2.33") ;
                    grade = in.nextDouble();
                    Course c = new Course(courseName, credit, grade);
                    p.addCourse(c);
                    break;
                case 2:
                    p.showCourse();
                    break;
                case 3:
                    System.out.println("Please wait, while I am calculating the GPA");
                    p.calculateGPA();
            }
        }
    }
}
