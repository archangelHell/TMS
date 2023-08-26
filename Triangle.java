public class Triangle extends figure {
    private static final String Name = "Triangle";

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA; // сторона 1
        this.sideB = sideB; // сторона 2
        this.sideC = sideC; // сторона 3
    }
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2; // полупериметр триугольника для формулы.
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)); // формула
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA+sideB+sideC; // периметр
        return perimeter;
    }

    public String getName() {
        return Name;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
