package Factory.Ex1;

public class VW extends Car {
    public VW(String color){
        super.name = "VW";
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
