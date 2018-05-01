package ChainOfResponsibility.Ex1;

public class HauptLeuteDPower extends DayPower {
    private final double ALLOWABLE = 1 * base;

    @Override
    public void processRequest(DayRequest request) {
        if (request.getNumberDays()<ALLOWABLE){
            System.out.println("Hauptleutnant genehmigt den Antrag...");
        }
        else{
            mySuccessor.processRequest(request);
        }
    }
}
