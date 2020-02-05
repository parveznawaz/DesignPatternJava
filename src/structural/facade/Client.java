package structural.facade;

public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade(new CPU(), new Memory(), new HardDrive());
        computer.start();
    }
}
