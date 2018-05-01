package ChainOfResponsibility.Ex2;

public class NewLocHandler extends Handler {
    @Override
    public void handleRequest(MailRequest mailRequest) {
        if(mailRequest.getArtDerEmail().contains("NewLoc")){
            System.out.println("This mail is being managed by the NewLoc Handler");
        }
        else{
            System.out.println("Goes into Trash");
        }
    }
}
