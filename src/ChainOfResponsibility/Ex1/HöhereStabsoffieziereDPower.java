package ChainOfResponsibility.Ex1;

public class HöhereStabsoffieziereDPower extends DayPower {
    private final double ALLOWABLE = 3 * base;
    @Override
    public void processRequest(DayRequest request) {
        if (request.getNumberDays()<ALLOWABLE){
            System.out.println("Höherer Stabsoffizier genehmigt den Antrag...");
        }
        else{
            mySuccessor.processRequest(request);
        }
    }
}
