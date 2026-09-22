package hackathon;

import java.util.Scanner;

//Q18. WJP to display duplicate character in string
public class Q18DupCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		boolean found = false;
		
		for (int i=0;i<str.length();i++) {
			boolean  visited = false;
			for (int j=0;j<i;j++) {
				if (str.charAt(i)==str.charAt(j)) {
					visited = true;
					break;
				}
			}
			if(visited) {
				continue;
			}
			for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(str.charAt(i) + " is a duplicate character");
                    found = true;
                    break;
                }

			}

		}  if (found == false) {
            System.out.println("There are no duplicate characters");
        }
		
	}
}

