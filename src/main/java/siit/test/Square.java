package siit.test;

public class Square implements Shape{


    private double l1;
    private String name ="Square";

    public Square(double l1) {
        this.l1 = l1;
    }

    @Override
    public void getPerimeter() {
        System.out.println("Square perimeter");
        double perimeter=0;
        perimeter=4*l1;
        System.out.println(perimeter);

    }

    @Override
    public void getSurfaceArea() {
        System.out.println("Square surface area");
        double area=0;
        area=l1*l1;
        System.out.println(area);

    }

    public String getName() {
        return name;
    }

    public double getL1() {
        return l1;
    }

    @Override
    public String toString() {
        return getName() + " length " + getL1() ;
    }


}
