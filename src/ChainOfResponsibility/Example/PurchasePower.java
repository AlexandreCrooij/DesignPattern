package ChainOfResponsibility.Example;
/**
 * Lab Chain of Responsibility Pattern
 * @author egs
 */
public abstract class PurchasePower {

    protected final double base = 500;

    public void setSuccessor(PurchasePower successor){
        this.mySuccessor = successor;
    }

    abstract public void processRequest(PurchaseRequest request);

    /**
     * @uml.property  name="mySuccessor"
     * @uml.associationEnd  inverse="purchasePower1:PurchasePower"
     */
    protected PurchasePower mySuccessor;
}
