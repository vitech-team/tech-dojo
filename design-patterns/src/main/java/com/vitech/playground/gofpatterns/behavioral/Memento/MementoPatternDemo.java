package com.vitech.playground.gofpatterns.behavioral.Memento;

import com.vitech.playground.gofpatterns.behavioral.Memento.gamepad.Caretaker;
import com.vitech.playground.gofpatterns.behavioral.Memento.gamepad.impl.Game;
import com.vitech.playground.gofpatterns.behavioral.Memento.gamepad.Memento;

public class MementoPatternDemo {
	public static void main(String[] args) {
		Game game = new Game();
		Caretaker caretaker = new Caretaker();

		game.setState("State #1");
		game.setState("State #2");
		caretaker.backup(game.save());

		game.setState("State #3");
		caretaker.backup(game.save());

		game.setState("State #4");

		System.out.println("Current State: " + game.getState());

		Memento memento1 = caretaker.get(0);
		game.restore(memento1);
		System.out.println("The 1-st saved State: " + game.getState());

		Memento memento2 = caretaker.get(1);
		game.restore(memento2);
		System.out.println("The 2-nd saved State: " + game.getState());

	}
}
