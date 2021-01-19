
import java.util.*;
public class SimpleInterest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float Principal = sc.nextFloat();
		float Rate = sc.nextFloat();
		float Time = sc.nextFloat();
	
        float SI  = (Principal * Rate * Time)/100;   
        System.out.println("Simple Interest is: " +SI);  
	}
}
