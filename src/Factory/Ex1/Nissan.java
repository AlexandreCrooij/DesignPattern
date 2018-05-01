package Factory.Ex1;

public class Nissan extends Car {
    public Nissan(String color){
        super.name = "Nissan";
        super.color=color;
    }
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getName() {
        return name;
    }
}
