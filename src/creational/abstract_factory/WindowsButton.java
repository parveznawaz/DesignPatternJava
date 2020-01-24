package creational.abstract_factory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows button painted");
    }
}
