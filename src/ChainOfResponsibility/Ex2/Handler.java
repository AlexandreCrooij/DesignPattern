package ChainOfResponsibility.Ex2;

public abstract class Handler {
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }

    abstract public void handleRequest(MailRequest mailRequest);
}
