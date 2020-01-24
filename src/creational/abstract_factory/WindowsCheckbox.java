package creational.abstract_factory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows checkbox painted");
    }
}
