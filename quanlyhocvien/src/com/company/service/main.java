package com.company.service;

import com.company.model.Student;
import com.company.model.Teacher;
import com.company.service.impl.PersonManagerImpl;
import com.company.service.impl.StudentManagerImpl;
import com.company.service.impl.TeacherManagerImpl;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonManagerImpl personManager = new PersonManagerImpl();
        StudentManagerImpl studentManager = new StudentManagerImpl();
        TeacherManagerImpl teacherManager = new TeacherManagerImpl();
        while (true) {
//            menuDisplay();
//            System.out.println("Nhập lựa chọn:");
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    display();
//                    int obj = sc.nextInt();
//                    switch (obj) {
//                        case 1:
//                            studentManager.add(getStudent());
//                            break;
//                        case 2:
//                            studentManager.add(getTeacher());
//                            break;
//                    }
//                case 2:
//                    System.out.print("Nhập Id cần xóa : ");
//                    int id = sc.nextInt();
//                    sc.nextLine();
//                    personManager.delete(id);
//                    break;
//                case 3:
//                    personManager.print();
//                    break;
//                case 4:
//                    String name;
//                    System.out.print("Nhập tên học viên cần tìm : ");
//                    name = sc.nextLine();
//                    studentManager.findPersonByName(name);
//                    break;
//                case 5:
//                    System.out.print("Nhập Id học viên cần sửa thông tin: ");
//                    int idUpdate = sc.nextInt();
//                    sc.nextLine();
//                    studentManager.update(idUpdate, getStudent());
//                    break;
//                case 6:
//                    studentManager.sort();
//                    break;
//                case 7:
//                    studentManager.sumCal();
//                    break;
//                case 0:
//                    System.exit(0);
//            }
//        }
            display();
            System.out.println("Nhập lựa chọn:");
            int choiceObj = sc.nextInt();
            switch (choiceObj) {
                case 1 -> {
                    displayMenuStudent();
                    System.out.println("Nhập lựa chọn:");
                    int choiceStudent = sc.nextInt();
                    switch (choiceStudent) {
                        case 1 -> studentManager.add(getStudent());
                        case 2 -> {
                            System.out.print("Nhập Id cần xóa : ");
                            int id = sc.nextInt();
                            sc.nextLine();
                            studentManager.delete(id);
                        }
                        case 3 -> studentManager.print();
                        case 4 -> {
                            String name;
                            System.out.print("Nhập tên học viên cần tìm : ");
                            name = sc.nextLine();
                            studentManager.findPersonByName(name);
                        }
                        case 5 -> {
                            System.out.print("Nhập Id học viên cần sửa thông tin: ");
                            int idUpdate = sc.nextInt();
                            sc.nextLine();
                            studentManager.update(idUpdate, getStudent());
                        }
                        case 6 -> studentManager.sort();
                        case 7 -> studentManager.sumCal();
                        case 0 -> System.exit(0);
                    }
                }
                case 2 -> {
                    displayMenuTeacher();
                    System.out.println("Nhập lựa chọn:");
                    int choiceTeacher = sc.nextInt();
                    switch (choiceTeacher) {
                        case 1 -> teacherManager.add(getTeacher());
                        case 2 -> {
                            System.out.print("Nhập Id cần xóa : ");
                            int id = sc.nextInt();
                            sc.nextLine();
                            teacherManager.delete(id);
                        }
                        case 3 -> teacherManager.print();
                        case 4 -> {
                            String name;
                            System.out.print("Nhập tên học viên cần tìm : ");
                            name = sc.nextLine();
                            teacherManager.findPersonByName(name);
                        }
                        case 5 -> {
                            System.out.print("Nhập Id học viên cần sửa thông tin: ");
                            int idUpdate = sc.nextInt();
                            sc.nextLine();
                            teacherManager.update(idUpdate, getStudent());
                        }
                        case 6 -> teacherManager.sort();
                        case 0 -> System.exit(0);
                    }
                }
            }
        }

    }

    public static void display() {
        System.out.println("==================Menu===============");
        System.out.println("1. Học viên");
        System.out.println("2. Giảng viên");
    }

    public static void displayMenuStudent() {
        System.out.println("==================Menu===============");
        System.out.println("1. Thêm học viên");
        System.out.println("2. Xoá học viên");
        System.out.println("3. Hiển thị danh sách học viên");
        System.out.println("4. Tìm kiếm học theo tên");
        System.out.println("5. Sửa học viên theo Id");
        System.out.println("6. Sắp xếp học viên theo điểm tăng dần");
        System.out.println("7. Tính tổng điểm trung bình của các học viên");
        System.out.println("0. Thoát");

    }
    public static void displayMenuTeacher() {
        System.out.println("==================Menu===============");
        System.out.println("1. Thêm giảng viên");
        System.out.println("2. Xoá giảng viên");
        System.out.println("3. Hiển thị danh sách giảng viên");
        System.out.println("4. Tìm kiếm học theo tên");
        System.out.println("5. Sửa giảng viên theo Id");
        System.out.println("6. Sắp xếp giảng viên theo tên");
        System.out.println("0. Thoát");

    }

    public static Student getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên học viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi học viên: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập điểm trung bình của học viên:");
        double score = sc.nextDouble();
        sc.nextLine();
        Student student = new Student(name, age, score);
        return student;
    }

    public static Teacher getTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên giảng viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi giảng viên: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập lương của giảng viên:");
        double salary = sc.nextDouble();
        sc.nextLine();
        Teacher teacher = new Teacher(name, age, salary);
        return teacher;
    }
}
