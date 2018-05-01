package Decorator.Ex2;

public class HotelRoomDecorator extends Decorator {
    Service service;
    public HotelRoomDecorator(Service service){
        this.service=service;
    }
    @Override
    public String getDescription() {
        return service.getDescription()+", Hotel Room";
    }

    @Override
    public float getPrice() {
        return 70+service.getPrice();
    }
}
