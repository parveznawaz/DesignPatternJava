package creational.abstract_factory;

public class Client {
    public static void main(String[] args) {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacGuiFactory();
        } else {
            factory = new WindowsGuiFactory();
        }

        app = new Application(factory);
        app.paint();
    }
}
