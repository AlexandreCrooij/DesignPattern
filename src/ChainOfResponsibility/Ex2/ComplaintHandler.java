package ChainOfResponsibility.Ex2;

public class ComplaintHandler extends Handler {
    @Override
    public void handleRequest(MailRequest mailRequest) {
        if(mailRequest.getArtDerEmail().contains("Complaint")){
            System.out.println("This mail is being managed by the Complaint Handler");
        }
        else{
            getSuccessor().handleRequest(mailRequest);
        }
    }
}
