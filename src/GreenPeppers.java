/**
 * GreenPeppers is a subclass of PizzaToppings that adds Green Peppers to the pizza.
 * When called, it adds "Green Peppers" to the pizza's description and updates the cost accordingly.
 */
class GreenPeppers extends PizzaToppings {
    /**
     * Constructor for GreenPeppers that takes in a Pizza object and sets the description.
     *
     * @param pizza Pizza object to add Green Peppers to.
     */
    public GreenPeppers(Pizza pizza) {
        super(pizza, "Green Peppers");
    }

    /**
     * Overriden method to add the cost of Green Peppers to the pizza.
     *
     * @return double Cost of the pizza with Green Peppers.
     */
    public double cost() {
        return 1.75 + pizza.cost();
    }
}