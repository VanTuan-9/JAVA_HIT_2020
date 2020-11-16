package Bai2;

public class Circle implements IShape{
    private double radius;

    final double PI =3.14;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double GetArea() {
        return 2*PI*radius;
    }

    @Override
    public double GetPerimeter() {
        return PI*radius*radius;
    }
}
