package hackathon;

import java.util.Arrays;
import java.util.Scanner;

/*Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.
Binary search is an highly efficient algorithm used to find the position of a target value
within a sorted array or list. Instead of checking every single element from left to right 
(like a linear search), binary search uses a "divide and conquer" strategy. 
It repeatedly divides the search range in half until the target element is found*/
public class Q25BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int numElts = sc.nextInt();
		
		System.out.println("Enter "+ numElts+ " integers ");
		int[] arrElts = new int[numElts];
		for (int i=0;i<numElts;i++) {
			arrElts[i] = sc.nextInt() ;
		}
		for (int i=0;i<numElts;i++)
		{
			for (int j=i+1;j<numElts;j++)
			{
				if (arrElts[i]>arrElts[j]) {
					int temp =arrElts[i];
					arrElts[i]=arrElts[j];
					arrElts[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("The sorted array is " );
		for (int i=0;i<numElts;i++)
		{
			System.out.print(arrElts[i]+" ");
		}
		System.out.println("\nEnter the target number to search ");
		int toFindNum = sc.nextInt();
		int found = Arrays.binarySearch(arrElts, toFindNum);
		if(found>=0)
			System.out.println("Element found at index " + found);
		else
			System.out.println("Element not found ");

	}

}
