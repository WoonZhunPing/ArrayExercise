package arrayOneDimensional;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Welcome to our zombie killer program!!!!");

		String backpack[] = { "Shotgun", "Assault Rifle", "Sniper" };
		String zombies[] = { "Close-range zombie", "Mid-range zombie", "Long-range zombie" };
		int zombiesHate[] = { 1 ,12 , 13 , 14};
		int zombiesNotHate[]; 
		zombiesNotHate = new int[4];
		zombiesNotHate[0] = 1;
		zombiesNotHate[1] = 10;
		zombiesNotHate[2] = 100;
		zombiesNotHate[3] = 1000;

		System.out.println("Backpack items!");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]);

		System.out.println("These are the zombies!");
		System.out.println(zombies[0]);
		System.out.println(zombies[1]);
		System.out.println(zombies[2]);
		
		System.out.println(zombiesHate[2]);
		System.out.println(zombiesNotHate[3]);
		System.out.println(zombiesNotHate);
	}

}
