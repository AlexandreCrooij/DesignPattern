package Command.Ex1;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        BackwardsOnCommand backwardsOnCommand = new BackwardsOnCommand(car);
        ForwardOnCommand forwardOnCommand = new ForwardOnCommand(car);
        LeftOnCommand leftOnCommand = new LeftOnCommand(car);
        RightOnCommand rightOnCommand = new RightOnCommand(car);
        Game game = new Game(forwardOnCommand, backwardsOnCommand, leftOnCommand, rightOnCommand);
        // TODO SETUP
        game.pushKey(2);
        game.pushKey(2);
        game.pushKey(3);
        game.pushKey(2);
        game.pushKey(0);
        game.pushKey(1);
        game.undo();
    }

}
