package behavioral.command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    int numberOfCommands;

    public RemoteControl(int numberOfCommands) {
        this.numberOfCommands = numberOfCommands;
        onCommands = new Command[numberOfCommands];
        offCommands = new Command[numberOfCommands];
    }

    public void setCommands(int slotNumber, Command onCommand, Command offCommand) {
        onCommands[slotNumber] = onCommand;
        offCommands[slotNumber] = offCommand;
    }

    public void onButtonWasPushed(int slotNumber) {
        this.onCommands[slotNumber].execute();
    }

    public void offButtonWasPushed(int slotNumber) {
        this.offCommands[slotNumber].execute();
    }
}
