package git1;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		boolean a,b,c;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("is A true or false?");
		a=sc.nextBoolean();
		System.out.println("is B true or false?");
		b=sc.nextBoolean();
		System.out.println("is C true or false?");
		c=sc.nextBoolean();
		
		if(a==true && b==true && c==true)
			System.out.println("A,B and C have boolean value true");	
		else if(a==true && b==true && c==false)
			System.out.println("A and B have boolean value true");
		else if(a==true && b==false && c==true)
			System.out.println("A and C have boolean value true");
		else if(a==false && b==true && c==true)
			System.out.println("B and C have boolean value true"); 
		else
			System.out.println("One or None of the variables have boolean value true");
		
		System.out.println("New Line");
	}

}

