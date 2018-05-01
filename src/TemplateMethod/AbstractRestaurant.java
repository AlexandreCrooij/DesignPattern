package TemplateMethod;

public abstract class AbstractRestaurant {
    final void serveWater(){
        System.out.println("Serving Water...");
    }
    abstract void prepareVegetables();
    abstract void prepareMainMenu();
    abstract void prepareCheese();
    abstract void prepareDessert();
    abstract void prepareCoffee();
    final void cleanTable(){
        System.out.println("Cleaning Table...");
    }
    void hook(){};
    final void durchgangSimulieren(){
        serveWater();
        prepareVegetables();
        prepareMainMenu();
        prepareCheese();
        prepareDessert();
        prepareCoffee();
        cleanTable();
        hook();
    }
}
