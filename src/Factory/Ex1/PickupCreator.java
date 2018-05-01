package Factory.Ex1;

public class PickupCreator implements CarCreator {
    @Override
    public Car orderCar(String color) {
        if(color.equalsIgnoreCase("red")){
            return new VW(color);
        }
        else if(color.equalsIgnoreCase("blue")){
            return new Nissan(color);
        }
        else if(color.equalsIgnoreCase("black")){
            return new Ford(color);
        }else
            return null;
    }
}
