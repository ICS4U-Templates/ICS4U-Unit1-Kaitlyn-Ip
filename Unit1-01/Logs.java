/*
* The HellowWorld program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  Kaitlyn Ip
* @version 1.0
* @since   2024-02-14
*/

import java.util.Scanner;

/**
* This is the program.
*/
final class checkLogLength {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private checkLogLength() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter log length (m): ");

        static final float length = Float.parseFloat(input.nextLine());
        static final float maxLogsCarried = 1100 / (20 * length);

	System.out.println("A truck can carry " + maxLogsCarried + " " + length + " meter long logs.");

        System.out.println("\nDone.");
    }
}
