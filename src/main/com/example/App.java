package com.student.app;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Student " + i + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("CAT (30M): ");
            double cat = sc.nextDouble();
            System.out.print("Assignment (20M): ");
            double assign = sc.nextDouble();
            System.out.print("FAT (50M): ");
            double fat = sc.nextDouble();

            students.add(new Student(name, cat, assign, fat));
        }

        Student topper = students.get(0);
        System.out.println("\n--- Performance Insights ---");
        for (Student s : students) {
            System.out.println(s.name + " | Total: " + s.getTotal() + " | GPA: " + s.getGPA() + " | Grade: " + s.getGrade());
            if (s.getTotal() > topper.getTotal()) topper = s;
        }

        System.out.println("\nTOPPER: " + topper.name + " with " + topper.getTotal() + " marks.");
    }
}

class Student {
    String name;
    double total;

    public Student(String name, double cat, double assign, double fat) {
        this.name = name;
        this.total = cat + assign + fat;
    }

    public double getTotal() { return total; }

    public double getGPA() { return total / 10.0; }

    public String getGrade() {
        if (total >= 90) return "S";
        if (total >= 80) return "A";
        if (total >= 70) return "B";
        if (total >= 60) return "C";
        if (total >= 50) return "D";
        return "F";
    }
}

