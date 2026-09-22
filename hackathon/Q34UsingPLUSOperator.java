package hackathon;

/*
 * Q34. Write a method to implement *, -, / operations using only + operator in
 * Java
 * 
 * The idea is:
 * 
 * - subtraction → use addition of a negative number multiplication → use
 * repeated addition / division → use repeated subtraction
 * 
 * will not use -, *, or / operators in our calculations.
 */
import java.util.Scanner;
public class Q34UsingPLUSOperator {

		// Subtraction using +
	    static int subtract(int a, int b) {
	        return a + (-b);
	    }

	    // Multiplication using repeated addition
	    static int multiply(int a, int b) {

	        int result = 0;

	        for (int i = 0; i < b; i++) {
	            result = result + a;
	        }

	        return result;
	    }

	    // Division using repeated subtraction
	    static int divide(int a, int b) {

	        int count = 0;

	        while (a >= b) {
	            a = a + (-b);
	            count++;
	        }

	        return count;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        System.out.println("Subtraction = " + subtract(a, b));
	        System.out.println("Multiplication = " + multiply(a, b));
	        System.out.println("Division = " + divide(a, b));
	    }
	}