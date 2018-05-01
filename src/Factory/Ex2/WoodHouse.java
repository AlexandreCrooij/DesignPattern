package Factory.Ex2;

public class WoodHouse extends House {
    public WoodHouse() {
        this.name = "Swiss wood chalet";
    }

    @Override
    protected Wall createWall() {
        return new Wood();
    }
}
