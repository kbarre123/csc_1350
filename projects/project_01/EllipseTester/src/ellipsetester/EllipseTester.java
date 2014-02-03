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
            (ellipse.getX() + (ellipse.getWidth() - ellipse.getHeight())), 
            ellipse.getY(), 
            ellipse.getHeight(), 
            ellipse.getHeight()
        );
        
        // Calculate the verticies of the ellipse and circle.
        double ellipse_x = ellipse.getX();
        double ellipse_y = ellipse.getY();
        double ellipse_r1 = ellipse.getWidth() / 2;
        double ellipse_r2 = ellipse.getHeight() / 2;
        
        double circle_x = circle.getX();
        double circle_y = circle.getY();
        double circle_r1 = circle.getWidth() / 2;
        double circle_r2 = circle.getHeight() / 2;
        
        // Calculate the area between the ellipse and circle.
        double Pi = Math.PI;
        double ellipseArea = (Pi * ellipse.getWidth() * ellipse.getHeight()) / 4;
        double circleArea = Pi * Math.pow(circle.getWidth() / 2.0, 2.0);
        double areaDifferential = ellipseArea - circleArea;
        
        /* TODO!!!!!!!!!!!!!!!!!!!!!!!
         * Test to see if ellipse and circle share the same center, which they
         * currently DON'T!!!!
         * System.out.println(ellipse.getCenterX());
         * System.out.println(ellipse.getCenterY());
         * System.out.println(circle.getCenterX());
         * System.out.println(circle.getCenterY());
         */
        
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
    }   
}
