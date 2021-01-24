import java.util.*;
public class SumofIndividualDigits
{
public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int store = 0;
  while(n != 0)
  {
   int rem = n % 10;
   store += rem;
   n = n / 10;
  }

  System.out.println("Sum up all Individual Digits: " + store);
 }
}