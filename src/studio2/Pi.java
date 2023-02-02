package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		
		long darts = in.nextLong();
		int inCount = 0;
		
		for(long i = 1; i<=darts; i++) {
			double x1 = Math.random();
			double y1 = Math.random();
			
			
			if(x1*x1+y1*y1<1) {
				inCount++;	
			}
		}
		
		double pi = 4.0*(double)inCount/(double)darts;
		
		System.out.println(pi);

	}

}
