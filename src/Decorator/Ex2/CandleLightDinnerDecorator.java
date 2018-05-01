package Decorator.Ex2;

public class CandleLightDinnerDecorator extends Decorator {
    Service service;
    public CandleLightDinnerDecorator(Service service){
        this.service = service;
    }
    @Override
    public String getDescription() {
        return service.getDescription()+", Candle Light Dinner for 2";
    }

    @Override
    public float getPrice() {
        return 80 + service.getPrice();
    }
}
