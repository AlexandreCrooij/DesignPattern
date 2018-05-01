package Factory.Ex1;

public class BMW extends Car {
    public BMW(String color){
        super.name = "BMW";
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
