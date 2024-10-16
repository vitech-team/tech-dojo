package com.vitech.playground.gofpatterns.behavioral.templatemethod;

import com.vitech.playground.gofpatterns.behavioral.templatemethod.model.MeatPizza;
import com.vitech.playground.gofpatterns.behavioral.templatemethod.model.VegetarianPizza;

public class TemplateMethodApp {

    public static void main(String[] args) {
        // Use the Template Method pattern to remove duplicate code
        // when printing two slightly different pizza recipes.

        System.out.println("Vegetarian Pizza recipy:");

        VegetarianPizza vegetarian = new VegetarianPizza();
        vegetarian.makeBase();
        vegetarian.addToppings();
        vegetarian.cook();

        System.out.println("Meat Pizza recipy:");

        MeatPizza meatFeast = new MeatPizza();
        meatFeast.makeBase();
        meatFeast.addToppings();
        meatFeast.cook();
    }
}
