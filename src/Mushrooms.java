/**
 * Mushrooms is a subclass of PizzaToppings that adds Black Olives to the pizza.
 * When called, it adds "Mushrooms" to the pizza's description and updates the cost accordingly.
 */
class Mushrooms extends PizzaToppings {
    /**
     * Constructor for Mushrooms that takes in a Pizza object and sets the description.
     *
     * @param pizza Pizza object to add Mushrooms to.
     */
    public Mushrooms(Pizza pizza) {
        super(pizza, "Mushrooms");
    }

    /**
     * Overriden method to add the cost of Mushrooms to the pizza.
     *
     * @return double Cost of the pizza with Mushrooms.
     */
    public double cost() {
        return 1.45 + pizza.cost();
    }
}