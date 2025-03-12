public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        super("Круг"); // Устанавливаем имя фигуры
        this.radius = radius;
    }

    @Override
    protected  double calculateArea() {
        return Math.PI * radius * radius; // Формула площади круга: πr²
    }
}
