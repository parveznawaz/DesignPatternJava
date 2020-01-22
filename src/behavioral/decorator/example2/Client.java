package behavioral.decorator.example2;

public class Client {
    public static void main(String[] args) {
        Shape circle = new RedShapeDecorator(new Circle());
        circle.draw();
    }
}
