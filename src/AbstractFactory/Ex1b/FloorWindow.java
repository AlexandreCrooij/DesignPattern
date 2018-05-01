package AbstractFactory.Ex1b;

public class FloorWindow implements Window {
    @Override
    public String getDescription() {
        return "Floor Window";
    }

    @Override
    public int getPrice() {
        return 40;
    }
}
