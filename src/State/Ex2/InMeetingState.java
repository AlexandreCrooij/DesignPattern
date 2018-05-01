package State.Ex2;

public class InMeetingState implements State {

    private Meetomat meetomat;

    public InMeetingState(Meetomat meetomat){
        this.meetomat=meetomat;
    }

    @Override
    public void leave() {
        System.out.println("Leaving the Meeting...");
        meetomat.setState(meetomat.getRegisteredState());
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
        System.out.println("Asking question...");
        meetomat.setState(meetomat.getWaitingToSpeakState());
    }

    @Override
    public void enter() {
        System.out.println("Error");
    }
}
