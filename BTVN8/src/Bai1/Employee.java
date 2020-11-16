package Bai1;

public class Employee extends Person{
    private int salary;

    public Employee() {
    }

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void Display() {
        System.out.println("name = "+getName()+"\naddress = "+getAddress()+"\nsalary = "+salary);
    }
}
