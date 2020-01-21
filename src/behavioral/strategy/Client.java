package behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteAddStrategy());
        System.out.println(context.executeStrategy(1,2));
    }
}
