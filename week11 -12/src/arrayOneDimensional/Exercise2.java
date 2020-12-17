package arrayOneDimensional;

public class Exercise2 {

	public static void main(String[] args) {
		
		// write a statement that declare a string array initialize with the following
		// sunday to saturday
		// write  a loop that display the content of each element on the array that you declare
		
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		for(int i = 0 ; i < days.length ; i++) {
			
			System.out.println(days[i]);
		}
		
		System.out.println();
		
		int i =0;
		while(i<days.length) {
			System.out.println(days[i]);
			i++;
		}
		
		System.out.println();
		
		int j =0;
		do {
			System.out.println(days[j]);
			j++;
		}while(j < days.length);

	}

}
