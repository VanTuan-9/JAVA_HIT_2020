package Bai2;

public class Rectangle implements IShape{

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double GetArea() {
        return length*width;
    }


    @Override
    public double GetPerimeter() {
        return 2*length+2*width;
    }
}
