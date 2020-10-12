package Bai4;

import java.util.Scanner;

public class Array
{
    private int[] a;
    private int n;

    public Array()
    {
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void InputData()
    {
        Scanner vt = new Scanner(System.in);
        System.out.print("\nNhập số phần tử của mảng: ");
        n = vt.nextInt();
        System.out.println("Nhập mảng:");
        a = new int[n];
        for(int i =0;i<a.length;i++)
        {
            System.out.print("Nhập Ptu a["+i+"]: ");
            a[i] = vt.nextInt();
        }
    }
    public void Show()
    {
        System.out.println("\t\tHIEN THI MANG!");
        for(int i =0;i<a.length;i++)
            System.out.print(a[i]+ " ");
        System.out.println();
    }
    public int Sum()
    {
        int Sum =0;
        for(int i =0;i<a.length;i++)
            Sum+=a[i];
        return Sum;
    }
}
