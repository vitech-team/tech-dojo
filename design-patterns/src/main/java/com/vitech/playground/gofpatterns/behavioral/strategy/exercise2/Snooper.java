package com.vitech.playground.gofpatterns.behavioral.strategy.exercise2;

public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        model.addQueryObserver(query -> System.out.println("Query: " + query));
    }
}
