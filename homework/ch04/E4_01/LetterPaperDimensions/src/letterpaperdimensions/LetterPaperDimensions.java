/*
 * Print the dimensions of a letter-size (8.5x11") sheet of paper in
 * millimeters. There are 25.4 millimeters per inch. Use constants and comments.
 */
package letterpaperdimensions;

/**
 *
 * @author kbarr17
 */
public class LetterPaperDimensions {

    public static void main(String[] args) {
        final double millsPerInch = 25.4;
        double width = 8.5;
        double height = 11;
        
        final double paperWidth = width * millsPerInch;
        final double paperHeight = height * millsPerInch;
        
        System.out.printf("Width: %.2f\n", paperWidth);
        System.out.printf("Height: %.2f\n", paperHeight);
    }
}
