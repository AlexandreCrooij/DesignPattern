package AbstractFactory.Ex2;

public class VWScirocco implements Coupe {
    @Override
    public String getName() {
        return "VW Scirocco";
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
