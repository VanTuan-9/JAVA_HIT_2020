package bai2;

import java.util.Scanner;

public class Date {
    private int D;
    private int M;
    private int Y;

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        D = sc.nextInt();
        System.out.println("Nhập tháng: ");
        M = sc.nextInt();
        System.out.println("Nhập năm: ");
        Y = sc.nextInt();
    }

    public void Xuat()
    {
        System.out.println((D<10?"0"+D : D) + "/" + (M<10?"0" + M : M) + "/" + Y);
    }
}
