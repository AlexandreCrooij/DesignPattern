package ChainOfResponsibility.Example;
/**
 * Lab Chain of Responsibility Pattern
 * @author egs
 */
public class ManagerPPower extends PurchasePower {
    private final double ALLOWABLE = 10 * base;

    public void processRequest(PurchaseRequest request ) {
        if( request.getAmount() < ALLOWABLE )
            System.out.println("Manager will approve $"+ request.getAmount());
        else
        if( mySuccessor != null)
            mySuccessor.processRequest(request);
    }
}