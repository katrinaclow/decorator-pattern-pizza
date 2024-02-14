# Decorator Pattern

A pizza shop sells three sizes of pizza: small, medium and large. Each of these can be
purchased with different toppings. Write a program that uses the Decorator Pattern to
create a pizza of a given size with any mix toppings. The pizza object should have
methods for describing the pizza and calculating its total cost. The following tables show
the prices of the different sizes and toppings

| Size   | Price   |
|--------|---------|
| Small  | S$4.45  |
| Medium | S$6.95  |
| Large  | S$12.15 |


| Toppings      | Price |
|---------------|-------|
| Pepperoni     | $1.45 |
| Mushrooms     | $2.05 |
| Onions        | $1.15 |
| Sausage       | $2.95 |
| Bacon         | $3.45 |
| Black olive   | $2.05 |
| Green peppers | $1.75 |


Write a test class to create the following pizzas, displaying the pizza type and final price.
1. Large pizza with onion and mushrooms
2. Small pizza with bacon, mushrooms and bacon
3. Medium pizza with olives and sausage

**Optional:** Write a prettyPrint() method that finds if a topping has been repeated (twice)
and instead of repeating the topping name writes “double topping_name”.
