/**
 * Pizza class is the base class for all pizza types.
 */
public abstract class Pizza {
    String description = "Unknown Pizza"; // Default description

    /**
     * Returns the description of the pizza.
     *
     * @return the description of the pizza.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the cost of the pizza.
     *
     * @return the cost of the pizza.
     */
    public abstract double cost();

    /**
     * Prints the description and cost of the pizza.
     */
    public void prettyPrint() {
        System.out.printf("Pizza Order: " + getDescription() + "\nCost: $%.2f\n\n", cost());
    }
}