package Bai2;

public class Dog {
    private String name;
    private int MP = 100;
    public void InputName(String name)
    {
        this.name = name;
    }
    public void ShowMP()
    {
        System.out.println("MP = "+MP);
    }
    public void Bark()
    {
        if(name != "")
        {
            System.out.println(name+" sủa!");
            MP = MP-20;
        }
        else
        {
            System.out.println("Bạn chưa nhập tên!");
        }
    }

}
