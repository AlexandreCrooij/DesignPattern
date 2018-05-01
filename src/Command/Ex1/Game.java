package Command.Ex1;

public class Game {

    Command goForward;
    Command goBackwards;
    Command goLeft;
    Command goRight;
    Command lastExecuted;

    public Game(ForwardOnCommand goForward, BackwardsOnCommand goBackwards, LeftOnCommand goLeft, RightOnCommand goRight){
        this.goBackwards=goBackwards;
        this.goForward=goForward;
        this.goLeft=goLeft;
        this.goRight=goRight;
    }

    public void pushKey(int i){
        switch(i){
            case 0:
                goForward.execute();
                lastExecuted=goForward;
                break;
            case 1:
                goBackwards.execute();
                lastExecuted=goBackwards;
                break;
            case 2:
                goLeft.execute();
                lastExecuted=goLeft;
                break;
            case 3:
                goRight.execute();
                lastExecuted=goRight;
                break;
                default:
                    System.out.println("Keybinding doesnt exist yet");
        }
    }

    public void undo(){
        lastExecuted.undo();
    }
}
