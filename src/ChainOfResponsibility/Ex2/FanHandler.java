package ChainOfResponsibility.Ex2;

public class FanHandler extends Handler {

    @Override
    public void handleRequest(MailRequest mailRequest) {
        if(mailRequest.getArtDerEmail().contains("Fan")){
            System.out.println("This mail is being managed by the Fan Handler");
        }
        else{
            getSuccessor().handleRequest(mailRequest);
        }
    }
}
