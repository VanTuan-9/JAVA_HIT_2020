package Bai1;

public class RunMain
{
    public static void main(String[] args)
    {
        Person DoanXinhGai = new Person("Doan","11/10/2020","Nam","Sờ máy tính");
        Person DiepBueDe = new Person("Điệp","11/10/2020","Nam","Sờ máy tính");
        System.out.println("Name: "+ DoanXinhGai.getName()
                +"\nDate of Birth: "+DoanXinhGai.getDateOfBirth()
                +"\nGender: "+ DoanXinhGai.getGender()
                +"\nHobby: "+DoanXinhGai.getHobby());
        System.out.println("Name: "+ DiepBueDe.getName()
                +"\nDate of Birth: "+DiepBueDe.getDateOfBirth()
                +"\nGender: "+ DiepBueDe.getGender()
                +"\nHobby: "+DiepBueDe.getHobby());
    }
}
