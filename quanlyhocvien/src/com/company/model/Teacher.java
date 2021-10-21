package com.company.model;

public class Teacher extends Person {

    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Id= " +getId()
                + "Name= " + getName()
                + "Age= " + getAge()
                + "salary=" + salary +
                '}';
    }

    @Override
    public double getScore() {
        return 0;
    }

    @Override
    public void setScore(double score) {

    }
}
