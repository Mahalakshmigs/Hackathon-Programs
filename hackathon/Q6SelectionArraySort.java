package hackathon;

import java.util.Scanner;

/*Q6.	WJP to perform ascending order Selection  sort
 * Selection Sort is a simple sorting method in Java that repeatedly finds the smallest element
 *  and puts it in the correct position.
 */
public class Q6SelectionArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the integer array ");
		int numElts = sc.nextInt();
		
		System.out.println("Enter "+ numElts+ " integers ");
		int[] arrElts = new int[numElts];
		for (int i=0;i<numElts;i++) {
			arrElts[i] = sc.nextInt() ;
		}
		int minIndex = 0;
		for (int i=0;i<numElts;i++)
		{	minIndex = i;
			for (int j=i+1;j<numElts;j++)
			{
				if (arrElts[minIndex]>arrElts[j]) {
					minIndex = j; 
				}
			}
			int temp =arrElts[i];
			arrElts[i]=arrElts[minIndex];
			arrElts[minIndex]=temp;
			
	}	System.out.println();
		System.out.print("The sorted array is " );
		for (int i=0;i<numElts;i++)
		{
			System.out.print(arrElts[i]+" ");
		}
	}
}
