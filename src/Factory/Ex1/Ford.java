package Factory.Ex1;

public class Ford extends Car {
    public Ford(String color){
        super.name = "Ford";
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
