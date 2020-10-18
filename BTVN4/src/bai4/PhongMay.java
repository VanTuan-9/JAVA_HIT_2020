package bai4;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x;
    private May[] y;
    private int n;

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã phòng: ");
        maPhong = sc.nextLine();
        System.out.println("Nhập tên phòng: ");
        tenPhong = sc.nextLine();
        System.out.println("Nhập diện tích: ");
        dienTich = sc.nextDouble();
        x = new QuanLy();
        x.Nhap();
        System.out.println("Nhập số lượng máy tính: ");
        n = sc.nextInt();
        System.out.println("\t NHAP THONG TIN "+n+" MAY TÍNH");
        y = new May[n];
        for (int i = 0; i < n; i++) {
            y[i] = new May();
            System.out.println("Nhập máy thứ"+(i+1)+": ");
            y[i].Nhap();
        }
    }
    public void Xuat()
    {
        System.out.println(" Mã phòng: "+maPhong
        +"\n Tên phòng: "+tenPhong
        +"\n Diện tích: "+dienTich);
        x.Xuat();
        System.out.println("THÔNG TIN "+n+" MÁY TÍNH");
        for (int i = 0; i < n; i++) {
            System.out.println("\t Máy thứ "+(i+1)+": ");
            y[i].Xuat();
        }
    }
}
