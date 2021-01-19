
import java.util.*;
public class LeapYear
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if((n % 4 == 0 && n % 100 != 0) || n % 400 == 0 )
		{
		    System.out.println("It's Leap Year");
		}
		else{
		    System.out.println("It's Not a Leap Year");
		}
	}
}
