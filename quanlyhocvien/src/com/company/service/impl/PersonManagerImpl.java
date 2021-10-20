package com.company.service.impl;

import com.company.model.Person;
import com.company.model.Student;
import com.company.service.GeneralManagerService;

import java.util.ArrayList;
import java.util.Comparator;

public  class PersonManagerImpl implements GeneralManagerService<Person> {

    private ArrayList<Person> listPerson;

    public ArrayList<Person> getListPerson() {
        return listPerson;
    }

    public void setListPerson(ArrayList<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public PersonManagerImpl() {
        listPerson = new ArrayList<>();
    }


    @Override
    public void add(Person person) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập tên học viên: ");
//        String name = sc.nextLine();
//        System.out.print("Nhập tuổi học viên: ");
//        int age = sc.nextInt();
//        sc.nextLine();
//        System.out.print("Nhập điểm trung bình của học viên:");
//        double score = sc.nextDouble();
//        sc.nextLine();
        listPerson.add(person);
    }

    @Override
    public int findIndexById(int id) {
        for (int i=0; i<listPerson.size(); i++){
            if (listPerson.get(i).getId() == id)
                return i;
        }
        return -1;
    }

    @Override
    public void update(int id, Person person){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập Id học viên cần sửa thông tin: ");
//        int id = sc.nextInt();
//        sc.nextLine();
        int index = findIndexById(id);
        if (index == -1) System.out.println("Id không có trong danh sách");
        else{
//            System.out.print("Nhập tên học viên: ");
//            String name = sc.nextLine();
//            System.out.print("Nhập tuổi học viên: ");
//            int age = sc.nextInt();
//            sc.nextLine();
//            System.out.print("Nhập điểm trung bình của học viên:");
//            double score = sc.nextDouble();
//            sc.nextLine();
            listPerson.get(index).setName(person.getName());
            listPerson.get(index).setAge(person.getAge());
//            listPerson.get(index).setScore(score);
        }
    }

    @Override
    public void delete(int id) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập Id học viên cần xóa : ");
//        int id = sc.nextInt();
//        sc.nextLine();
        int index = findIndexById(id);
        if (index == -1) System.out.println("Id cần xóa không có trong danh sách");
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
    public void findPersonByName(String name) {
//        Scanner sc = new Scanner(System.in);
//        String name;
//        System.out.print("Nhập tên học viên cần tìm : ");
//        name = sc.nextLine();
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
            System.out.println(listPerson.get(indexOf) +" ở vị trí: " +(indexOf+1));
        else {
            System.out.println(listPerson.get(indexOf) + "không có trong danh sách");
        }
    }

    @Override
    public void sort() {
        listPerson.sort(Comparator.comparing(Person::getName));
    }

}
