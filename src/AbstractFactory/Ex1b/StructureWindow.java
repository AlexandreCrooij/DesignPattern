package AbstractFactory.Ex1b;

public class StructureWindow implements Window {
    @Override
    public String getDescription() {
        return "Structure Window";
    }

    @Override
    public int getPrice() {
        return 60;
    }
}
