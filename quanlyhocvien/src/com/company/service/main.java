package com.company.service;

import com.company.model.Student;
import com.company.service.impl.PersonManagerImpl;
import com.company.service.impl.StudentManagerImpl;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StudentManagerImpl studentManager = new StudentManagerImpl();
            while (true){
                display();
                System.out.println("Nhập lựa chọn:");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        studentManager.add(getStudent());
                        break;
                    case 2:
                        System.out.print("Nhập Id học viên cần xóa : ");
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
                        studentManager.update(idUpdate,getStudent());
                        break;
                    case 6:
                        studentManager.sort();
                        break;
                    case 7:
                        studentManager.sumCal();
                        break;
                    case 0:
                        System.exit(0);
                }
            }

        }
        public static void display(){
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

        public static Student getStudent(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập tên học viên: ");
            String name = sc.nextLine();
            System.out.print("Nhập tuổi học viên: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập điểm trung bình của học viên:");
            double score = sc.nextDouble();
            sc.nextLine();
            Student student = new Student(name,age,score);
            return student;
        }
}
