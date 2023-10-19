public class Triangle extends figure1 {
    private static final String NAME = "Triangle";

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getArea() {
        double p = (sideA + sideB + sideC) / 2; // полупериметр
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)); // формула
        return area;
    }

    public String getName() {
        return NAME;
    }
    public double getPerimeter(){ // периметр
        double p1 = (sideA+sideB+sideC);
        return p1;
    }
    public double SideA() {
        return sideA;
    }

    public void SideA(double sideA) {
        this.sideA = sideA;
    }
    public double SideB() {
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
