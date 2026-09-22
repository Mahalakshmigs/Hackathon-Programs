package hackathon;
//Q14. Given a string print the reverse of the words string.(Input:  Java Code Output: Code Java)

import java.util.Scanner;

public class Q14ReverseOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String[] strWords= str.split(" ");
		String[] revStr = new String[strWords.length];
		int c = 0;
		for(String word:strWords) {
			revStr[c] = word;
			c++;
		}
		System.out.println("The reverse of the words string is ");
		for (int i=revStr.length-1;i>=0;i--)
			System.out.print(revStr[i] + " ");

	}


	}


