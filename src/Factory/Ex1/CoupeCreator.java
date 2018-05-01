package Factory.Ex1;

public class CoupeCreator implements CarCreator {
    @Override
    public Car orderCar(String color) {
        if(color.equalsIgnoreCase("red")){
            return new Aston(color);
        }
        else if(color.equalsIgnoreCase("blue")){
            return new BMW(color);
        }
        else if(color.equalsIgnoreCase("black")){
            return new Porsche(color);
        }else
        return null;
    }
}
