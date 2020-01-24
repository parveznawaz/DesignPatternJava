package creational.abstract_factory;

public class MacOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOs button paint");
    }
}
