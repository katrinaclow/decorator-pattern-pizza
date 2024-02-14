/**
 * Pepperoni is a concrete decorator that extends PizzaToppings.
 * When called, it adds "Pepperoni" to the pizza's description and updates the cost accordingly.
 */
class Pepperoni extends PizzaToppings {
    /**
     * Constructor for Pepperoni that takes in a Pizza object and sets the description.
     *
     * @param pizza Pizza object to add Pepperoni to.
     */
    public Pepperoni(Pizza pizza) {
        super(pizza, "Pepperoni");
    }

    /**
     * returns the cost of the pizza with pepperoni
     *
     * @return the cost of the pizza with pepperoni
     */
    public double cost() {
        return 1.45 + pizza.cost();
    }
}