package hackathon;
import java.util.Scanner;
//Q16. Write a method that will remove given character from the String?
public class Q16RemoveGivenCharFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("Enter the character to be removed");
		char reChar = sc.next().charAt(0);
		String remStr= str;
		// String.valueOf(reChar) converts the char to a String target
		remStr= str.replace(String.valueOf(reChar), "");
		System.out.println("The string after removal of the character is \n" + remStr);
	}

}
