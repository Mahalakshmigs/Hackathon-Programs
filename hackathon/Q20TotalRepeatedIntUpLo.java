package hackathon;

import java.util.Scanner;

/*Q20. WJP to find total number of repeated integers, uppercase and lowercase character 
in the give string*/
public class Q20TotalRepeatedIntUpLo {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the String");
	        String str = sc.nextLine();

	        int repInt = 0;
	        int repUp = 0;
	        int repLo = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            boolean visited = false;
	            for (int k = 0; k < i; k++) {
	                if (str.charAt(k) == ch) {
	                    visited = true;
	                    break;
	                }
	            }
	            if (!visited) {
	                for (int j = i + 1; j < str.length(); j++) {
	                    if (ch == str.charAt(j)) {
	                        if (ch >= '0' && ch <= '9') {
	                            repInt++;
	                        }
	                        else if (ch >= 'A' && ch <= 'Z') {
	                            repUp++;
	                        }
	                        else if (ch >= 'a' && ch <= 'z') {
	                            repLo++;
	                        }

	                        break;
	                    }
	                }
	            }
	        }

	        System.out.println("Total repeated integers = " + repInt);
	        System.out.println("Total repeated uppercase characters = " + repUp);
	        System.out.println("Total repeated lowercase characters = " + repLo);

	        sc.close();
	    }
}
