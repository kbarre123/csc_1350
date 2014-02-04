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
        
        // Calculate the area between the ellipse and circle.
        double Pi = Math.PI;
        double ellipseArea = (Pi * ellipse.getWidth() * ellipse.getHeight()) / 4;
        double circleArea = Pi * Math.pow(circle.getWidth() / 2.0, 2.0);
        double areaDifferential = ellipseArea - circleArea;
        
        // Print results per Step #3.
        System.out.print("The coordinates of the bigger ellipse are {(");
        System.out.println(ellipse.getCenterX() + ", " + ellipse.getCenterY() + "), " + ellipse.getWidth() + 
                ", " + ellipse.getHeight() + "}.");
        
        System.out.print("The coordinates of the smaller ellipse are {(");
        System.out.println(circle.getCenterX() + ", " + circle.getCenterY() + "), " + circle.getWidth() + 
                ", " + circle.getHeight() + "}.");
        
        System.out.println("The area of the shaded region is " + 
                areaDifferential + ".");
        
        // Print break after first solution-set.
        System.out.println("");
        
        // Translate both objects (10, -10) per Step #4.
        ellipse.setFrame(ellipse.getX()+10, ellipse.getY()-10, ellipse.getWidth(), ellipse.getHeight());
        circle.setFrame(circle.getX()+10, circle.getY()-10, circle.getWidth(), circle.getHeight());
        
        // Print coordinates per Step #5.
        System.out.print("The coordinates of the bigger ellipse are {(");
        System.out.println(ellipse.getCenterX() + ", " + ellipse.getCenterY() + "), " + ellipse.getWidth() + 
                ", " + ellipse.getHeight() + "}.");
        
        System.out.print("The coordinates of the smaller ellipse are {(");
        System.out.println(circle.getCenterX() + ", " + circle.getCenterY() + "), " + circle.getWidth() + 
                ", " + circle.getHeight() + "}.");
        
        System.out.println("The area of the shaded region is " + 
                areaDifferential + ".");
        
        // Print break after second solution-set.
        System.out.println("");
        
        // Step #6.
        
    }   
}
