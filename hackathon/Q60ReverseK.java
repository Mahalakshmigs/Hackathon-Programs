package hackathon;
/*Q 60. write an algorithm to reverse first 3 numbers, then next 3 numbers, 
then next 3 numbers, the number will be  based on var k. 
Array = [3,2,4,7,0,3,1,5,8, 4]       k=3       OutPut = [4,2,3,3,0,7,8,5,1,4]
*/

import java.util.Arrays;

public class Q60ReverseK {

    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 7, 0, 3, 1, 5, 8, 4};

        int k = 3;

        for (int i = 0; i < arr.length; i = i + k) {

            int start = i;
            int end = i + k - 1;

            // If the last group has fewer than k elements
            if (end >= arr.length) {
                end = arr.length - 1;
            }

            // Reverse the group
            while (start < end) {

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}