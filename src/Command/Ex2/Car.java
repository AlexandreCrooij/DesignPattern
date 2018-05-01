package Command.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Car {
    Command [] onCommands;
    Command [] offCommands;
    List<Command> lastCommands;

    public Car(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        lastCommands = new ArrayList<Command>();
        for(int i=0; i<onCommands.length;i++){
            onCommands[i]=null;
            offCommands[i]=null;
        }
    }

    public void setCommand(int i, Command onCommand, Command offCommand){
        onCommands[i]=onCommand;
        offCommands[i]=offCommand;
    }

    public void onButtonWasPushed(int index){
        onCommands[index].execute();
        lastCommands.add(onCommands[index]);
    }

    public void offButtonWasPushed(int index){
        offCommands[index].execute();
        lastCommands.add(offCommands[index]);
    }

    public void undoButtonWasPushed(){
        lastCommands.get(lastCommands.size()-1).undo();
        lastCommands.remove(lastCommands.size()-1);
    }
}

