package com.vitech.playground.gofpatterns.behavioral.visitor.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Bread implements Groceries {

    private final double price;
}
