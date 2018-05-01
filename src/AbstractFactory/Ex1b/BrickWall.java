package AbstractFactory.Ex1b;

public class BrickWall implements Wall {
    @Override
    public String getDescription() {
        return "Brick Wall";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
