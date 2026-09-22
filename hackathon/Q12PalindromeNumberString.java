package hackathon;

import java.util.Scanner;

//Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?

public class Q12PalindromeNumberString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		StringBuilder strb = new StringBuilder(str);
		String revStr = strb.reverse().toString();
		System.out.println("Reversed String " + revStr);
		if (revStr.compareTo(str)==0) 
			System.out.println("The entered string is a palindrome");
		else
			System.out.println("The entered string is not palindrome");
		System.out.println("Enter number to check whether it is a palindrome number or not");
		int num = sc.nextInt();
		int bnum = num;
		int rev = 0;
		int rem = 0;
		while (bnum > 0) {
			rem = bnum%10;
			bnum = bnum/10;
			rev = rem + (rev*10);
		}
		System.out.println("The reversed number is " + rev);
		if (rev == num)
			System.out.println("The entered number is a palindrome");
		else
			System.out.println("The entered number is not palindrome");
		sc.close();
			
		
		
	}

}
