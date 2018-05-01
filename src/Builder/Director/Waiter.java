package Builder.Director;

import Builder.Product.Pizza;
import Builder.builder.PizzaBuilder;

/**
 * Lab Builder Pattern
 * @author egs
 */
public class Waiter {

    private PizzaBuilder pizzaBuilder;
    public String name;

    public Waiter(String name) {
        this.name = name;
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void constructPizza(String name) {
        pizzaBuilder.createNewPizzaProduct(name);
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

}
