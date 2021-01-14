import java.util.*;
public class Factorial{
public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  int mul = 1;

  for(int i=n; i>0; i--)
  {
    mul = mul * i;
  }
  System.out.println(mul);

 }
}