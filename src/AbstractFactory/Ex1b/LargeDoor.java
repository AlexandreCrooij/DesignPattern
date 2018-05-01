package AbstractFactory.Ex1b;

public class LargeDoor implements Door {
    @Override
    public String getDescription() {
        return "Large Door";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
