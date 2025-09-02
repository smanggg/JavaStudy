package com.mypet.model;

public class Dog implements PetType {

	@Override
	public void eat(Pet pet) {
		pet.updateFullnessScore(15);
		pet.updateHappyScore(10);
		pet.updateCleanScore(-10);
		
	}

	@Override
	public void play(Pet pet) {
		pet.updateFullnessScore(-5);
		pet.updateHappyScore(15);
		pet.updateCleanScore(-10);
		
	}

	@Override
	public void clean(Pet pet) {
		pet.updateFullnessScore(-5);
		pet.updateHappyScore(-5);
		pet.updateCleanScore(25);
		
	}

	@Override
	public String getType() {
		return "강아지";
	
	}

}
