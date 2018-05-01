package TemplateMethod;

public class SeattleRestaurant extends AbstractRestaurant {
    @Override
    void prepareVegetables() {
        System.out.println("Rotkohl, Weißkohl und allerlei andere elige Dinge zubereiten...");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Fladenbrot und Tsaziki zubereiten...");
    }

    @Override
    void prepareCheese() {
        System.out.println("Seattle Original Cheese zubereiten...");
    }

    @Override
    void prepareDessert() {
        System.out.println("Seattle Original Cheesecake zubereiten...");
    }

    @Override
    void prepareCoffee() {
        System.out.println("Seattle Coffe zubereiten...");
    }
}
