import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class ReverseTheNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Test Cases: ");
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++) {
		    System.out.print("Enter no: ");
		    int N = sc.nextInt();
		    int rev = 0;
		    
		    while (N > 0) {
		        rev = rev * 10 + N % 10 ;
		        N = N / 10 ;
		    }
		    System.out.println(rev);
		}
	}
}
