/**
 * Class: CSC1350 Sec. 1
 * Lab: 6
 */

package loops;
import java.util.Scanner;

/**
 *
 * @author Kenneth C. Barrett
 */
public class Loops 
{
    public static void main(String[] args) 
    {
        // a) Sum of all even numbers b/t 2 & 100 (inclusive)
        int a;
        int sumA = 0;
        for (a = 2; a <= 100; a+=2) {
            sumA += a;
        }
        System.out.println(sumA);
        
        // b) Sum of all squares b/t 1 and 100 (inclusive)
        int b;
        int sumB = 0;
        for (b = 1; b <= 100; b++) {
            sumB += Math.pow(b, 2);
        }
        System.out.println(sumB);
        
        // c) All powers of 2 from 2^0 up to 2^20
        int c;
        int sumC = 0;
        for (c = 0; c <= 20; c++) {
            System.out.printf("2^%d = %.0f\n", c, Math.pow(2, c));
        }
        
        /** 
         * d) The sum of all odd numbers b/t a and b (inclusive), where a and b are
         *    inputs.
         */    
        
        int d;
        int sumD = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int inputA = in.nextInt();
        
        System.out.println("Enter the second number: ");
        int inputB = in.nextInt();
        
        if (inputA % 2 == 0)
        {
            inputA += 1;
            for (d = inputA; d <= inputB; d += 2) {
                sumD += d;
            } 
            System.out.println(sumD);
        }
        else
        {
            for (d = inputA; d <= inputB; d +=2) {
                sumD += d;
            }
            System.out.println(sumD);
        }
        
        System.out.println("Enter a set of floating point numbers: ");
        double sum = 0;
        double sumSquare = 0;
        double n = 0;
        double currentNum = 0;
        while (in.hasNextDouble()) {
            currentNum = in.nextDouble();
            sum = sum + currentNum;
            sumSquare += Math.pow(currentNum, 2);
            n += 1;
        }
        double mean = sum / n;
        double standardDev = Math.sqrt((sumSquare - (1 / n) * Math.pow(sum, 2))/(n - 1.0));
        
        System.out.printf("Mean = %.2f\n", mean);
        System.out.printf("Standard Deviation = %.2f\n", standardDev);
        
    }
    
    
}
