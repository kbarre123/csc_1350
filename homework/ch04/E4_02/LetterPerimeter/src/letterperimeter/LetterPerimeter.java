/*
 * Print the perimeter of a letter-size sheet of paper and the length of its
 * diagonal.
 */
package letterperimeter;

/**
 *
 * @author kbarr17
 */
public class LetterPerimeter {

    public static void main(String[] args) {
        
        final double length = 8.5;
        final double width = 11;
        double perimeter = (2 * length) + (2 * width);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
        
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Diagonal: %.2f\n", diagonal);
    }
}
