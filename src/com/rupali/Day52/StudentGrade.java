package com.rupali.Day52;

public class StudentGrade {
    private String name;
    private int grade;
    public StudentGrade(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public static class School {
        public void printStudentDetails(StudentGrade s) {
            System.out.println(s.getName());
            System.out.println(s.getGrade());
        }
        public static void main(String[] args) {
            StudentGrade s1 = new StudentGrade("Rupali", 10);
            School school = new School();
            school.printStudentDetails(s1);
        }
    }
}
