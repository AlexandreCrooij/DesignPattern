package Decorator.Ex2;

public class ProfessionalPackage extends Service {
    @Override
    public String getDescription() {
        return "Professional";
    }

    @Override
    public float getPrice() {
        return 300;
    }
}
