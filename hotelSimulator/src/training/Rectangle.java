package training;

public class Rectangle extends ShapeAbstract {


    @Override
    public int getArea() {
        return 10;
    }

    @Override
    public void message() {
        System.out.println("Rect message");
    }

    @Override
    public void name() {
        System.out.println("Rectangle");
    }
}
