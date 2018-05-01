package ChainOfResponsibility.Example;
/**
 * Lab Chain of Responsibility Pattern
 * @author egs
 */
public class VicePresidentPPower extends PurchasePower {
    private final double ALLOWABLE = 40 * base;

    public void processRequest(PurchaseRequest request) {
        if( request.getAmount() < ALLOWABLE )
            System.out.println("Vice President will approve $" + request.getAmount());
        else
        if( mySuccessor != null )
            mySuccessor.processRequest(request);
    }
}
