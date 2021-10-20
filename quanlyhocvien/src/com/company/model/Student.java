package com.company.model;

public class Student extends Person {
    private double score;

    public Student() {
    }


    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public Student(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id= " +getId()
                + "Name= " + getName()
                + "Age= " + getAge()
                + "score=" + score +
                '}';
    }
}
