import java.util.*;

public class Fibonacci{
public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  int first = 0;
  int second = 1;

  for(int i=0; i<n; i++)
  {
    int temp = first + second;
    System.out.print(first + " ");
    first = second;
    second = temp;
  }

 }
}