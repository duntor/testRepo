package patterns.command;

import patterns.EntryPoint;

/**
 * Created by pavel on 09.09.16.
 */
public class CommandInvokerEntryPoint implements EntryPoint{
    Television television = new Television();

    Command turnOnTV = new TurnOnTVCommand(television);
    Command turnOffTv = new TurnOffTVCommand(television);

    @Override
    public void runExample() {
        turnOnTV.execute();
        turnOffTv.execute();
    }
}
