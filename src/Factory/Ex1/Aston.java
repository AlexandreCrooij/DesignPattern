package Factory.Ex1;

public class Aston extends Car {
    public Aston(String color){
        super.name = "Aston";
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
