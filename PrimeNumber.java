import java.util.*;
public class PrimeNumber{
public static void main(String args[])
   {
    boolean flag = true;
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();

   if(n <= 0)
   {
     System.out.println("Invalid");
   }
   else if(n == 1)
   {
     System.out.println("Neither Prime nor Composite");
   }
   else{
   for(int i=2; i<n; i++)
   {
     if(n % i == 0)
     {
      flag = false;
     } 
   }

    if(flag == true)
    {
      System.out.println("It is Prime");
    }
    else
    {
      System.out.println("It is not Prime");
    }
  }
 }
}
