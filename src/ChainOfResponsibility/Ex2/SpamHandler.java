package ChainOfResponsibility.Ex2;

public class SpamHandler extends Handler {
    @Override
    public void handleRequest(MailRequest mailRequest) {
        if(mailRequest.getArtDerEmail().contains("Spam")){
            System.out.println("This mail is being managed by the Spam Handler");
        }
        else{
            getSuccessor().handleRequest(mailRequest);
        }
    }
}
