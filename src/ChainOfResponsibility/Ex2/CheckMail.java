package ChainOfResponsibility.Ex2;

public class CheckMail {
    public static void main(String[] args){
        ComplaintHandler complaintHandler = new ComplaintHandler();
        FanHandler fanHandler = new FanHandler();
        SpamHandler spamHandler = new SpamHandler();
        NewLocHandler newLocHandler = new NewLocHandler();

        spamHandler.setSuccessor(fanHandler);
        fanHandler.setSuccessor(complaintHandler);
        complaintHandler.setSuccessor(newLocHandler);

        spamHandler.handleRequest(new MailRequest("Spam"));
    }
}
