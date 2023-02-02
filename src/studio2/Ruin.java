package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What you startin wit foo?");
		double startAmount = in.nextDouble();
		System.out.println("What da probability g?");
		double winChance = in.nextDouble();
		System.out.println("What you ending at?");
		double winLimit = in.nextDouble();
		System.out.println("How many dias");
		double totalSims = in.nextInt();

		boolean w;

		double r;
		
		double current;
		
		double lossCount=0;
		
		int count = 0;

		for (int i = 1; i <= totalSims; i++) {
			
			count = 0;
			current = startAmount;
			

			while (current > 0 && current < winLimit) {
				r = Math.random();
				if (r < winChance) {
					current++;
				} else {
					current--;
				}
				count++;
			}
			
			if(current==0) {
				w = false;
				lossCount++;
			}else {
				w = true;
			}

			System.out.println("Day " + i +": W? " + w);
			System.out.println("Games on day "+i+": "+ count);
			System.out.println();

		}
		
		double aRR = (double)lossCount/(double)totalSims;
		
		double a = (1-winChance)/winChance;
		
		double eRR;
		
		if(winChance == 0.5) {
			eRR = 1 - (startAmount/winLimit);
		}else {
			eRR = (Math.pow(a,startAmount) - Math.pow(a,winLimit))/(1- Math.pow(a, winLimit));
		}
		
		System.out.println("Losses: "+ lossCount);
		System.out.println("Wins: " + (totalSims-lossCount));
		
		
		System.out.println("expected ruin rate: " + eRR);
		System.out.println("simulated ruin rate: " + aRR);
		
	}

}
