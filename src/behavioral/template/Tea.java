package behavioral.template;

/*
Concrete class implements the abstract operations, which are called when the templateMethod() needs them.
*/
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon to Tea");
    }

    @Override
    void hook() {
        System.out.println("Serve with biscuits");
    }
}
