package bai1;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String nhaXB;
    private int soTrang;
    private double giaTien;

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        maSach = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        tenSach = sc.nextLine();
        System.out.println("Nhập nhà xuất bản: ");
        nhaXB = sc.nextLine();
        System.out.println("Nhập số trang: ");
        soTrang = sc.nextInt();
        System.out.println("Nhập giá tiền: ");
        giaTien = sc.nextDouble();
    }

    public void Xuat()
    {
        System.out.println(" Mã sách: "+maSach
        +"\n Tên sách"+tenSach
        +"\n Nhà xuất bản: "+nhaXB
        +"\n Số trang: "+soTrang
        +"\n Giá tiền: "+giaTien+"\n");
    }
}
