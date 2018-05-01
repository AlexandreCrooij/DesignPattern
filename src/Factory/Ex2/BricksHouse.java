package Factory.Ex2;

public class BricksHouse extends House {

    public BricksHouse() {
        this.name = "Typical dutch house";
    }

    @Override
    protected Wall createWall() {
        return new Bricks();
    }


}
