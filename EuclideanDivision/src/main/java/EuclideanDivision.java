/**
 * @Author Javonta Young
 * In this program I am prompting the user to put in numbers to find the quotient and the remainder
 * of the division problem.
 *
 */


import java.util.Scanner;

public class EuclideanDivision {

    public static void main(String[] args) {
        int dividend,divisor,quotient,remainder;
        //Prompt the system to take keyboard input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dividend");
        dividend = scanner.nextInt();
        System.out.println("Enter the divisor number");
        divisor = scanner.nextInt();

        quotient = dividend/divisor;
        remainder = dividend%divisor;

        System.out.println("The answer of the problem: " + dividend + " = " + quotient + " * " + divisor + " + " + remainder);
    }
}
