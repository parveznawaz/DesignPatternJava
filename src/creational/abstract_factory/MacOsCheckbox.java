package creational.abstract_factory;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOs Checkbox paint");
    }
}
