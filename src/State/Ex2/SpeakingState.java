package State.Ex2;

public class SpeakingState implements State {

    private Meetomat meetomat;

    public SpeakingState(Meetomat meetomat){
        this.meetomat=meetomat;
    }

    @Override
    public void leave() {
        System.out.println("Leaving Conversation...");
        meetomat.setState(meetomat.getRegisteredState());
    }

    @Override
    public void handOver() {
        System.out.println("Error");
    }

    @Override
    public void over() {
        System.out.println("Speaking time is over...");
        meetomat.setState(meetomat.getInMeetingSate());
    }

    @Override
    public void ask() {
        System.out.println("Error");
    }

    @Override
    public void enter() {
        System.out.println("Error");
    }
}
