package AbstractFactory.Ex1b;

public class ThinDoor implements Door {
    @Override
    public String getDescription() {
        return "Thin Door";
    }

    @Override
    public int getPrice() {
        return 40;
    }
}
