import java.util.Scanner;

final class Numbers {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
	Scanner scanner = new Scanner(System.in);
	// Generate a random number between 1 and 6
        int randomNumber = (int) (Math.random() * 6) + 1;
	// Initialize a counter to keep track of the number of guesses
        int counter = 0;

	// Start the loop
        while (true) {
	    // Prompt the user to guess a number
            System.out.print("Guess a number (1-6): ");
	    // Read user input as a string
            String userString = scanner.nextLine();
	    // Convert the user input to an integer
            int userNumber = Integer.parseInt(userString);
	    // Increment the guess counter
            counter++;

	    // Check if the user's guess is correct
	    if (userNumber == randomNumber) {
		// If the guess is correct, display a message and break out of loop
	        System.out.println("Correct number, it took you " + counter + " tries.");
	        break;
	    } else if (userNumber < randomNumber) {
		// If the guess is too low, tell user to enter higher number
	        System.out.println("Too low, guess higher.");
	    } else if (userNumber > randomNumber) {
		// If the guess is too high, tell user to enter lower number
	        System.out.println("Too high, guess lower.");
	    } else {
		// If input is invalid, display error message
	        System.out.println("Invalid Input.");
	    }
      }
      System.out.println("\nDone.");
    }
}
