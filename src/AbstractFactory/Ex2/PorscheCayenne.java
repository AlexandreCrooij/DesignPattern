package AbstractFactory.Ex2;

public class PorscheCayenne implements Coupe {
    @Override
    public String getName() {
        return "Porsche Cayenne";
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
