package Builder.builder;

import Builder.Product.Pizza;

/**
 * Lab Builder Pattern
 * @author egs
 */
public abstract class PizzaBuilder {

    protected Pizza pizza;

    public void createNewPizzaProduct(String name) {
        pizza = new Pizza(name);
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();

    public Pizza getPizza() {
        return pizza;
    }
}