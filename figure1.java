import java.awt.*;

public class figure1 {
    public static void main(String[] args) {
        figure[] figure = {new Rectangle(9,14),
                new Triangle(7, 5, 7),
                new Circle(7)};
        for(figure figrs : figure)
            System.out.println(figrs.getName() +" area = " + figrs.getArea() + figrs.getName() + " perimeter = " + figrs.getPerimeter());

    }
}
