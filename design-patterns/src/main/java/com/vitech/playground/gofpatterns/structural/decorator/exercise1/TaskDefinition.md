## Implement a Pizza Price List Using the Decorator Pattern

### Objective:
Create a program that models the price list of a pizza restaurant using the Decorator design pattern. 
The program should allow for the dynamic composition of pizza by adding various toppings to a pizza base. 
Each pizza and its toppings will have individual prices, and the program should calculate and print the total price for each custom pizza. 

The goal is to demonstrate how the Decorator pattern enables flexible extension of pizza objects without altering the core pizza class.

### Requirements:

#### PizzaBase Class:

- Implements the Pizza interface.
- Represents the basic pizza with no toppings.
- Must contain a fixed price for the pizza base.

Example:
- Pizza base: Margherita (base price: $5.00).

#### Topping Decorators:

Implement various toppings (decorators) that also implement the Pizza interface.
Each topping adds to the total price of the pizza and updates the description.

Examples of toppings:
- Cheese: Adds $1.50.
- Pepperoni: Adds $2.00.
- Mushrooms: Adds $1.00.
- Onions: Adds $0.80.

### Decorator Pattern Implementation:

Each topping should "wrap" a Pizza object, allowing the dynamic composition of toppings.
The toppings should be added in a flexible way so that the same pizza can be customized with any combination of toppings.

### Pizza Menu:
The program should build at least three pizzas of your choice, each with a different combination of toppings.
The program should then print the menu with the name and total price of each pizza.

Example menu:
Pizza 1: Margherita with Cheese and Pepperoni - $8.50.
Pizza 2: Margherita with Mushrooms, Onions, and Cheese - $7.30.
Pizza 3: Margherita with Cheese and Mushrooms - $7.50.

### Test Cases:
Ensure that the price is calculated correctly for each pizza.
Test different combinations of toppings to verify that they can be added in any order.
Verify that the description of the pizza is correct based on the toppings added.

### Edge Cases:
Handle cases where no toppings are added (i.e., just the pizza base).
Ensure that multiple instances of the same topping (e.g., double cheese) are handled correctly and priced accordingly.