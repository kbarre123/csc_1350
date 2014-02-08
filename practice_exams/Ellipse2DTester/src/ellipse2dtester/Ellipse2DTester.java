package ellipse2dtester;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author kcb
 */
public class Ellipse2DTester {

    public static void main(String[] args) {
        // #1: Create  an ellipse.
        Ellipse2D.Double outerEllipse = new Ellipse2D.Double(
            10,     // X origin coordinate
            20,     // Y origin coordinate
            100,    // width
            60      // height
        );
        
        // #2: Create a second ellipse.
        Ellipse2D.Double innerEllipse = new Ellipse2D.Double(
            (outerEllipse.getX() + (outerEllipse.getWidth() - outerEllipse.getHeight()) / 2),     // X origin coordinate
            outerEllipse.getY(),        // Y origin coordinate
            outerEllipse.getHeight(),   // width
            outerEllipse.getHeight()    // height
        );
        
        // #3: Display the location, width, and height of each ellipse
        System.out.println("After creating the ellipses:");
        System.out.println("<-BIG ELLIPSE->");
        System.out.print("location: (" +  outerEllipse.getX() + ", "); 
        System.out.println(outerEllipse.getY() + ")"); 
        System.out.println("width: " + outerEllipse.getWidth());
        System.out.println("height: " + outerEllipse.getHeight()); 
        
        System.out.println("<-SMALL ELLIPSE->");
        System.out.print("location: (" +  innerEllipse.getX() + ", "); 
        System.out.println(innerEllipse.getY() + ")"); 
        System.out.println("width: " + innerEllipse.getWidth());
        System.out.println("height: " + innerEllipse.getHeight());
        
        // Calculate the area of the shaded region.
        double outerArea = (Math.PI * (outerEllipse.getWidth() * outerEllipse.getHeight())) / 4;
        double innerArea = (Math.PI * (innerEllipse.getWidth() * innerEllipse.getHeight())) / 4;
        double areaDifferential = outerArea - innerArea;
        
        // #4: Display the area differential.
        System.out.println("Area of shaded region: " + areaDifferential);
        System.out.println("");
        
        // #5: Translate each ellipse rightwards by 10 and downwards by 15.
        outerEllipse.setFrame(outerEllipse.getX() + 10, outerEllipse.getY() + 15, outerEllipse.getWidth(), outerEllipse.getHeight());
        innerEllipse.setFrame(10, 15, innerEllipse.getWidth(), innerEllipse.getHeight());
        
        // #6: Change width of smaller ellipse so that its width is 0.75 the width of big one.
        innerEllipse.setFrame(innerEllipse.getX(), innerEllipse.getY(), outerEllipse.getWidth()*0.75, innerEllipse.getHeight());
        
        // #7: Shift smaller ellipse so that it shares a center with the bigger one again.
        innerEllipse.setFrame((outerEllipse.getX() + ((outerEllipse.getWidth() - innerEllipse.getWidth())/2)), 
                outerEllipse.getY(), 
                innerEllipse.getWidth(), 
                innerEllipse.getHeight()
        );
        
        // #8: Print location, width and height again.
        System.out.println("After shifting and resizing the ellipses:");
        System.out.println("<-BIG ELLIPSE->");
        System.out.print("location: (" +  outerEllipse.getX() + ", "); 
        System.out.println(outerEllipse.getY() + ")"); 
        System.out.println("width: " + outerEllipse.getWidth());
        System.out.println("height: " + outerEllipse.getHeight()); 
        
        System.out.println("<-SMALL ELLIPSE->");
        System.out.print("location: (" +  innerEllipse.getX() + ", "); 
        System.out.println(innerEllipse.getY() + ")"); 
        System.out.println("width: " + innerEllipse.getWidth());
        System.out.println("height: " + innerEllipse.getHeight());
        
        // Calculate the area of the shaded region again.
        outerArea = (Math.PI * (outerEllipse.getWidth() * outerEllipse.getHeight())) / 4;
        innerArea = (Math.PI * (innerEllipse.getWidth() * innerEllipse.getHeight())) / 4;
        areaDifferential = outerArea - innerArea;
        
        // #9: Display the area differential.
        System.out.println("Area of shaded region: " + areaDifferential);
    }
    
}
