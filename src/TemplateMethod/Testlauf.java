package TemplateMethod;

public class Testlauf {
    public static void main(String[] args) {
        NewYorkRestaurant newYorkRestaurant = new NewYorkRestaurant();
        SeattleRestaurant seattleRestaurant = new SeattleRestaurant();

        newYorkRestaurant.durchgangSimulieren();
        seattleRestaurant.durchgangSimulieren();
    }
}
