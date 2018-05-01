package AbstractFactory.Ex1b;

public class House {
    protected Wall southWall;
    protected Wall northWall;
    protected Wall westWall;
    protected Wall eastWall;
    protected Door door;
    protected Window window;

    public House(Wall southWall, Wall northWall, Wall westWall, Wall eastWall, Door door, Window window) {
        this.southWall = southWall;
        this.northWall = northWall;
        this.westWall = westWall;
        this.eastWall = eastWall;
        this.door = door;
        this.window = window;
    }

    public Wall getSouthWall() {
        return southWall;
    }

    public void setSouthWall(Wall southWall) {
        this.southWall = southWall;
    }

    public Wall getNorthWall() {
        return northWall;
    }

    public void setNorthWall(Wall northWall) {
        this.northWall = northWall;
    }

    public Wall getWestWall() {
        return westWall;
    }

    public void setWestWall(Wall westWall) {
        this.westWall = westWall;
    }

    public Wall getEastWall() {
        return eastWall;
    }

    public void setEastWall(Wall eastWall) {
        this.eastWall = eastWall;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public int getPrice(){
        return southWall.getPrice()+westWall.getPrice()+eastWall.getPrice()+northWall.getPrice()+door.getPrice()+window.getPrice();
    }

}
