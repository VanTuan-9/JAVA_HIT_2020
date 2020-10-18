package bai4;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã QL: ");
        maQL = sc.nextLine();
        System.out.println("Nhập Họ tên QL: ");
        hoTen = sc.nextLine();
    }

    public void Xuat()
    {
        System.out.println(" Mã quản lý: "+maQL
                           +"\n Tên quản lý: "+hoTen);
    }
}
