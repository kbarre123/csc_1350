package ellipsetester;
import java.awt.geom.Ellipse2D;

/**
 * @file EllipseTester.java
 * @author Kenneth C. Barrett
 * @date 2014-02-03;
 * Description: Create two ellipses, one which is defined relative to the other.
 *      Manipulate the objects per project directives.
 * Course: CS1350.01
 * PAWS ID: kbarr17
 * Project #: 1
 * Instructor: Dr. Duncan
 */
public class EllipseTester {

    public static void main(String[] args) {
        
        // Construct ellipse object with given params.
        Ellipse2D.Double e1 = new Ellipse2D.Double(60, 40, 120, 80);
        
        /* 
         * Construct inner ellipse whose params are defined relative to the 
         * first.
         */
        Ellipse2D.Double e2 = new Ellipse2D.Double(
            (e1.getX() + ((e1.getWidth()/2) - e1.getHeight()/2)), 
            e1.getY(), 
            e1.getHeight(), 
            e1.getHeight()
        );
        
        // Print results per Step #3.
        resultsPrinter(e1, e2);
        
        // Translate both objects (10, -10) per Step #4.
        e1.setFrame(e1.getX()+10, e1.getY()-10, e1.getWidth(), e1.getHeight());
        e2.setFrame(e2.getX()+10, e2.getY()-10, e2.getWidth(), e2.getHeight());
        
        // Print results per Step #5.
        System.out.println("After the ellipses are translated:");
        resultsPrinter(e1, e2);
        
        // Mutate width/height of both objects per Step #6.
        e1.setFrame(e1.getX(), e1.getY(), e1.getWidth()+10, e1.getHeight()+20);
        
        e2.setFrame(
                e1.getX()+e1.getWidth()/2-(e1.getWidth()/4), 
                e1.getY()+e1.getHeight()/2-(e1.getHeight()/4),
                e1.getWidth()/2, 
                e1.getHeight()/2
        );
        
        // Print results per Step #7.
        System.out.println("After the ellipses are resized:");
        resultsPrinter(e1, e2);
        
        // Print the perimeters of each object.
        System.out.println("The approximate perimeter of the bigger ellipse is "
                + perimeterCalc(e1) + ".");
        System.out.println("The approximate perimeter of the smaller ellipse is "
                + perimeterCalc(e2) + ".");
    }   

        // Print results in desired format.
        public static void resultsPrinter(Ellipse2D.Double e1, Ellipse2D.Double e2) {
            // Print coordinates of outer ellipse.
            System.out.print("The coordinates of the bigger ellipse are {(");
            System.out.println(e1.getCenterX() + ", " + e1.getCenterY() + "), " + e1.getWidth() + 
                    ", " + e1.getHeight() + "}.");

            // Print coordinates of inner ellipse.
            System.out.print("The coordinates of the smaller ellipse are {(");
            System.out.println(e2.getCenterX() + ", " + e2.getCenterY() + "), " + e2.getWidth() + 
                    ", " + e2.getHeight() + "}.");

            // Print area differential.
            System.out.println("The area of the shaded region is " + 
                    areaDifferentialCalc(e1, e2) + ".");

            // Print empty line between result sets.
            System.out.println("");
        }

        // Calculate the area differential between the two objects.
        public static double areaDifferentialCalc(Ellipse2D.Double e1, Ellipse2D.Double e2) {

        double e1Area = (Math.PI * e1.getWidth() * e1.getHeight()) / 4;
        double e2Area = (Math.PI * e2.getWidth() * e2.getHeight()) / 4;
        double areaDifferential = e1Area - e2Area;
        return areaDifferential;
        }

        public static double perimeterCalc(Ellipse2D.Double ellipse) {
            // Calculate the perimeter of the outside ellipse.
            double ellipsePerimeter = 
            (Math.PI/2)*(3*(ellipse.getWidth()+ellipse.getHeight()) - Math.sqrt(
                    (3*Math.pow(ellipse.getWidth(), 2)) +
                    (10*ellipse.getWidth()*ellipse.getHeight()) + 
                    (3*(Math.pow(ellipse.getHeight(), 2)))
            ));
            return ellipsePerimeter;
        }
}
