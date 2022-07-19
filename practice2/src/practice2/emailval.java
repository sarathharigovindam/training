package practice2;
import java.util.*;
public class emailval {
	public static void check(String email, ArrayList<String> list ) {
		if(list.contains(email)==false)
			System.out.println(email +" is not in the list");
		else
			System.out.println(email +" is in the list");
		}
	
	
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("abcd@gmail.com");
		list.add("efgh@yahoo.com");
		list.add("xyz@ymail.com");
		
		
		System.out.println("Enter an email id:");
		Scanner sc = new Scanner(System.in);
		String email=sc.nextLine();
		check(email,list);
	}
}
