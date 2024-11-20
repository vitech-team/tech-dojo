package com.vitech.playground.gofpatterns.behavioral.Memento.gamepad.impl;


import com.vitech.playground.gofpatterns.behavioral.Memento.gamepad.Memento;
import com.vitech.playground.gofpatterns.behavioral.Memento.gamepad.Originator;

public class Game implements Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento save() {
		return new Memento(state);
	}

	public void restore(Memento memento) {
		state = memento.getState();
	}
}
