package training;

public class Triangle extends ShapeAbstract {

    public void name() {
        System.out.println("Triangle");
    }

    public void message() {
        //super.message();
        System.out.println("tri message");
    }


    @Override
    public int getArea() {
        return 5;
    }
}
