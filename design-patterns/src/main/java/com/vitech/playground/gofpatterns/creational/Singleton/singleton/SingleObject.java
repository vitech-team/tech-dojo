package com.vitech.playground.gofpatterns.creational.Singleton.singleton;

public class SingleObject {
	
	private static SingleObject instance = null;

	private SingleObject() { }

	public synchronized static SingleObject getInstance() {
	   if (instance == null) {
		   instance = new SingleObject();
	   }
	   return instance;
	}
   
	public void showMessage() {
		System.out.println("Hello singleton!");
	}
}
