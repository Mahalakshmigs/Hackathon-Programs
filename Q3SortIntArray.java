package hackathon;

import java.util.Scanner;
//Q3.	Given an array of integers, sort the integer values.
public class Q3SortIntArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the integer array ");
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
	}	System.out.println();
		System.out.print("The sorted array is " );
		for (int i=0;i<numElts;i++)
		{
			System.out.print(arrElts[i]+" ");
		}
	}
}
