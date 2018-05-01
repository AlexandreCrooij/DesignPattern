package AbstractFactory.Ex2;

public class BMWX5 implements Minivan {
    @Override
    public String getName() {
        return "BMW X5";
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
