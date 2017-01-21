package git1;
import java.util.Scanner;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		  String actual, reverse = "";
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string or number to check if it is a palindrome");
	      actual = sc.nextLine();
	 
	      int length = actual.length();
	 
	      for (int i=length-1;i >= 0;i-- )
	      {
	         reverse = reverse + actual.charAt(i);
	      }
	 
	      if (actual.equalsIgnoreCase(reverse))
	         System.out.println(actual + " is a palindrome");
	         
	      else
	         System.out.println(actual +" is not a palindrome");
	}
}
	

