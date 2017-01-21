import java.util.Scanner; //enables user input
// Java program to see if a three digit number is equal to the sum of the cubes of its digits

public class Compare {

    public static void main (String [] args) {

        int numStart = 0;

        Scanner scnr = new Scanner(System.in); //assigns memory location for input

        do {
            System.out.println("Please enter a three digit number for comparison:");//Get input

            while (!scnr.hasNextInt()) { //validate user input to be sure it's an integer
                System.out.println("Please try again.");
                scnr.next();
            }

            numStart = scnr.nextInt(); //assigns input to numStart
        } while (numStart <= 0);

        //printing result
        if(isEqualToSum(numStart)) {
            System.out.println("True, " + numStart + " is equal to the sum of the cube of its digits.");
        }else{
            System.out.println("False, " + numStart + " is not equal to the sum of the cube of its digits.");
        }}


    private static boolean isEqualToSum(int numStart) {


    {
        int sumResult = 0;
        int startNum = numStart;

        while (numStart != 0) {
            int remainder = numStart % 10;  //returns remainder
            sumResult = sumResult + remainder * remainder * remainder;
            numStart = numStart / 10;  //strips off remainder
        }
        if (startNum == sumResult) {  //tests to see if the number is eual to sum of cubes
            return true;
        }
        return false;
    }

}}
