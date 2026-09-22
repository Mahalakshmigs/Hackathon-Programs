package hackathon;

/*Q32. You are given two sorted arrays, A and B, and A has a large enough buffer at the 
end to hold B. Write a method to merge B into A in sorted order. */    
import java.util.Arrays;

public class Q32MergeArrays {

    public static void main(String[] args) {

    	 int[] A = {2, 5, 8, 10, 0, 0, 0};
         int[] B = {1, 3, 7};

         int a = 4;              // 4 actual elements in A
         int b = B.length;       // 3 elements in B

         int i = a - 1;
         int j = b - 1;
         int k = A.length - 1;

         while (i >= 0 && j >= 0) {

             if (A[i] > B[j]) {
                 A[k] = A[i];
                 i--;
             } else {
                 A[k] = B[j];
                 j--;
             }

             k--;
         }

         while (j >= 0) {
             A[k] = B[j];
             j--;
             k--;
         }

         System.out.println(Arrays.toString(A));
     }
}