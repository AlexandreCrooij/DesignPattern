package Decorator.Ex2;

public class WellnessServiceDecorator extends Decorator {
    Service service;
    public WellnessServiceDecorator(Service service){
        this.service=service;
    }
    @Override
    public String getDescription() {
        return service.getDescription() + ", Wellness Pass";
    }

    @Override
    public float getPrice() {
        return 150 + service.getPrice();
    }
}
