package com.vitech.playground.gofpatterns.behavioral.visitor;

import com.vitech.playground.gofpatterns.behavioral.visitor.model.Bread;
import com.vitech.playground.gofpatterns.behavioral.visitor.model.GroceryList;
import com.vitech.playground.gofpatterns.behavioral.visitor.model.Milk;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VisitorApp {

    public static void main(String[] args) {
        // The Groceries interface is extended by Milk and Bread, with getPrice() and setPrice() methods.
        // We also have the GroceryList class which implements Groceries and has a List<Groceries> groceries field.
        // This returns the sum of the prices of all groceries in the list. The Client handles the main process.
        //
        // The goal is to apply a discount on all groceries, without changing price calculation logic the GroceryList class.

        GroceryList groceryList = new GroceryList();
        groceryList.addGrocery(new Milk(48));
        groceryList.addGrocery(new Bread(20));
        groceryList.addGrocery(new Bread(32));
        log.info("Total price of grocery list: {}", groceryList.getPrice());

        // Using Visitor pattern, apply discount of 5% and print grocery list price again
        log.info("New total price of grocery list: ", groceryList.getPrice());
    }
}
