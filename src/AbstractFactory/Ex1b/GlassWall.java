package AbstractFactory.Ex1b;

public class GlassWall implements Wall {
    @Override
    public String getDescription() {
        return "Glass Wall";
    }

    @Override
    public int getPrice() {
        return 60;
    }
}
