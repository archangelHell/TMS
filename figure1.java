public class figure1 extends figure2 {
    public static void main(String[] args) {
        figure1[] figure = {new Rectangle(10, 14),
                new Triangle(8, 8, 8),
                new Circle(12)};

        for(figure2 fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea() + "- perimeter =" + fig.getPerimeter());
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
    public double getPerimeter(){
        return 0;
    }
}


