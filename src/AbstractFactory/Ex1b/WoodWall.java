package AbstractFactory.Ex1b;

public class WoodWall implements Wall {
    @Override
    public String getDescription() {
        return "Wood Wall";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
