package bai2;

import java.util.Scanner;

public class NhanSu {
    private String maNS;
    private String hoTen;
    private Date ngaySinh;

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân sự: ");
        maNS = sc.nextLine();
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh = new Date();
        ngaySinh.Nhap();
    }

    public void Xuat()
    {
        System.out.print(" Mã nhân sự : "+ maNS
        +"\n Họ tên: "+ hoTen
        +"\n Ngày sinh: ");
        ngaySinh.Xuat();
    }
}
