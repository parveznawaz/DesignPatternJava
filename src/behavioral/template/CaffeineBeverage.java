package behavioral.template;

// Abstract class contains the template method, and abstract version of operation used in template method
public abstract class CaffeineBeverage {
    // The template method makes use of the primitive operations to implement an algorithm. It is decoupled from
    // the actual implementation of these operation.
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * A hook is a method that is declared in the abstract class,
     * but only given an empty or default implementation.
     * This gives subclasses the ability to “hook into” the algorithm at various points,
     * if they wish; a subclass is also free to ignore the hook.
     */
    void hook() {
    }

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hook();
    }

}
