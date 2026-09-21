package hackathon;
import java.util.Scanner;
/*Consider there is a 3 Boolean variable called a, b, c. 
 * Check if at least two out of three Booleans are true 
 */
public class Q1Boolean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the boolean value of a ");
		boolean a =sc.nextBoolean();
		System.out.println("Enter the boolean value of b ");
		boolean b =sc.nextBoolean();
		System.out.println("Enter the boolean value of c ");
		boolean c =sc.nextBoolean();
		if ((a==true )&& (a == b || a==c)) {
			System.out.println("There are 2 booleans as true");
		}else if ((b==true )&& (b == a || b==c)) {
			System.out.println("There are 2 booleans as true"); 
		}else if ((c==true )&& (c == a || c==b)) {
				System.out.println("There are 2 booleans as true");
		}else {System.out.println("There are no 2 booleans as true");
		}
		sc.close();
	}
}
