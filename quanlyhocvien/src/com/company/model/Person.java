package com.company.model;

public abstract class Person {
    private static int idTemp = 1;
    private int id;
    private String name;
    private int age ;

    public Person( String name, int age) {
        this.id = idTemp ++;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract double getScore();

    public abstract void setScore(double score);

    public abstract double getSalary();

    public abstract void setSalary(double salary);
}
