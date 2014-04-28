/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package productprinter;

/**
 *
 * @author kbarr17
 */
public class ProductPrinter 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Construct two products
        Product p1 = new Product("chicken", 6.0);
        Product p2 = new Product("pork", 7.0);
        
        System.out.printf("Product name: %s\n", p1.getName());
        System.out.printf("Product name: %s\n", p1.getPrice());
        System.out.println("");
        System.out.printf("Product name: %s\n", p2.getName());
        System.out.printf("Product name: %s\n", p2.getPrice());
        System.out.println("");
        
        p1.reducePrice(5);
        p2.reducePrice(5);
        
        System.out.printf("Product name: %s\n", p1.getName());
        System.out.printf("Product name: %s\n", p1.getPrice());
        System.out.println("");
        System.out.printf("Product name: %s\n", p2.getName());
        System.out.printf("Product name: %s\n", p2.getPrice());
    }
}
