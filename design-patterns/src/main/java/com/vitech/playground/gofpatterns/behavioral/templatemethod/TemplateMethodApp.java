package com.vitech.playground.gofpatterns.behavioral.templatemethod;

import com.vitech.playground.gofpatterns.behavioral.templatemethod.model.MeatPizza;
import com.vitech.playground.gofpatterns.behavioral.templatemethod.model.Pizza;
import com.vitech.playground.gofpatterns.behavioral.templatemethod.model.VegetarianPizza;

public class TemplateMethodApp {

    public static void main(String[] args) {
        // Use the Template Method pattern to remove duplicate code
        // when printing two slightly different pizza recipes.

        System.out.println("Vegetarian Pizza recipy:");

        Pizza vegetarian = new VegetarianPizza();
        vegetarian.makePizza();

        System.out.println("Meat Pizza recipy:");

        Pizza meatFeast = new MeatPizza();
        meatFeast.makePizza();
    }
}
