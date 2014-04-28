/*
 * Print uppercase version of Hello World. Replace 'World' with 'Dave'.
 */

package uppercase;

/**
 *
 * @author kcb
 */
public class UpperCase {

    public static void main(String[] args) {
        String word = "Hello, World!";
        System.out.println(word.toUpperCase());
        
        // Replace world with dave.
        System.out.println(word.replace("World", "Dave"));
    }
    
}
