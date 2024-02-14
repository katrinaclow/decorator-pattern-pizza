/**
 * Bacon is a concrete decorator that extends PizzaToppings.
 * When called, it adds "Bacon" to the pizza's description and updates the cost accordingly.
 */
class Bacon extends PizzaToppings {
    /**
     * Constructor for Bacon that takes in a Pizza object and sets the description.
     *
     * @param pizza Pizza object to add Bacon to.
     */
    public Bacon(Pizza pizza) {
        super(pizza, "Bacon");
    }

    /**
     * returns the cost of the pizza with bacon
     *
     * @return the cost of the pizza with bacon
     */
    public double cost() {
        return 3.45 + pizza.cost();
    }
}