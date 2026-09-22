package Task09;

import java.util.Scanner;

public class PracticeMakesUsPerfect
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int P1 = sc.nextInt();
		int P2 = sc.nextInt();
		int P3 = sc.nextInt();
		int P4 = sc.nextInt();

		int[] arr = {P1, P2, P3, P4};
		int week = 0;
		
		for(int num : arr) {
		    if (num >= 10) {
		        week++;
		    }
		}
		
		System.out.println(week);
	}
}

