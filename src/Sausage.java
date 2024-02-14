/**
 * Sausage is a concrete decorator class that extends PizzaToppings.
 * When called, it adds "Sausage" to the pizza's description and updates the cost accordingly.
 */
class Sausage extends PizzaToppings {
    /**
     * Constructor for Sausage that takes in a Pizza object and sets the description.
     *
     * @param pizza Pizza object to add Sausage to.
     */
    public Sausage(Pizza pizza) {
        super(pizza, "Sausage");
    }

    /**
     * Overriden method to add the cost of Sausage to the pizza.
     *
     * @return double Cost of the pizza with Sausage.
     */
    public double cost() {
        return 2.95 + pizza.cost();
    }
}