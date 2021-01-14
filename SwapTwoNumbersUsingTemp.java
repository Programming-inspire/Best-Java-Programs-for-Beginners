import java.util.*;
public class SwapTwoNumbersUsingTemp{
public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
 System.out.println("Before Swap");

   int n1 = sc.nextInt();
   int n2 = sc.nextInt();


   int temp = n1;
   n1 = n2;
   n2 = temp;
System.out.println("After Swap");

  System.out.println(n1);
  System.out.println(n2); 
 }
}