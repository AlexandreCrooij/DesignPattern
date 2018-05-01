package State.Ex2;

public class WaitinToSpeakState implements State {

    private Meetomat meetomat;

    public WaitinToSpeakState(Meetomat meetomat){
        this.meetomat=meetomat;
    }

    @Override
    public void leave() {
        System.out.println("Error");
    }

    @Override
    public void handOver() {
        System.out.println("Handover conversation...");
       meetomat.setState(meetomat.getSpeakingState());
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
        System.out.println("Error");
    }
}
