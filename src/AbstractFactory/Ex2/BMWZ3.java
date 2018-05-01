package AbstractFactory.Ex2;

public class BMWZ3 implements Coupe {
    @Override
    public String getName() {
        return "BMW Z3";
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
