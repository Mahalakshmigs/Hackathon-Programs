package hackathon;
//6. find the longest palindrome in the given string
import java.util.Scanner;

public class Q30LongestPalindrome {
	
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a string: ");
      String str = sc.nextLine();

      String longest = "";

      for (int i = 0; i < str.length(); i++) {

          for (int j = i + 1; j <= str.length(); j++) {

              String sub = str.substring(i, j);

              String reverse = "";

              for (int k = sub.length() - 1; k >= 0; k--) {
                  reverse = reverse + sub.charAt(k);
              }

              if (sub.equals(reverse) && sub.length() > longest.length()) {
                  longest = sub;
              }
          }
      }

      System.out.println("Longest palindrome: " + longest);

      sc.close();
  }
}