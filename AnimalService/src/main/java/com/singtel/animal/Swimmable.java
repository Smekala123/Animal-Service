package com.singtel.animal;


/*
 * Swimmable Interface extending from Animal
 */
public interface Swimmable extends Animal {
	default void swim(){
		System.out.println("I am swimming");
	}
}
