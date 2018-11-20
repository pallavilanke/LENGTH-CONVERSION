package com.epam.metricconversion;

import java.util.Scanner;
/** Application to convert metrics.
 * @author Rithika
 */
public class App {
    /**method to perform metric conversion.
     * @param convert **object of interface.**
     * @param input **input given by user**
     */
    public void implementConversion(final Convert convert,
            final float input) {
           System.out.print(convert.convertMetric(input));
        }
    /** method to read data and invoke appropriate method.
     * @param args **command line arguments**
     */
        public static void main(final String[] args) {
            System.out.println("Conversion 1: Inches to feet\n"
                    + "2: Inches to meters\n"
                    + "3: Feet to inches\n"
                    + "4: Feet to meters\n"
                    + "5: Meters to feet\n"
                    + "6: Meters to inches\n"
                    + "Enter your choice:");
            Scanner scanner = new Scanner(System.in);
            final int choiceNumberThree = 3;
            final int choiceNumberFour = 4;
            final int choiceNumberFive = 5;
            final int choiceNumberSix = 6;
            Convert convert = new InchesToFeet();
            int choice = scanner.nextInt();
            if (choice == 1) {
                convert = new InchesToFeet();
            } else if (choice == 2) {
                convert = new InchesToMeters();
            } else if (choice == choiceNumberThree) {
                convert = new FeetToInches();
            } else if (choice == choiceNumberFour) {
                convert = new FeetToMeters();
            } else if (choice == choiceNumberFive) {
                convert = new MetersToFeet();
            } else if (choice == choiceNumberSix) {
                convert = new MetersToInches();
            } else {
                System.out.println("Invalid choice !!");
                System.exit(0);
            }
            System.out.println("Enter units:");
            float input = scanner.nextFloat();
            App app = new App();
            app.implementConversion(convert, input);
            scanner.close();
        }
}
