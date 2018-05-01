package AbstractFactory.Ex1b;

public class GermanHouseFactory implements HouseFactory {
    @Override
    public Wall createWall() {
        return new GlassWall();
    }

    @Override
    public Window createWindow(){
        return new StructureWindow();
    }

    @Override
    public Door createDoor() {
        return new ThinDoor();
    }

    public House createHouse(){
        return new House(createWall(), createWall(),createWall(),createWall(), createDoor(),createWindow());
    }

}
