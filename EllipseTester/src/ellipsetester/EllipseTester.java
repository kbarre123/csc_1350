// Delete all comments inside the main method before submission!

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
        Ellipse2D.Double e1 = new Ellipse2D.Double(45, 55, 120, 80);
        
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
        
        // Calculate area differential.
        double e1Area = (Math.PI * e1.getWidth() * e1.getHeight()) / 4;
        double e2Area = (Math.PI * e2.getWidth() * e2.getHeight()) / 4;
        double areaDifferential = e1Area - e2Area;
        
        // Print results per Step #3.
        System.out.print("The coordinates of the bigger ellipse are {(");
        System.out.println(e1.getCenterX() + ", " + e1.getCenterY() + "), " + 
                e1.getWidth()/2 + ", " + e1.getHeight()/2 + "}.");

        // Print coordinates of inner ellipse.
        System.out.print("The coordinates of the smaller ellipse are {(");
        System.out.println(e2.getCenterX() + ", " + e2.getCenterY() + "), " + 
                e2.getWidth()/2 + ", " + e2.getHeight()/2 + "}.");

        // Print area differential.
        System.out.println("The area of the shaded region is " + 
                areaDifferential + ".");

        // Print empty line between result sets.
        System.out.println("");
        
        // Translate both objects (10, -10) per Step #4.
        e1.setFrame(e1.getX()+10, e1.getY()-10, e1.getWidth(), e1.getHeight());
        e2.setFrame(e2.getX()+10, e2.getY()-10, e2.getWidth(), e2.getHeight());
        
        // Print results per Step #5.
        System.out.println("After the ellipses are translated:");
        System.out.print("The coordinates of the bigger ellipse are {(");
        System.out.println(e1.getCenterX() + ", " + e1.getCenterY() + "), " + 
                e1.getWidth()/2 + ", " + e1.getHeight()/2 + "}.");

        // Print coordinates of inner ellipse.
        System.out.print("The coordinates of the smaller ellipse are {(");
        System.out.println(e2.getCenterX() + ", " + e2.getCenterY() + "), " + 
                e2.getWidth()/2 + ", " + e2.getHeight()/2 + "}.");

        // Print area differential.
        System.out.println("The area of the shaded region is " + 
                areaDifferential + ".");

        // Print empty line between result sets.
        System.out.println("");
        
        // Mutate width/height of both objects per Step #6.
        e1.setFrame(e1.getX(), e1.getY(), e1.getWidth()+10, e1.getHeight()+20);
        
        e2.setFrame(
                e1.getX()+e1.getWidth()/2-(e1.getWidth()/4), 
                e1.getY()+e1.getHeight()/2-(e1.getHeight()/4),
                e1.getWidth()/2, 
                e1.getHeight()/2
        );
        
        // Calculate area differential again.
        e1Area = (Math.PI * e1.getWidth() * e1.getHeight()) / 4;
        e2Area = (Math.PI * e2.getWidth() * e2.getHeight()) / 4;
        areaDifferential = e1Area - e2Area;
        
        // Print results per Step #7.
        System.out.println("After the ellipses are resized:");
        System.out.print("The coordinates of the bigger ellipse are {(");
        System.out.println(e1.getCenterX() + ", " + e1.getCenterY() + "), " + 
                e1.getWidth()/2 + ", " + e1.getHeight()/2 + "}.");

        // Print coordinates of inner ellipse.
        System.out.print("The coordinates of the smaller ellipse are {(");
        System.out.println(e2.getCenterX() + ", " + e2.getCenterY() + "), " + 
                e2.getWidth()/2 + ", " + e2.getHeight()/2 + "}.");

        // Print area differential.
        System.out.println("The area of the shaded region is " + 
                areaDifferential + ".");

        // Print empty line between result sets.
        System.out.println("");
        
        // Calculate the perimeter of the outside ellipse.
        double e1Perimeter = 
        (Math.PI/2)*(3*(e1.getWidth()+e1.getHeight()) - Math.sqrt(
                (3*Math.pow(e1.getWidth(), 2)) +
                (10*e1.getWidth()*e1.getHeight()) + 
                (3*(Math.pow(e1.getHeight(), 2)))
        ));
        
        double e2Perimeter = 
        (Math.PI/2)*(3*(e2.getWidth()+e2.getHeight()) - Math.sqrt(
                (3*Math.pow(e2.getWidth(), 2)) +
                (10*e2.getWidth()*e2.getHeight()) + 
                (3*(Math.pow(e2.getHeight(), 2)))
        ));
        
        // Print the perimeters of each object.
        System.out.println("The approximate perimeter of the bigger ellipse is "
                + e1Perimeter + ".");
        System.out.println("The approximate perimeter of the smaller ellipse is "
                + e2Perimeter + ".");
    }
}
