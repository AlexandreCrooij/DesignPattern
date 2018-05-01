package ChainOfResponsibility.Ex2;

public class MailRequest {
    String artDerEmail;

    public MailRequest(String artDerEmail){
        this.artDerEmail=artDerEmail;
    }

    public String getArtDerEmail() {
        return artDerEmail;
    }

    public void setArtDerEmail(String artDerEmail) {
        this.artDerEmail = artDerEmail;
    }
}
