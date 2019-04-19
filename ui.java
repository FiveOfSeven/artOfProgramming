import java.util.Scanner; //import the Scanner object

public class ui {
	public int getNumber() {
		Scanner input = new Scanner(System.in); // Create a Scanner object
		while(!input.hasNextInt()) {
			System.out.println("please enter an integer");
			input.next(); // Read user input
		}
		return input.nextInt();
	}
}

