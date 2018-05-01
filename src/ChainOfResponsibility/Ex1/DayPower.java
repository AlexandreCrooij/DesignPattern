package ChainOfResponsibility.Ex1;

public abstract class DayPower {

    protected final double base = 10;

    protected DayPower mySuccessor;

    public void setSuccessor(DayPower successor){
        this.mySuccessor = successor;
    }

    abstract public void processRequest(DayRequest request);

    /**
     * @uml.property  name="mySuccessor"
     * @uml.associationEnd  inverse="purchasePower1:PurchasePower"
     */

}
