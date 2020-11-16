package Bai1;

public class Customer extends Person{
    private int balance;

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    public Customer(int balance) {
        this.balance = balance;
    }

    @Override
    public void Display() {
        System.out.println("name"+getName()+"\naddress = "+getAddress()+"\nbalance = "+balance);
    }
}
