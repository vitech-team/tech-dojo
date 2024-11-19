package com.vitech.playground.gofpatterns.behavioral.Memento.gamepad;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	private List<Memento> mementoList = new ArrayList<>();

	public void backup(Memento memento)	{
		mementoList.add(memento);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}
}
