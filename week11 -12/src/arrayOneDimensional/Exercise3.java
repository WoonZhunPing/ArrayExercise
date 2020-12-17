package arrayOneDimensional;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// write that create a array ten element size 
		// your program should from the user to input number in array 
		//display the sum of all array element
		
		Scanner scan = new Scanner(System.in);
		int[]numbers = new int[10];
		
		System.out.println("Enter 10 integers");
		
		for(int i =0 ; i < numbers.length; i++) {
		
			numbers[i] = scan.nextInt();
		}
		
		System.out.println("\nYou finished enter 10 integers.");
		
	    int sum =0;
		
		for(int j = 0; j < numbers.length; j++) {
			 
			sum  = sum + numbers[j];
		}
		
		System.out.println("Sum of 10 integers : " + sum);

		scan.close();
	}

}
