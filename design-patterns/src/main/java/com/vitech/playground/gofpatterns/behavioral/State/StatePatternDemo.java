package com.vitech.playground.gofpatterns.behavioral.State;

import com.vitech.playground.gofpatterns.behavioral.State.abstractState.Door;
import com.vitech.playground.gofpatterns.behavioral.State.abstractState.State;
import com.vitech.playground.gofpatterns.behavioral.State.abstractState.impl.CloseState;
import com.vitech.playground.gofpatterns.behavioral.State.abstractState.impl.OpenState;

public class StatePatternDemo {
	public static void main(String[] args) {
		Door door = new Door();
		
		State open = new OpenState();
		open.doAction(door);
		System.out.println(door.getState());

		State close = new CloseState();
		close.doAction(door);
		System.out.println(door.getState());
	}
}
