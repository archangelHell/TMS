public class Circle extends figure {
    private static final String Name = "Circle";
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    public double getArea() { // формула площади
        double area = Math.PI * radius * radius;
        return area;
    }


    public double getPerimeter() { // формула периметра
        double perimeter = 2 * Math.PI * radius;
        return 0;

    }
    public String getName() {
        return Name;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}