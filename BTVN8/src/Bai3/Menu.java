package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);
    public static void InsertNews(ArrayList<News> newsArrayList)
    {
        System.out.print("Nhap so new: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            News news = new News();
            news.InPut();
            newsArrayList.add(news);
        }
    }

    public static void ViewListNews(ArrayList<News> newsArrayList)
    {
        for (int i = 0; i < newsArrayList.size(); i++) {
            System.out.println("New "+(i+1));
            newsArrayList.get(i).Display();
        }
    }

    public static void AverageNews(ArrayList<News> newsArrayList)
    {
        for (int i = 0; i < newsArrayList.size(); i++) {
            System.out.println("New "+(i+1));
            newsArrayList.get(i).Calculate();
            newsArrayList.get(i).Display();
        }
    }
    public static void main(String[] args) {
        ArrayList<News> newsArrayList= new ArrayList<>();
        do {
            int chon;
            System.out.println("1. Insert news\n" +
                    "2. View list news\n" +
                    "3. Average rate\n" +
                    "4. Exit");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            switch (chon)
            {
                case 1: InsertNews(newsArrayList);  break;
                case 2: ViewListNews(newsArrayList);    break;
                case 3: AverageNews(newsArrayList); break;
                case 4: System.exit(0);
                default:
                    System.out.println("Nhap sai!");
            }
        }
        while (true);
    }
}
