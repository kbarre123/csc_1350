/*
 * Read two numbers, print out a bunch of stuff realted to them.
 */
package numberprinterbig;
import java.util.Scanner;

/**
 *
 * @author kbarr17
 */
public class NumberPrinterBig {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Prompt user.
        System.out.println("Please enter two integers: ");
        double number1 = in.nextDouble();
        double number2 = in.nextDouble();
        
        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double average = (number1 + number2) / 2;
        double distance = Math.abs(difference);
        double maximum = Math.max(number1, number2);
        double minimum = Math.min(number1, number2);
        
        System.out.printf("Sum: %11.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %5.2f\n", product);
        System.out.printf("Average: %5.2f\n", average);
        System.out.printf("Distance: %4.2f\n", distance);
        System.out.printf("Maximum: %5.2f\n", maximum);
        System.out.printf("Minimum: %5.2f\n", minimum);
    }
}
