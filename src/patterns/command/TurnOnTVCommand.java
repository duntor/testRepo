package patterns.command;

/**
 * Created by pavel on 11.09.16.
 */
public class TurnOnTVCommand implements Command {
    public TurnOnTVCommand(Television television) {
        this.television = television;
    }

    private Television television;

    @Override
    public void execute() {
        television.turnOn();
    }
}
