package bai3;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private double donGia;

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hàng: ");
        maHang = sc.nextLine();
        System.out.println("Nhập tên hàng: ");
        tenHang = sc.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = sc.nextDouble();
    }

    public void Xuat()
    {
        System.out.println(" Mã hàng: "+maHang
        +"\n Tên hàng: "+tenHang
        +"\n Đơn giá: "+donGia);
    }
}
