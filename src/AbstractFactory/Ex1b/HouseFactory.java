package AbstractFactory.Ex1b;

public interface HouseFactory {
    public Wall createWall();
    public Window createWindow();
    public Door createDoor();
    public House createHouse();
}
