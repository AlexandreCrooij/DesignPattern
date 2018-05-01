package ChainOfResponsibility.Ex1;

public class OberbefehlshaberDPower extends DayPower {
    private final double ALLOWABLE = 4 * base;
    @Override
    public void processRequest(DayRequest request) {
        if (request.getNumberDays()<ALLOWABLE){
            System.out.println("Oberbefehlshaber genehmigt den Antrag...");
        }
        else{
            System.out.println("Es muss eine sitzung mit dem Verteidungsminister einberufen werden...");
        }
    }
}
