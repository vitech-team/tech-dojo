package com.vitech.playground.gofpatterns.behavioral.State.abstractState.impl;

import com.vitech.playground.gofpatterns.behavioral.State.abstractState.Door;
import com.vitech.playground.gofpatterns.behavioral.State.abstractState.State;

public class OpenState implements State {

	public void doAction(Door door) {
		door.setState(this);
	}

	public String toString() {
		return "Door is opened.";
	}
}
