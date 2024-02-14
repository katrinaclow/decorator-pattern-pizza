/**
 * BlackOlives is a subclass of PizzaToppings that adds Black Olives to the pizza.
 * When called, it adds "Black Olives" to the pizza's description and updates the cost accordingly.
 */
class BlackOlives extends PizzaToppings {
    /**
     * Constructor for BlackOlives that takes in a Pizza object and sets the description.
     *
     * @param pizza Pizza object to add Black Olives to.
     */
    public BlackOlives(Pizza pizza) {
        super(pizza, "Black Olives");
    }

    /**
     * Overriden method to add the cost of Black Olives to the pizza.
     *
     * @return double Cost of the pizza with Black Olives.
     */
    public double cost() {
        return 2.05 + pizza.cost();
    }
}