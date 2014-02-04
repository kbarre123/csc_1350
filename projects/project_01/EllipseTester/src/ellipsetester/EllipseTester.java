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
        
        // Calculate the verticies of the ellipse and circle.
        double ellipse_x = ellipse.getCenterX();
        double ellipse_y = ellipse.getCenterY();
        double ellipse_r1 = ellipse.getWidth();
        double ellipse_r2 = ellipse.getHeight();
        
        double circle_x = circle.getCenterX();
        double circle_y = circle.getCenterY();
        double circle_r1 = circle.getWidth();
        double circle_r2 = circle.getHeight();
        
        // Calculate the area between the ellipse and circle.
        double Pi = Math.PI;
        double ellipseArea = (Pi * ellipse.getWidth() * ellipse.getHeight()) / 4;
        double circleArea = Pi * Math.pow(circle.getWidth() / 2.0, 2.0);
        double areaDifferential = ellipseArea - circleArea;
        
        /* 
         * Print the verticies of the ellipse, circle and the area between the 
         * two.
         */
        System.out.print("The coordinates of the bigger ellipse are {(");
        System.out.println(ellipse_x + ", " + ellipse_y + "), " + ellipse_r1 + 
                ", " + ellipse_r2 + "}.");
        
        System.out.print("The coordinates of the smaller ellipse are {(");
        System.out.println(circle_x + ", " + circle_y + "), " + circle_r1 + 
                ", " + circle_r2 + "}.");
        
        System.out.println("The area of the shaded region is " + 
                areaDifferential + ".");
        
        // Print break after first solution-set.
        System.out.println("");
        
        
    }   
}
