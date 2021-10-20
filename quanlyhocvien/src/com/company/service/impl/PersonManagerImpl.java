package com.company.service.impl;

import com.company.model.Student;
import com.company.service.GeneralManagerService;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManagerImpl implements GeneralManagerService<Student> {
    private ArrayList<Student> listPerson;


    public PersonManagerImpl() {
        listPerson = new ArrayList<>();
    }


    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên học viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi học viên: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập điểm trung bình của học viên:");
        double score = sc.nextDouble();
        sc.nextLine();
        listPerson.add(new Student(name, age, score));
    }

    @Override
    public int findIndexById(int id) {
        for (int i=0; i<listPerson.size(); i++){
            if (listPerson.get(i).getId() == id) return i;
        }
        return -1;
    }

    @Override
    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Id học viên cần sửa thông tin: ");
        int id = sc.nextInt();
        sc.nextLine();
        int index = findIndexById(id);
        if (index == -1) System.out.println("Học viên cần sửa không có trong danh sách");
        else{
            System.out.print("Nhập tên học viên: ");
            String name = sc.nextLine();
            System.out.print("Nhập tuổi học viên: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập điểm trung bình của học viên:");
            double score = sc.nextDouble();
            sc.nextLine();
            listPerson.get(index).setName(name);
            listPerson.get(index).setAge(age);
            listPerson.get(index).setScore(score);
        }
    }

    @Override
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Id học viên cần xóa : ");
        int id = sc.nextInt();
        sc.nextLine();
        int index = findIndexById(id);
        if (index == -1) System.out.println("Học viên cần xóa không có trong danh sách");
        else
            listPerson.remove(index);
    }

    @Override
    public void print() {
        for (int i=0; i<listPerson.size(); i++){
            System.out.println(listPerson.get(i));
        }
    }

    @Override
    public void findPersonByName() {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Nhập tên học viên cần tìm : ");
        name = sc.nextLine();
        boolean find = false;
        int indexOf = -1;
        for (int i=0; i<listPerson.size(); i++){
            if (listPerson.get(i).getName().equals(name)) {
                find = true;
                indexOf = i;
                break;
            }
        }
        if (find)
            System.out.println("Học viên: " + listPerson.get(indexOf) +" ở vị trí: " +(indexOf+1));
        else {
            System.out.println("Học viên không có trong danh sách");
        }
    }


    @Override
    public void sort() {
        listPerson.sort((s1,s2) -> (int) (s1.getScore() - s2.getScore()));
    }

    public void sumCal(){
        double sum = 0;
        for (int i=0; i<listPerson.size(); i++){
            sum += listPerson.get(i).getScore();
        }
        System.out.println("Điểm trung bình của tất cả học viên = " +sum);
    }
}
