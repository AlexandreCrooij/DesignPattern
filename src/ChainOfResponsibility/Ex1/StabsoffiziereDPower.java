package ChainOfResponsibility.Ex1;

public class StabsoffiziereDPower extends DayPower {
    private final double ALLOWABLE = 2 * base;
    @Override
    public void processRequest(DayRequest request) {
        if (request.getNumberDays()<ALLOWABLE){
            System.out.println("Stabsoffizier genehmigt den Antrag...");
        }
        else{
            mySuccessor.processRequest(request);
        }
    }
}
