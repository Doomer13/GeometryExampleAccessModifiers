import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

public class Main {

    Shape  rectangle = new Rectangle(5,5);
    Shape circle = new Circle(6.6);

    private static String printArea(Shape shape) {

        return String.format("%s: Площадь = %.2f%n",
                shape.getName(),
                shape.calculateArea());
    }

    @Test
    public void start (){
      System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
      System.out.println("Площадь круга: " + Math.round(circle.calculateArea()*100)/100);

      DecimalFormat df = new DecimalFormat("#.##");
      String formatCircleArea = df.format(circle.calculateArea());
      System.out.println(formatCircleArea);
    }

    @Test
    public void louncher (){
        System.out.println(Main.printArea(circle));
        System.out.println(Main.printArea(rectangle));
    }
}
