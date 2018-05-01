package Factory.Ex2;

public class GlassHouse extends House {
    public GlassHouse() {
        this.name = "Modern German house";
    }

    @Override
    protected Wall createWall() {
        return new Glass();
    }
}
