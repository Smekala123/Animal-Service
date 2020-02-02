package com.singtel.animal;


/*
 * Flyable Interface extending from Animal
 */
public interface Flyable extends Animal {
	default void fly(){
		System.out.println("I am flying");
	}
	
	default void fly(String bird){
		if(bird.equals("CHICKEN"))
		System.out.println("CHICKEN cannot flying");
	}
}
