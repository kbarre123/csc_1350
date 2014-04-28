package fractionapp;
import java.util.Scanner;

/**
 *
 * @author Kenneth C. Barrett
 */
public class FractionTester 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the numerator and denominator of the first fraction> ");
        int n1 = s.nextInt();
        int d1 = s.nextInt();
        Fraction f1 = new Fraction(n1, d1);
        
        System.out.print("Enter the numerator and denominator of the second fraction> ");
        int n2 = s.nextInt();
        int d2 = s.nextInt();
        Fraction f2 = new Fraction(n2, d2);
        
        System.out.print("Enter the numerator and denominator of the third fraction> ");
        int n3 = s.nextInt();
        int d3 = s.nextInt();
        Fraction f3 = new Fraction(n3, d3);
        System.out.println();
        
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println();
        
        System.out.printf("(f1 - f2)/(f2 - f3) = %s%n",
                (f1.subtract(f2).multiply((f2.subtract(f3).reciprocal())))
                );
        System.out.println();
        
        System.out.print("Enter a new numerator and denominator for the second fraction> ");
        f2.setFract(s.nextInt(), s.nextInt());
        //System.out.println("f2 = " + f2);
        System.out.println();
        
        System.out.printf("(1/f2)(f3 - 1/f3) = %s%n", 
                (f2.reciprocal().multiply(f3.subtract(f3.reciprocal()))) 
                );
    }
}
