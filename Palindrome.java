import java.util.*;
public class Palindrome{
public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int copy = n;
   int store = 0;

   while(n != 0)
   { 
     int rem = n % 10; 
     store = store*10 + rem;
     n = n / 10; 
   }

   if(copy == store)
    {
      System.out.println("It is Palindrome");
    }
    else
    {
      System.out.println("It is not Palindrome");
    }
 }
}