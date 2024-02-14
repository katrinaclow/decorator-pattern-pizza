/**
 * Mushrooms is a concrete decorator class that extends PizzaToppings.
 * When called, it adds "Mushrooms" to the pizza's description and updates the cost accordingly.
 */
class Onions extends PizzaToppings {
    /**
     * Constructor for Onions that takes in a Pizza object and sets the description.
     *
     * @param pizza Pizza object to add Onions to.
     */
    public Onions(Pizza pizza) {
        super(pizza, "Onions");
    }

    /**
     * Overriden method to add the cost of Onions to the pizza.
     *
     * @return double Cost of the pizza with Onions.
     */
    public double cost() {
        return 1.15 + pizza.cost();
    }
}