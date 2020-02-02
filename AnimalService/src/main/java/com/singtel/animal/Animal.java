package com.singtel.animal;

/*
 * Animal Interface
 */
public interface Animal {

	
		default void fishBehaves(String sing){
			
			if (sing.equals("FISH_CAN_SING")){
				System.out.println("Fish Can't Sing ");
			}else if(sing.equals("FISH_CAN_WALK")){
				System.out.println("Fish Can't Wlak ");
			}
		}
		default void parrotBehaves(String parrot){
			if (parrot.equals("PARROT_DOG")){
				System.out.println("Parrot Says"+ " Woof, woof");
			}else if(parrot.equals("PARROT_CATS")){
				System.out.println("Parrot Says"+ " Meow, Meow");
			}else if (parrot.equals("PARROT_ROOSTER")){
				System.out.println("Parrot Says"+ " Cock-a-doodle-doo");
			}
		}
}
