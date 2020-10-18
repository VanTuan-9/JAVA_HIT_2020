package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> sach=new ArrayList<Sach>();
        int n;
        Sach a = new Sach();
        System.out.println("Nhập số lượng sách: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\t Nhập sách thứ"+(i+1)+": ");
            a.Nhap();
            sach.add(a);
        }
        System.out.println("\nHIEN THI");
        for (int i = 0; i < n; i++) {
            System.out.println("\t Sách "+(i+1)+": ");
            sach.get(i).Xuat();
        }
    }
}
