package org.sourceforums.tutorial;

public class Example2 {

	public static void main(String[] args) {
		
		int cupcakes = 20;
		int cupcakeGoal = 20;
		
		if(cupcakes == cupcakeGoal) {
			System.out.println("We have met our goal for this year");
		} else if(cupcakes > cupcakeGoal) {
			System.out.println("We have made more then enough cupcakes");		
		} else {
			System.out.println("We have not met our goal :-(");
		}
		
	}

}

