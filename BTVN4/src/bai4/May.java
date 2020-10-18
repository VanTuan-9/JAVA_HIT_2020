package bai4;

import java.util.Scanner;

public class May {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã máy: ");
        maMay = sc.nextLine();
        System.out.println("Nhập kiểu máy: ");
        kieuMay = sc.nextLine();
        System.out.println("Nhập tình trạng máy: ");
        tinhTrang = sc.nextLine();
    }

    public void Xuat()
    {
        System.out.println(" Mã máy: "+maMay
                           +"\n Kiểu máy: "+kieuMay
                           +"\n Tình trạng máy: "+tinhTrang);
    }
}
