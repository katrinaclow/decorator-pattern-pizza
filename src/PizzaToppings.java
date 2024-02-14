/**
 * PizzaToppings is an abstract class that extends Pizza and is used to add toppings to the pizza.
 * It contains a reference to the pizza and the name of the topping.
 */
abstract class PizzaToppings extends Pizza {
    Pizza pizza; // Reference to the pizza
    private String toppingName; // Name of the topping

    /**
     * Constructor that initializes the pizza and the topping name.
     *
     * @param pizza       the pizza
     * @param toppingName the name of the topping
     */
    public PizzaToppings(Pizza pizza, String toppingName) {
        this.pizza = pizza;
        this.toppingName = toppingName;
    }

    /**
     * Get the description of the pizza with the topping.
     *
     * @return the description of the pizza with the topping
     */
    public String getDescription() {
        validateToppings();
        if (pizza.getDescription().contains(toppingName)) {
            return pizza.getDescription().replace(toppingName, "Double " + toppingName);
        } else {
            return pizza.getDescription() + ", " + toppingName;
        }
    }

    /**
     * Validates the toppings to ensure that the same topping is not added more than twice.
     */
    public void validateToppings() {
        if (pizza.getDescription().contains("Double " + toppingName))
            throw new IllegalArgumentException("You can't add more than 2 toppings of the same type");
    }

    /**
     * Returns the cost of the pizza with the topping.
     *
     * @return the cost of the pizza with the topping
     */
    public abstract double cost();
}