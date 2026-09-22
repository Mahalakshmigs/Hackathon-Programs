package hackathon;
//Q21. WJP to convert string to int

import java.util.Scanner;

public class Q21StringToInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int i = Integer.parseInt(str);
		System.out.println("String to Integer " + i);
		System.out.println("Integer + 4 = " + (i+4));

	}

}
