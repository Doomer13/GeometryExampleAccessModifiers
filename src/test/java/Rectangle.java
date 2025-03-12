public class Rectangle extends Shape {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        super("Прямоугольник");
        this.length = length;
        this.width = width;
    }

    @Override
    protected double calculateArea() {

        return length*width;
    }
}
