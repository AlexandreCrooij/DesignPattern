package AbstractFactory.Ex1b;

public class DutchHouseFactory implements HouseFactory {
    private House house;
    @Override
    public Wall createWall() {
        return new BrickWall();
    }

    @Override
    public Window createWindow(){
        return new FloorWindow();
    }

    @Override
    public Door createDoor() {
        return new LargeDoor();
    }

    public House createHouse(){
        return new House(createWall(), createWall(),createWall(),createWall(), createDoor(),createWindow());
    }

}
