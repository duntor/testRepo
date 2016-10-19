package patterns.command;

/**
 * Created by pavel on 11.09.16.
 */
public class TurnOffTVCommand implements Command {

    public TurnOffTVCommand(Television television) {
        this.television = television;
    }

    private Television television;

    @Override
    public void execute() {
        television.turnOff();
    }
}
