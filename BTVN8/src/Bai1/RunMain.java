package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person person = new Employee("Tuấn","HT",5000);
        person.Display();
        person = new Customer("Linh","NA",10000);
        person.Display();
    }
}
