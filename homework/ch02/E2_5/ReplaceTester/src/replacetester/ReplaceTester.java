/*
 * Replace all letters "i" with "!" and all letters "s" with "$" in the string
 * Mississippi.
 */
package replacetester;

/**
 *
 * @author kbarr17
 */
public class ReplaceTester {

    public static void main(String[] args) {
        // Construct string.
        String target = "Mississippi";
        
        // Replace "i" with "!".
        target = target.replace("i", "!");
        
        // Replace "s" with "$".
        target = target.replace("s", "$");
        
        // Print results.
        System.out.println(target);
    }
}
