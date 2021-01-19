
import java.util.*;
import java.lang.Math;
public class ArmstrongNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int copy = n;
		
	    int length = String.valueOf(n).length();
		int store = 0;
		while(n!=0)
		{
		    int rem = n % 10;
		    double cube = Math.pow(rem, length);
		    store += cube;
		    n = n / 10;
		}
		
		if(copy == store)
		{
		    System.out.println("It's Armstrong number");
		}
		else 
		{
		    System.out.println("It's Not a Armstrong number");
		}
	}
}
