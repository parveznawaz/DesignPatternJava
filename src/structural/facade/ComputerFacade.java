package structural.facade;

public class ComputerFacade {
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hardDrive;

    public ComputerFacade(CPU processor, Memory ram, HardDrive hardDrive) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public void start() {
        processor.freeze();
        ram.load();
        processor.jump(100);
        processor.execute();
    }

}
