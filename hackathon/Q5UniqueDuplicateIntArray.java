package hackathon;

import java.util.Scanner;

/*Q5.	Given an array prints the unique numbers and also print the number of occurrences 
 * of duplicate numbers.
*/
public class Q5UniqueDuplicateIntArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the integer array ");
		int numElts = sc.nextInt();
		
		System.out.println("Enter "+ numElts+ " integers ");
		int[] aE = new int[numElts];
		for (int i=0;i<numElts;i++) {
			aE[i] = sc.nextInt() ;
		}
				
		for (int i=0;i<numElts;i++)
		{
			int dup = 1;
			int visited = 0;
			
			for (int j=0;j<i;j++)
			{
				if (aE[i] == aE[j]) {
					visited = 1;
				}
			}
			 if (visited == 1) {
	                continue;
	            }
			 for (int j = i + 1; j < numElts; j++) {
	                if (aE[i] ==aE[j]) {
	                    dup++;
	                }
	            }

	            if (dup == 1) {
	                System.out.println(aE[i] + " is unique");
	            } else {
	                System.out.println(aE[i] + " occurs " + dup + " times");
	            }
			}
	
	 sc.close();
	}

}
