package hackathon;
//Q19. WJP to display number of occurrence of all character

import java.util.Scanner;

public class Q19OccurancesOfAllChars {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the String");
	        String str = sc.nextLine();

	        for (int i = 0; i < str.length(); i++) {
	            boolean visited = false;
	            for (int k = 0; k < i; k++) {
	                if (str.charAt(i) == str.charAt(k)) {
	                	visited = true;
	                    break;
	                }
	            }
	            if (visited)
	                continue;
	            int count = 0;
	            for (int j = 0; j < str.length(); j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    count++;
	                }
	            }

	            System.out.println(str.charAt(i) + " = " + count);
	        }
	    }
}

