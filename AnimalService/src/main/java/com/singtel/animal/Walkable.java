package com.singtel.animal;

/*
 * Walkable Interface extending from Animal
 */
public interface Walkable extends Animal{
	default void walk(){
		System.out.println("I am walking");
	}
}
