package hackathon;
//Q15. Given a string print the unique words of the string.

import java.util.Scanner;

public class Q15UniqueWordsString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        String[] strWords = str.split(" ");
        boolean hasUnique = false;
        for (int i = 0; i < strWords.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < strWords.length; j++) {
                if (i != j && strWords[i].equals(strWords[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                if (!hasUnique) {
                    System.out.println("The unique words are:");
                    hasUnique = true;
                }
                System.out.println(strWords[i]);
            }
        }
        
        if (!hasUnique) {
            System.out.println("No unique words.. duplicate words only");
        }
        
        sc.close();
    }
}
