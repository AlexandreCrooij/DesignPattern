package Factory.Ex1;

public class Audi extends Car {
    public Audi(String color){
        super.name = "Audi";
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
