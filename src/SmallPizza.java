/**
 * Pizza class for small pizza
 * Concrete component
 */
public class SmallPizza extends Pizza {
    /**
     * Constructor
     */
    public SmallPizza() {
        description = "Small Pizza";
    }

    /**
     * Cost of small pizza
     *
     * @return cost of small pizza
     */
    @Override
    public double cost() {
        return 4.45;
    }
}
