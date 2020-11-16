package Bai2;

public class RunMain {
    public static void main(String[] args) {
        IShape iShape = new Circle(3);
        System.out.println("s = " +iShape.GetArea()+"\nc = "+iShape.GetPerimeter());
        iShape = new Rectangle(2,3);
        System.out.println("s = "+iShape.GetArea()+"\nc = "+iShape.GetPerimeter());
    }
}
