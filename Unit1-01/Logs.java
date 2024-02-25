/*
* This program gets the length of logs from the user,
*  calculates and tells how many logs can go on a truck.
*
* @author Kaitlyn Ip
* @version 1.0
* @since   2021-11-20
*/

import java.util.Scanner;

/**
* This is calculate how many logs can go on a truck program.
*/
final class Logs {
    /**
    *     * Maple logs weigh 20 kg/m.
    */
    static final int WEIGHT_PER_METER = 20;
    /**
    * Logging truck can carry 1100 kg.
    */
    static final int MAX_WEIGHT = 1100;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    * throws IllegalStateException
    *
    */
    private Logs() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

    // input
    final Scanner myObj = new Scanner(System.in);
    System.out.print("Enter the length of the logs in meters."
		    + "\nValid choices are -> 0.25, 0.5, 1: ");
    // String input
    final float lengthOfLogs = myObj.nextFloat();
    // Process
    final float weightOfLog = WEIGHT_PER_METER * lengthOfLogs;
    final float maxNumberOfLogs = MAX_WEIGHT / weightOfLog;
    // Output
    System.out.printf("The truck can carry " + (int) maxNumberOfLogs
                      + " logs that are " + lengthOfLogs
	              + " meter(s) long.\n" + "\nDone" + "\n");
    }
}
