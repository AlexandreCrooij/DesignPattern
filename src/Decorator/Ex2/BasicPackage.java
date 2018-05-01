package Decorator.Ex2;

public class BasicPackage extends Service {
    @Override
    public String getDescription() {
        return "Basic";
    }

    @Override
    public float getPrice() {
        return 100;
    }
}
