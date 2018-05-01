package TemplateMethod;

public class NewYorkRestaurant extends AbstractRestaurant{
    @Override
    void prepareVegetables() {
        System.out.println("Salat, Möhren, Kraut zubereiten...");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Roastbeef, Tartar zubereiten...");
    }

    @Override
    void prepareCheese() {
        System.out.println("Cheddar Cheese zubereiten...");
    }

    @Override
    void prepareDessert() {
        System.out.println("Brownies mit Eis zubereiten...");
    }

    @Override
    void prepareCoffee() {
        System.out.println("Arrabica Coffee zubereiten...");
    }
}
