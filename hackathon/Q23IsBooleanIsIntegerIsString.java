package hackathon;

import java.util.Scanner;

//Q23. WJP to differentiate input as string, int or bool
public class Q23IsBooleanIsIntegerIsString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		Boolean iB=true;
		
		if((str.equalsIgnoreCase("true")) || (str.equalsIgnoreCase("false"))) {
			System.out.println("The entered string is a boolean ");
		}else{
			for (int i=0;i<str.length();i++) {
				if(!Character.isDigit(str.charAt(i))) {
					iB = false;
					break;
				}
			}
			if(iB)
				System.out.println("The entered string is an Integer ");
			else
				System.out.println("The entered string is a string");
			
		}sc.close();
	}
}		
	

		