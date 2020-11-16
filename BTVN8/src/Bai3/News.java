package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averagaRate;
    private ArrayList<Integer> rateList;

    public News() {
        averagaRate = 0f;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAveragaRate() {
        return averagaRate;
    }

    public void InPut()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID = ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Title = ");
        title = sc.nextLine();
        System.out.print("PublishDate = ");
        publishDate = sc.nextLine();
        System.out.print("Author = ");
        author = sc.nextLine();
        System.out.print("Content = ");
        content = sc.nextLine();
        rateList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Nhap rate:");
            int a = sc.nextInt();
            rateList.add(a);
        }
    }

    @Override
    public void Display() {
        System.out.println("\t id = " + id +
                "\n\t title = " + title +
                "\n\t publishDate = " + publishDate +
                "\n\t author = " + author +
                "\n\t content = " + content +
                "\n\t averagaRate = " + averagaRate);
    }

    public void Calculate()
    {
        float sum = 0f;
        for (int i = 0; i < 3; i++) {
            sum+=rateList.get(i);
        }
        averagaRate = sum/3;
    }
}
