package Decorator.Ex2;

public class SkiPassDecorator extends Decorator {
    Service service;
    public SkiPassDecorator(Service service){
        this.service=service;
    }
    @Override
    public String getDescription() {
        return service.getDescription()+", SkiPass";
    }

    @Override
    public float getPrice() {
        return 50 + service.getPrice();
    }
}
