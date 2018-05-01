package State.Ex2;

public class RegisteredState implements State {

    private Meetomat meetomat;

    public RegisteredState(Meetomat meetomat){
        this.meetomat=meetomat;
    }

    @Override
    public void leave() {
        System.out.println("Error");
    }

    @Override
    public void handOver() {
        System.out.println("Error");
    }

    @Override
    public void over() {
        System.out.println("Error");
    }

    @Override
    public void ask() {
        System.out.println("Error");
    }

    @Override
    public void enter() {
        System.out.println("Entering the Meeting...");
        meetomat.setState(meetomat.getInMeetingSate());
    }
}
