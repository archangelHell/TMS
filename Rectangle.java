public class Rectangle extends figure {
    private static final String NAME = "Rectangle";

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width; //ширина
        this.height = height; //высота
    }


    public double getArea() { //формула площади
        double Area = width * height;
        return Area;
    }
    public double getPerimeter() { //формула периметра
       double perimeter = 2*(width+height);
       return perimeter;
    }
    public String getName() {
        return NAME;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
