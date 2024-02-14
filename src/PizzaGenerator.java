class PizzaGenerator {
    public static void main(String[] args) {
        // Large pizza with onion and mushrooms
        Pizza pizza1 = new LargePizza();
        pizza1 = new Onions(pizza1);
        pizza1 = new Mushrooms(pizza1);
        pizza1.prettyPrint();

        // Small pizza with double bacon and mushrooms
        Pizza pizza2 = new SmallPizza();
        pizza2 = new Bacon(pizza2);
        pizza2 = new Mushrooms(pizza2);
        pizza2 = new Bacon(pizza2);
        pizza2.prettyPrint();

        // Medium pizza with black olives and sausage
        Pizza pizza3 = new MediumPizza();
        pizza3 = new BlackOlives(pizza3);
        pizza3 = new Sausage(pizza3);
        pizza3.prettyPrint();
    }
}
