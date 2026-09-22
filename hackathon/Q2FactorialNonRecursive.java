package hackathon;
import java.util.Scanner;
//Q2.	write a program to find factorial (Non Recursive)
public class Q2FactorialNonRecursive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number to find its factorial");
		int num = sc.nextInt();
		int fact = 1;
		if ((num==0)||(num==1)) {
			System.out.println("The factorial of " + num + " = 1");
		}else if(num<0) {
			System.out.println("Invalid number ");
		}else {
			for(int i=num;i>=1;i--) {
				fact = fact *i;
			}
			System.out.println("The factorial of the given number " + num + " is " + fact );
		}
		sc.close();
	}
}


