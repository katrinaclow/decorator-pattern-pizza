/**
 * Pizza class for medium pizza
 * Concrete component
 */
public class MediumPizza extends Pizza {
    /**
     * Constructor
     */
    public MediumPizza() {
        description = "Medium Pizza";
    }

    /**
     * Cost of medium pizza
     *
     * @return cost of small pizza
     */
    @Override
    public double cost() {
        return 6.95;
    }
}
