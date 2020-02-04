package structural.adapter.example1;

public class Client {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("Duck says");
        mallardDuck.quack();
        System.out.println("Turkey says");
        turkeyAdapter.quack();
    }
}
