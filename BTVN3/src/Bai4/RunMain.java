package Bai4;

public class RunMain
{
    public static void main(String[] args)
    {
        Array arr1 = new Array();
        Array arr2 = new Array();
        arr1.InputData();
        arr1.Show();
        arr2.InputData();
        arr2.Show();
        float a =(1.0f * arr1.Sum())/arr1.getN();
        float b = (1.0f * arr2.Sum()) / arr2.getN();
        if(a==b)
            System.out.println("HI A Doan!");
        else
            System.out.println(a > b ? "Mảng arr1 lớn hơn!" : "Mảng arr2 lớn hơn");
    }
}
