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
            display();
            System.out.println("Nhập lựa chọn:");
            int choiceObj = sc.nextInt();
            switch (choiceObj) {
                case 1:
                    displayMenuStudent();
                    System.out.println("Nhập lựa chọn:");
                    int choiceStudent = sc.nextInt();
                    switch (choiceStudent) {
                        case 1:
//                            personManager.add(getStudent());
                            studentManager.add(getStudent());
                            break;
                        case 2:
                            System.out.print("Nhập Id cần xóa : ");
                            int id = sc.nextInt();
                            sc.nextLine();
                            studentManager.delete(id);
                            break;
                        case 3:
                            studentManager.print();
                            break;
                        case 4:
                            String name;
                            System.out.print("Nhập tên học viên cần tìm : ");
                            name = sc.nextLine();
                            studentManager.findPersonByName(name);
                            break;
                        case 5:
                            System.out.print("Nhập Id học viên cần sửa thông tin: ");
                            int idUpdate = sc.nextInt();
                            sc.nextLine();
                            studentManager.update(idUpdate, getStudent());
                            break;
                        case 6:
                            studentManager.sortByScore();
                            break;
                        case 7:
                            studentManager.calScore();
                            break;
                        case 0:
                            System.exit(0);
                    }
                    break;
                case 2:
                    displayMenuTeacher();
                    System.out.println("Nhập lựa chọn:");
                    int choiceTeacher = sc.nextInt();
                    switch (choiceTeacher) {
                        case 1:
                            teacherManager.add(getTeacher());
                            break;
                        case 2:
                            System.out.print("Nhập Id cần xóa : ");
                            int id = sc.nextInt();
                            sc.nextLine();
                            teacherManager.delete(id);
                            break;
                        case 3:
                            teacherManager.print();
                            break;
                        case 4:
                            String name;
                            System.out.print("Nhập tên học viên cần tìm : ");
                            name = sc.nextLine();
                            teacherManager.findPersonByName(name);
                            break;
                        case 5:
                            System.out.print("Nhập Id học viên cần sửa thông tin: ");
                            int idUpdate = sc.nextInt();
                            sc.nextLine();
                            teacherManager.update(idUpdate, getStudent());
                            break;
                        case 6:
                            teacherManager.sortByName();
                            break;
                        case 0:
                            System.exit(0);
                    }
                    break;
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
