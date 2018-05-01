package Factory.Ex1;

public class Porsche extends Car {
    public Porsche(String color){
        super.name = "Porsche";
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
