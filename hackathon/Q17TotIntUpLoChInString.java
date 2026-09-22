package hackathon;

import java.util.Scanner;

//Q17.  WJP to find total number of integers, uppercase and lowercase character in the give string
public class Q17TotIntUpLoChInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int totIn = 0;
		int totUp = 0;
		int totLo = 0;
		for (int i=0;i<str.length();i++) {
			char cha = str.charAt(i);
			if(Character.isDigit(cha)) {
				totIn++;
			}else if (Character.isUpperCase(cha)){
				totUp++;
			}else if (Character.isLowerCase(cha)) {
				totLo++;
			}
		}
	System.out.println("Total Digits " + totIn);
	System.out.println("Total Upper Case characters " + totUp);
	System.out.println("Total Lower Case characters " + totLo);
	sc.close();
	}

}
