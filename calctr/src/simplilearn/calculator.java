package simplilearn;
import java.util.*;
public class calculator {
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    double x, y, result;
		    int op;
		    System.out.println("Calculator\n\n");
		    while (true) {

		      System.out.print("Enter First Number  : ");
		      x = sc.nextInt();
		      System.out.print("Enter Second Number : ");
		      y = sc.nextInt();
		      System.out.println("Select operator");

		      op = sc.nextInt();
		      if (op == 1) {
		        System.out.println(" Sum = " + (x + y));
		      } else if (op == 2) {
		        System.out.println(" difference = " + (x - y));
		      } else if (op == 3) {
		        System.out.println(" multiplication = " + (x * y));
		      } else if (op == 4) {
		        System.out.println(" division = " + (x / y));
		      } else {
		        System.out.println("choose correct option");
		      }

		      System.out.println("Do you want to continue (Y/N)");
		      char c = sc.next().charAt(0);
		      if (c == 'n' || c == 'N') {
		        break;

		      }
		}
	}

}
