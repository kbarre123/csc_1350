/*
 * Read a number and print the square, cube and fourth.
 */
package numbersquarer;
import java.util.Scanner;

/**
 *
 * @author kbarr17
 */
public class NumberSquarer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Imput a number: ");
        int number = in.nextInt();
        
        int square = number * number;
        int cube = number * number * number;
        int fourth = (int) Math.pow(number, 4);
        
        System.out.printf("Square: %d\n", square);
        System.out.printf("Cube: %d\n", cube);
        System.out.printf("Fourth: %d\n", fourth);
    }
}
