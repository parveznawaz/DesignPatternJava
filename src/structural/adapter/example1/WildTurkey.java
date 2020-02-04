package structural.adapter.example1;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Wild Turkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("Wild Turkey fly");
    }
}
