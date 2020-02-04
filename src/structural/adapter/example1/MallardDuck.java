package structural.adapter.example1;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Mallard duck quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck fly");
    }
}
