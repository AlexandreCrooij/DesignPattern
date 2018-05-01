package State.Ex2;

public class Meetomat implements State{
    private State inMeetingSate;
    private State registeredState;
    private State speakingState;
    private State waitingToSpeakState;

    State state;

    public Meetomat(){
        inMeetingSate = new InMeetingState(this);
        registeredState = new RegisteredState(this);
        speakingState = new SpeakingState(this);
        waitingToSpeakState = new WaitinToSpeakState(this);
        state = registeredState;
    }

    @Override
    public void leave() {
        state.leave();
    }

    @Override
    public void handOver() {
        state.handOver();
    }

    @Override
    public void over() {
        state.over();
    }

    @Override
    public void ask() {
        state.ask();
    }

    @Override
    public void enter() {
        state.enter();
    }

    public State getInMeetingSate() {
        return inMeetingSate;
    }

    public void setInMeetingSate(State inMeetingSate) {
        this.inMeetingSate = inMeetingSate;
    }

    public State getRegisteredState() {
        return registeredState;
    }

    public void setRegisteredState(State registeredState) {
        this.registeredState = registeredState;
    }

    public State getSpeakingState() {
        return speakingState;
    }

    public void setSpeakingState(State speakingState) {
        this.speakingState = speakingState;
    }

    public State getWaitingToSpeakState() {
        return waitingToSpeakState;
    }

    public void setWaitingToSpeakState(State waitingToSpeakState) {
        this.waitingToSpeakState = waitingToSpeakState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
