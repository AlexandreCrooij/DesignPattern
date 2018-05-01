package Decorator.Ex2;

public class SaunaFullInclusiveDecorator extends Decorator {
    Service service;
    public SaunaFullInclusiveDecorator(Service service){
        this.service=service;
    }
    @Override
    public String getDescription() {
        return service.getDescription()+", Sauna(All-Inclusive)";
    }

    @Override
    public float getPrice() {
        return 30 + service.getPrice();
    }
}
