package com.vitech.playground.gofpatterns.behavioral.strategy.exercise2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File inputTextFile = new File("design-patterns/src/main/resources/gofpatterns/behavioral/strategy/exercise2/Hamlet.txt");

        WebSearchModel model = new WebSearchModel(inputTextFile);
        Snooper snoop = new Snooper(model);

        model.pretendToSearch();
    }
}
