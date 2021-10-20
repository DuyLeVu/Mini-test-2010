package com.company.service;

import com.company.service.impl.PersonManagerImpl;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            PersonManagerImpl personManager = new PersonManagerImpl();
            while (true){
                display();
                System.out.println("Nhập lựa chọn:");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        personManager.add();
                        break;
                    case 2:
                        personManager.delete();
                        break;
                    case 3:
                        personManager.print();
                        break;
                    case 4:
                       personManager.findPersonByName();
                        break;
                    case 5:
                        personManager.update();
                        break;
                    case 6:
                        personManager.sort();
                        break;
                    case 7:
                        personManager.sumCal();
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
}
