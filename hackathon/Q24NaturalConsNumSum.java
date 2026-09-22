package hackathon;

import java.util.Scanner;

/*Q24. Write a program which inputs a positive natural number N and prints the 
possible consecutive number combinations, which when added give N.   
INPUT:  N = 9  	OUTPUT:  4 + 5  		      2 + 3+ 4
*/
public class Q24NaturalConsNumSum {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive natural number N: ");
        int n = sc.nextInt();
        if (n<=0) {
        	System.out.println("Invalid number ");
         }
        else {

        System.out.println("Consecutive number combinations are:");

        for (int start = 1; start <= n; start++) {

            int sum = 0;

            for (int i = start; i <= n; i++) {
                sum = sum + i;

                if (sum == n) {
                    for (int j = start; j <= i; j++) {
                        System.out.print(j);

                        if (j < i) {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                    break;
                }

                if (sum > n) {
                    break;
                }
            }
        }
        }
        sc.close();
    }

}


