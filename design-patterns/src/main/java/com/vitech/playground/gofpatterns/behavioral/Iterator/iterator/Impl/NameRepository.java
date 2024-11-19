package com.vitech.playground.gofpatterns.behavioral.Iterator.iterator.Impl;

import com.vitech.playground.gofpatterns.behavioral.Iterator.iterator.Iterable;
import com.vitech.playground.gofpatterns.behavioral.Iterator.iterator.Iterator;


public class NameRepository implements Iterable {
	public String[] names;

	public NameRepository(String[] names) {
		this.names = names;
	}

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index;
		@Override
		public boolean hasNext() {
			return index < names.length;
		}
		@Override
		public Object next() {
			return names[index++];
		}
	}
}


