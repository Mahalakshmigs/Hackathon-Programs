package hackathon;
//Q13. Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)

import java.util.Scanner;

public class Q13ReverseOfStringSentnce {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String[] strWords= str.split(" ");
		String[] revStr = new String[strWords.length];
		int c = 0;
		for(String word:strWords) {
			StringBuilder strb = new StringBuilder(word);
			revStr[c] = strb.reverse().toString();
			//System.out.println("Reversed String " + revStr[c]);	
			c++;
		}
		System.out.println("The reverse of the string is ");
		for (int i=revStr.length-1;i>=0;i--)
			System.out.print(revStr[i] + " ");

	}

}
