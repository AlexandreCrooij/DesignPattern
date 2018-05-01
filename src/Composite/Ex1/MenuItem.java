package Composite.Ex1;

public class MenuItem extends MenuComponent{
    private String name;

    public MenuItem(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void enterTheField() {
        System.out.println("Player "+name+" enters the field");
    }

    @Override
    public void shoot() {
        System.out.println("Player "+name+" shoots");
    }

    @Override
    public void cry() {
        System.out.println("Player "+name+" cries");
    }

    @Override
    public void simulateAnInjury() {
        System.out.println("Player "+name+" simulates an injury");
    }

    public void print(){
        enterTheField();
        shoot();
        cry();
        simulateAnInjury();
    }
}
