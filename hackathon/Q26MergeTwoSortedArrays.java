package hackathon;

/*Q26. WJP to merge two sorted array.(Do not use third array)		array1[10] = 1,2,4,6,9,10	
array2[4] =  3, 5,7,8		After merge :  array1[10] = 1,2,3,4,5,6,7,8,9,10*/
import java.util.Arrays;
public class Q26MergeTwoSortedArrays {
	   public static void main(String[] args) {
		   // array1 has a size of 10, containing 6 valid elements and 4 empty slots (zeros)
	        int[] array1 = new int[10];
	        array1[0] = 1;
	        array1[1] = 2; 
	        array1[2] = 4; 
	        array1[3] = 6;
	        array1[4] = 9; 
	        array1[5] = 10;
	        System.out.print("The array1 elements are " );
			for (int i=0;i<6;i++)
			{
				System.out.print(array1[i]+" ");
			}
			 System.out.println();
	        // array2 has a size of 4 with 4 valid elements
	        int[] array2 = {3, 5, 7, 8};
	        System.out.print("The array2 elements are " );
			for (int i=0;i<4;i++)
			{
				System.out.print(array2[i]+" ");
			}
			System.out.println();
	        // m is the number of valid elements in array1, n is the number of elements in array2
	        int m = 6; 
	        int n = 4;
	        
	        // Pointers for tracking indices
	        int i = m - 1;         // Index of the last valid element in array1
	        int j = n - 1;         // Index of the last element in array2
	        int k = array1.length - 1; // Index of the last position in array1 (target)

	        // Merge from the back to the front
	        while (i >= 0 && j >= 0) {
	            if (array1[i] > array2[j]) {
	                array1[k] = array1[i];
	                i--;
	            } else {
	                array1[k] = array2[j];
	                j--;
	            }
	            k--;
	        }

	        // If there are remaining elements in array2, copy them over
	        // (If array1 has leftover elements, they are already in their correct places)
	        while (j >= 0) {
	            array1[k] = array2[j];
	            j--;
	            k--;
	        }

	        // Output the result
	        System.out.println("After merge: array1[" + array1.length + "] = " + Arrays.toString(array1).replaceAll("[\\[\\] ]", ""));
	    }
}
