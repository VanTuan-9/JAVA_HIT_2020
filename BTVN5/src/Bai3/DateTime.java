package Bai3;

import java.util.Scanner;

public class Date {
    private int d;
    private int m;
    private int y;

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\t Ngày = ");    d = sc.nextInt();
        System.out.print("\t Tháng = ");   m = sc.nextInt();
        System.out.print("\t Năm = ");     y = sc.nextInt();
    }
    @Override
    public String toString() {
        return d<10?("0"+d):d
                +m<10?("0"+m):m
                + "" + y;
    }
}
