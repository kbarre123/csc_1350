package fibonacci;
import java.util.Scanner;

public class Fibonacci
{
   
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter an integer n to generate the nth Fibonacci number-> ");
      int n = s.nextInt();
      
      if (n <= 0)
         System.out.printf("Fib(%d) = nan%n", n);
      else if (n == 1)
         System.out.printf("Fib(%d) = 0%n", n);
      else
      {  
         int cur = 0;
         int next = 1;
         int sum = 1;
         int i = 2;
         System.out.printf("Fib(%d) = %d", n, cur);
         do
         {
            next = next + cur;
            cur = next - cur;
            sum = sum + cur;
            System.out.printf(" + %d", cur);
            i++;
         } while(i <= n);
         System.out.printf(" = %d%n", sum);
      }
   }
}

