package com.singtel.animal.code;

import com.singtel.animal.concrete.Bird;
import com.singtel.animal.concrete.Butterfly;
import com.singtel.animal.concrete.Fish;
import com.singtel.animal.concrete.LandBased;
import com.singtel.animal.concrete.Parrot;

public class AnimalMainService {

	public static void main(String[] args) {
		
		
		/*
		 *1. Can you implement the sing() method for the bird?
			
		 */
          Bird bird = new Bird();
          bird.fly();
          bird.sing();
          bird.walk();
        /*
         *2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
				implement them to make their own special sound?
			 
         */
          LandBased duck = new LandBased("DUCK_SOUND");
          duck.sing();
          duck.swim();
          
          
          LandBased chicken = new LandBased("CHICKEN_SOUND");
          chicken.sing();
          chicken.fly("CHICKEN");
          
         /*
          *  Now how would you model a rooster?
				
          */
          LandBased rooster = new LandBased("ROOSTER_SOUND");
          rooster.sing();
          rooster.relation("ROOSTER");
        
	
	/*
	 * 4. Can you model a parrot?
	 */
          Parrot parrot1 = new Parrot(new LandBased(LandBased.ROOSTER_SOUND));
          	parrot1.parrotBehaves("PARROT_DOG");
          	parrot1.parrotBehaves("PARROT_CATS");
          	parrot1.parrotBehaves("PARROT_ROOSTER");
          	
          	Fish fish = new Fish();
          	fish.fishBehaves("FISH_CAN_SING");
          	fish.fishBehaves("FISH_CAN_WALK");
          	fish.swim();
          	
          	Fish shark= new Fish ("SHARK_SIZE","SHARK_COLOR","SHARK_DOES");
          	shark.getDoes();
          	
          	Butterfly bf = new Butterfly();
          	bf.ButterflyBehave();
          	bf.ButterflySound();
          	
	 }
}
