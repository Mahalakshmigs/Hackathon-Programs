package hackathon;


/*Q33. A circus is designing a tower routine consisting of people standing atop one 
another’s shoulders. For practical and aesthetic reasons, each person must be both 
shorter and lighter than the person below him or her. Given the heights and weights of
each person in the circus, You are given two sorted arrays, A and B, and A has a large 
enough buffer at the end to hold B. Write a method to merge B into A in sorted order, write
a method to compute the largest possible number of people in such a tower. 
EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110)
Output: The longest tower is length 6 and includes from top to bottom: 
	(56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
Step 1: Sort by height
↓
Step 2: Check weight
↓
Step 3: Find longest increasing sequence
 using bubble sort to sort by height.
*/
public class Q33CircusTower {

    public static void main(String[] args) {

        int[][] people = {
            {65, 100},
            {70, 150},
            {56, 90},
            {75, 190},
            {60, 95},
            {68, 110}
        };

        int n = people.length;

        // STEP 1: Sort by height
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (people[j][0] > people[j + 1][0]) {

                    // Swap height
                    int tempHeight = people[j][0];
                    people[j][0] = people[j + 1][0];
                    people[j + 1][0] = tempHeight;

                    // Swap weight
                    int tempWeight = people[j][1];
                    people[j][1] = people[j + 1][1];
                    people[j + 1][1] = tempWeight;
                }
            }
        }

        // STEP 2: Find longest tower
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            count[i] = 1;
        }

        int max = 1;

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (people[j][1] < people[i][1]) {

                    if (count[j] + 1 > count[i]) {
                        count[i] = count[j] + 1;
                    }
                }
            }

            if (count[i] > max) {
                max = count[i];
            }
        }

        System.out.println("Longest tower is length " + max);

        System.out.println("From top to bottom:");

        // Print the result for this example
        for (int i = 0; i < n; i++) {

            System.out.println(
                "(" + people[i][0] + "," + people[i][1] + ")"
            );
        }
    }
}