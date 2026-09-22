package hackathon;

/*Q29. WJP to perform Merge sort using recursion 
Merge Sort is a divide-and-conquer sorting algorithm. It divides the array into smaller parts, 
sorts them, and then merges the sorted parts.
Merge Sort = Divide the array → Recursively sort → Merge the sorted parts.
*/public class Q29MergeSortRecursively {

	    public static void main(String[] args) {

	        int[] arr = {8, 3, 5, 1, 4, 2};

	        mergeSort(arr, 0, arr.length - 1);

	        System.out.println("Sorted array:");

	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

	    // Recursive method
	    static void mergeSort(int[] arr, int start, int end) {

	        if (start < end) {

	            int mid = (start + end) / 2;

	            // Divide left side
	            mergeSort(arr, start, mid);

	            // Divide right side
	            mergeSort(arr, mid + 1, end);

	            // Merge both sides
	            merge(arr, start, mid, end);
	        }
	    }

	    static void merge(int[] arr, int start, int mid, int end) {

	        int[] temp = new int[end - start + 1];

	        int i = start;
	        int j = mid + 1;
	        int k = 0;

	        // Compare and store smaller value
	        while (i <= mid && j <= end) {

	            if (arr[i] < arr[j]) {
	                temp[k] = arr[i];
	                i++;
	            } else {
	                temp[k] = arr[j];
	                j++;
	            }

	            k++;
	        }

	        // Copy remaining left elements
	        while (i <= mid) {
	            temp[k] = arr[i];
	            i++;
	            k++;
	        }

	        // Copy remaining right elements
	        while (j <= end) {
	            temp[k] = arr[j];
	            j++;
	            k++;
	        }

	        // Copy temp back to original array
	        for (i = start, k = 0; i <= end; i++, k++) {
	            arr[i] = temp[k];
	        }
	    }
	}
