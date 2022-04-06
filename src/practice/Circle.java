package practice;

public class Circle extends Shape{

    private double radius;
    private final double PI = 3.14;
    private double area;

    public Circle(String circle){
        super(circle);
        radius = 3;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double areaOfCircle(){
       return area = PI * (radius * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle("circle");
        circle.setRadius(6.0);
        System.out.println(circle.toString());
        System.out.println("area of this " + circle.getName() + " " + circle.areaOfCircle());


    }

}
