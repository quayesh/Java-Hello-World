package begining;

public class IfElseConcept {

	public static void main(String[] args) {
		String cup;
		cup="coffee";
		// straigth if-else
		if(cup=="water") {
			System.out.println("Drink it!!!!");
		}
		else {
			System.out.println("Ask for Water");
		}
		// Nested if-else
		if(cup=="milk") {
			System.out.println("Enjoy the Milk");
		}
		else if(cup=="coffee") {
			System.out.println("Enjoy the coffee");
		}
		else if(cup=="tea") {
			System.out.println("Drink one cup tea");
		}
		else {
			System.out.println("Print something");
		}
		
		
		
		
	}

}
