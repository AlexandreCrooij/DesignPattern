package ChainOfResponsibility.Example;
/**
 * Lab Chain of Responsibility Pattern
 * @author egs
 */
public class DirectorPPower extends PurchasePower {
    private final double ALLOWABLE = 20 * base;

    public void processRequest(PurchaseRequest request ) {
        if( request.getAmount() < ALLOWABLE )
            System.out.println("Director will approve $"+ request.getAmount());
        else
        if( mySuccessor != null)
            mySuccessor.processRequest(request);
    }
}
