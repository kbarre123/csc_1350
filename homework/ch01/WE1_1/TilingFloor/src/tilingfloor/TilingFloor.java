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
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter tile length:");
        int tileLength = keyboard.nextInt();
        System.out.println("Enter floor length:");
        int floorLength = keyboard.nextInt();
        System.out.println("Enter floor width:");
        int floorWidth = keyboard.nextInt();
        
        for (int rowCount=0; rowCount<(floorWidth/tileLength); rowCount++) 
        {
            if (previousRow == w) 
            {
                for(int tileCount=0; tileCount<((floorLength/tileLength)); tileCount++)
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
            else 
            {
                for(int tileCount=0; tileCount<=((floorLength/tileLength)-1); tileCount++)
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
                        //System.out.print(tileCount);
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
         
        
        /* If there is room to the South, locate tile at beginning of row. If it's
         * black, place a white tile South of it. Complete the row. If there's no
         * room to the south on the next row, stop.
        */
        
        //Move build message to new line.
        System.out.println(" ");
    }
}