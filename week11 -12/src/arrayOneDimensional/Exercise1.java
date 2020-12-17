package arrayOneDimensional;

public class Exercise1 {

	public static void main(String[] args) {
		
		// declare array alpha of 15 elements of type integer
		int[] alpha = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		//output the value of the tenth element of array alpha
		
		System.out.println(alpha[9]);
		
		//set the value of the fifth element of array alpha to 35
		
		alpha[4] = 35;
		
		System.out.println(alpha[4]);
				
		//set the value of ninth element of array alpha is the sum of 6th and 13th of array alpha 		
		
		alpha[8] = alpha[5] + alpha[12];
		
		System.out.println("Sum: " + alpha[8]);

	}

}
