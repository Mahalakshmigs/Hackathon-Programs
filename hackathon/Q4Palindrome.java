package hackathon;

import java.util.Scanner;

/*Q4.	Given an array of integers check the Palindrome of the series.
 * 
 */
public class Q4Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the integer array ");
		int numElts = sc.nextInt();
	//	Integer iVar = 0;
		boolean isPalin = false;
		System.out.println("Enter "+ numElts+ " integers ");
		int[] arrElts = new int[numElts];
		for (int i=0;i<numElts;i++) {
			arrElts[i] = sc.nextInt() ;
		}
		int div = 0;
		int rd = 0;
		int rev = 0;
		for (int i=0;i<numElts;i++) {
			div = arrElts[i];
			while(div>0) {
				rd = div %10;
				div =div/10;
				rev = rd+rev*10;
			}
			System.out.println("rev = " +rev);
			if (rev == arrElts[i]) {
				System.out.println( arrElts[i] + " is a palindrome. ");
				isPalin = true;	
			}
				
			rd = 0;
			rev = 0;
			}
		
		if (isPalin == false) {
			System.out.println("There are no palindromes in the given integer series");
		}
		sc.close();
	}

}
