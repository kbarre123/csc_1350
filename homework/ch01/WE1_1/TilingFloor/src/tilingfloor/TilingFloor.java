/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tilingfloor;
import java.util.Scanner;

public class TilingFloor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tile a floor with square tiles, alternating white & black tiles.
        
        // Declare the variables.
        char w = 'w';
        char b = 'b';
        char previousTile = w;
        char previousRow = w;
        
        // Get input from user, assign to variables.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter tile length:");
        int tileLength = keyboard.nextInt();
        System.out.println("Enter floor length:");
        int floorLength = keyboard.nextInt();
        System.out.println("Enter floor width:");
        int floorWidth = keyboard.nextInt();
        
        // Loop through rows.
        for (int rowCount=0; rowCount<(floorWidth/tileLength); rowCount++) 
        {
            if (previousRow == w) // If previous row started with white, start with black.
            {
                // Loop through columns.
                for(int tileCount=0; tileCount<(floorLength/tileLength); tileCount++)
                {
                    if (previousTile == w)
                    {
                        if (tileCount == (floorLength/tileLength)-1)
                        {
                            System.out.println(b);
                        }
                        else 
                        {
                            System.out.print(b);
                        }
                        previousTile = b;
                        //System.out.print(tileCount);
                    } 
                    else
                    {
                        if (tileCount == (floorLength/tileLength)-1) 
                        {
                            System.out.println(w);
                        }
                        else 
                        {
                            System.out.print(w);
                        }
                        previousTile = w;
                    }
                }  
            } 
            else // If previous row started with black, start with white.
            {
                for(int tileCount=0; tileCount<(floorLength/tileLength); tileCount++)
                {
                    if (previousTile == b)
                    {
                        if (tileCount == (floorLength/tileLength)-1)
                        {
                            System.out.println(w);
                        }
                        else 
                        {
                            System.out.print(w);
                        }
                        previousTile = w;
                    } 
                    else
                    {
                        if (tileCount == (floorLength/tileLength)-1)
                        {
                            System.out.println(b);
                        }
                        else 
                        {
                            System.out.print(b);
                        }
                        previousTile = b;
                    }
                }
            }
        }
    }
}