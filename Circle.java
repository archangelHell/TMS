public class Circle extends figure1 {
    private static final String NAME = "Circle";

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
    public double getPerimeter() { // периметр
        double p = (2 * radius * Math.PI);
        return p;
    }
    public String getName() {
        return NAME;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
