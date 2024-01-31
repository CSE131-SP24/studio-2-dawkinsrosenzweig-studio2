package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		Scanner in = new Scanner(System.in);		
		
		System.out.println("What's your start amount?");
		int startAmount = in.nextInt();
		double winChance = 0.7;
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();
		int totalSimulations = 10; 
		double generate = (double)((Math.random()));
		int timesPlayed = 0;
		

		while ((startAmount < 10) && (startAmount != winLimit))
		{
			if (generate <= winChance)
			{	
				System.out.println("Success");
				startAmount ++;
			}
			else 
			{
				System.out.println("Ruin");
				startAmount --;
			}
			totalSimulations --;
			generate = (double)((Math.random()));
			timesPlayed ++;
		}
		System.out.println("Your finishing amount is $" + startAmount);
		System.out.println("You played this many times " + timesPlayed);
		int ruinRate = 1 - (startAmount/winLimit);
		System.out.println("Ruin rate:" + ruinRate);
		double successRate = ((1 - winChance )) / (winChance) ;
		System.out.println("Success rate: %" + successRate*100) ;


	}

}
	}
