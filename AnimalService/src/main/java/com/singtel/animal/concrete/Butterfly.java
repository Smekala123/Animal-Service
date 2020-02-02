package com.singtel.animal.concrete;

import com.singtel.animal.Flyable;

public class Butterfly implements Flyable{
	
	public void  ButterflyBehave(){
		System.out.println("Butterfl can Fly ");
	}
	
	public void  ButterflySound(){
		System.out.println("Butterfl does not make sound ");
	}
}
