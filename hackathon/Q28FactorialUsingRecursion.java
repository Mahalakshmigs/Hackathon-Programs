package hackathon;
//Q28. WJP to find factorial of a number using recursion
import java.util.Scanner;

public class Q28FactorialUsingRecursion {
	   // Recursive method
    static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        int n = sc.nextInt();
        // Recursive method
        int result = factorialRecursive(n);
        System.out.println("Factorial using Recursive method: " + result);
        sc.close();
    }

}
