package ellipsetester;
import java.awt.geom.Ellipse2D;

/**
 * @file EllipseTester.java
 * @author Kenneth C. Barrett
 * @date 2014-02-03;
 * Description: TODO-------------
 * Course: CS1350.01
 * PAWS ID: kbarr17
 * Project #: 1
 * Instructor: Dr. Duncan
 */
public class EllipseTester {

    public static void main(String[] args) {
        
        // Construct ellipse object with given params.
        Ellipse2D.Double ellipse = new Ellipse2D.Double(60, 40, 120, 80);
        
        /* 
         * Construct inner ellipse whose params are defined relative to the 
         * first.
         */
        Ellipse2D.Double circle = new Ellipse2D.Double(
            (ellipse.getX() + ((ellipse.getWidth()/2) - ellipse.getHeight()/2)), 
            ellipse.getY(), 
            ellipse.getHeight(), 
            ellipse.getHeight()
        );
        
        // Print results per Step #3.
        resultsPrinter(ellipse, circle);
        
        // Translate both objects (10, -10) per Step #4.
        ellipse.setFrame(ellipse.getX()+10, ellipse.getY()-10, ellipse.getWidth(), ellipse.getHeight());
        circle.setFrame(circle.getX()+10, circle.getY()-10, circle.getWidth(), circle.getHeight());
        
        // Print results per Step #5.
        System.out.println("After the ellipses are translated:");
        resultsPrinter(ellipse, circle);
        
        // Mutate width/height of both objects per Step #6.
        ellipse.setFrame(ellipse.getX(), ellipse.getY(), ellipse.getWidth()+10, ellipse.getHeight()+20);
        
        // TODO: Refactor this into one statement instead of two.
        circle.setFrame(0, 0,
                ellipse.getWidth()/2, 
                ellipse.getHeight()/2
        );
        circle.setFrame(
                ellipse.getX()+ellipse.getWidth()/2-(circle.getWidth()/2), 
                ellipse.getY()+ellipse.getHeight()/2-(circle.getHeight()/2),
                circle.getWidth(), 
                circle.getHeight()
        );
        
        // Print results per Step #7.
        System.out.println("After the ellipses are resized:");
        resultsPrinter(ellipse, circle);
        
        // Print the perimeters of each object.
        System.out.println("The approximate perimeter of the bigger ellipse is "
                + perimeterCalc(ellipse) + ".");
        System.out.println("The approximate perimeter of the smaller ellipse is "
                + perimeterCalc(circle) + ".");
    }   

    // Calculate the area differential between the ellipse and circle.
    public static double areaDifferentialCalc(Ellipse2D.Double ellipse, Ellipse2D.Double circle) {
    
    double ellipseArea = (Math.PI * ellipse.getWidth() * ellipse.getHeight()) / 4;
    double circleArea = (Math.PI * circle.getWidth() * circle.getHeight()) / 4;
    double areaDifferential = ellipseArea - circleArea;
    return areaDifferential;
    }
    
    // Print results in desired format.
    public static void resultsPrinter(Ellipse2D.Double ellipse, Ellipse2D.Double circle) {
        // Print coordinates of outer ellipse.
        System.out.print("The coordinates of the bigger ellipse are {(");
        System.out.println(ellipse.getCenterX() + ", " + ellipse.getCenterY() + "), " + ellipse.getWidth() + 
                ", " + ellipse.getHeight() + "}.");
        
        // Print coordinates of inner circle.
        System.out.print("The coordinates of the smaller ellipse are {(");
        System.out.println(circle.getCenterX() + ", " + circle.getCenterY() + "), " + circle.getWidth() + 
                ", " + circle.getHeight() + "}.");
        
        // Print area differential.
        System.out.println("The area of the shaded region is " + 
                areaDifferentialCalc(ellipse, circle) + ".");
        
        // Print empty line between result sets.
        System.out.println("");
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
