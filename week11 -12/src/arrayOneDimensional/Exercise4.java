package arrayOneDimensional;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] list1 = new int[5];
		int[] list2 = new int[5];
		
		System.out.println("Enter 5 integers");
		
		for(int i = 0 ; i < list1.length; i++) {
			
			list1[i] = scan.nextInt();
		}
		
		for(int j = 0 ; j < list2.length; j++) {
			
			list2[j] = list1[j];
	
		}
		
		System.out.println("\nThe values of list1 = "+list1[0]+","+ list1[1]+","+ list1[2]+","+ list1[3]+","+ list1[4]);
		System.out.println("The values of list2 = "+list2[0]+","+ list2[1]+","+ list2[2]+","+ list2[3]+","+ list2[4]);
		
		scan.close();
	}
	

}
