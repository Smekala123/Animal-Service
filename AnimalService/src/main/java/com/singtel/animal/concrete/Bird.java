package com.singtel.animal.concrete;

import com.singtel.animal.Flyable;
import com.singtel.animal.Singable;
import com.singtel.animal.Walkable;

public class Bird implements Walkable, Flyable, Singable {

	@Override
	public void sing() {
		System.out.println("Bird Can singing");
	}

	@Override
	public void fly() {
		System.out.println("Bird Can flying");
	}

	@Override
	public void walk() {
		System.out.println("Bird Can walking");
	}

}
