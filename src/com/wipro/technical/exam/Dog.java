package com.wipro.technical.exam;

public class Dog implements Animal{

	@Override
	public void animalName() {
		System.out.println("Blacky");
		
	}

	@Override
	public void numOfLegs() {
		System.out.println("Dog has a 4 legs");
		
	}

	@Override
	public void howItWalks() {
		System.out.println("Dog walks using his 4 legs alternately");
		
	}
	
	
	
	
	

}
