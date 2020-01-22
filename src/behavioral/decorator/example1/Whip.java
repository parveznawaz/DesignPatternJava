package behavioral.decorator.example1;

public class Whip extends CondamintDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipe";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.08;
    }
}
