package Decorator.Ex2;

public class AdvancedPackage extends Service {
    @Override
    public String getDescription() {
        return "Advanced";
    }

    @Override
    public float getPrice() {
        return 200;
    }
}
