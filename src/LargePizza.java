/**
 * Pizza class for large pizza
 * Concrete component
 */
public class LargePizza extends Pizza {
    /**
     * Constructor
     */
    public LargePizza() {
        description = "Large Pizza";
    }

    /**
     * Cost of medium pizza
     *
     * @return cost of small pizza
     */
    @Override
    public double cost() {
        return 12.15;
    }
}
