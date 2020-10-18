package bai3;

import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private int n;
    private Hang[] hang;
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng hàng: ");
        n = sc.nextInt();
        hang = new Hang[n];
        for (int i = 0; i < n; i++) {
            hang[i] = new Hang();
            System.out.println("\t Nhập hàng thứ "+(i+1)+": ");
            hang[i].Nhap();
        }
    }
    public void Xuat()
    {
        System.out.println("HIỂN THỊ HÀNG");
        for (int i = 0; i < n; i++) {
            System.out.println("\t Hàng "+(i+1)+": ");
            hang[i].Xuat();
        }
    }
}
