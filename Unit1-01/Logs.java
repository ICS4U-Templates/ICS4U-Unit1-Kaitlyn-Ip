import java.util.Scanner;

/**
 * This program calculates how many logs can fit on the truck.
 */
 final class Logs {

    /**
     * Maple logs weigh 20 kg/m.
     */
    static final int WEIGHT_PER_METER = 20;
    /**
     * Logging truck can carry 1100 kg.
     */
    static final int MAX_WEIGHT = 1100;

    /**
     * The main method.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // Input
        final Scanner myObj = new Scanner(System.in);
        System.out.print("Enter length of logs. Options->0.25, 0.5, 1:");
        // String input
        final float lengthOfLogs = myObj.nextFloat();
        // Process
        final float weightOfLog = WEIGHT_PER_METER * lengthOfLogs;
        final float maxNumberOfLogs = MAX_WEIGHT / weightOfLog;
        // Output
        System.out.printf("The truck can carry " + (int) maxNumberOfLogs
                        + " logs that are " + lengthOfLogs
                        + " meter(s) long.\n" + "\nDone" + "\n");
        // Close the Scanner
        myObj.close();
    }
}
