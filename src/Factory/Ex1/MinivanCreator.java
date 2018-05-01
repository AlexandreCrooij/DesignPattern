package Factory.Ex1;

public class MinivanCreator implements CarCreator {
    @Override
    public Car orderCar(String color) {
        if(color.equalsIgnoreCase("red")){
            return new Nissan(color);
        }
        else if(color.equalsIgnoreCase("blue")){
            return new Ford(color);
        }
        else if(color.equalsIgnoreCase("black")){
            return new Audi(color);
        }else
            return null;
    }
}
