package hackathon;
/*Q27. WJP to perform ascending order Quick sort
Quick Sort is a highly efficient, widely used sorting algorithm that uses a divide-and-conquer
strategy to arrange elements in order (usually ascending or descending).It works by breaking
a large array down into smaller sub-arrays, sorting those sub-arrays, and combining them 
back together.*/
public class Q27AscendingOrderQuickSort {
	  public static void main(String[] args) {
	        int[] arr = {10, 7, 8, 9, 1, 5};
	        int n = arr.length;

	        System.out.println("Original Array:");
	        printArray(arr);

	        quickSort(arr, 0, n - 1);

	        System.out.println("\nSorted Array in Ascending Order:");
	        printArray(arr);
	    }

	    // Core Quick Sort function
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            // pi is the partitioning index, arr[pi] is now at the right place
	            int pi = partition(arr, low, high);

	            // Recursively sort elements before and after partition
	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }

	    // Partition method that takes the last element as pivot
	    public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high]; 
	        int i = (low - 1); // Index of smaller element

	        for (int j = low; j < high; j++) {
	            // If current element is smaller than or equal to the pivot
	            if (arr[j] <= pivot) {
	                i++;

	                // Swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // Swap arr[i+1] and arr[high] (or pivot)
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	        
	    }

	    // Utility function to print the array
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}


