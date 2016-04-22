/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomnumbers;
import java.util.*;



public class dice {

    
    public static void main(String[] args) {
        Random dice = new Random();
        int numbers;
        for (int counter=1;counter<=10;counter++)
        {
            numbers = 1+ dice.nextInt(6);
            System.out.println(numbers + "");
        }
        
    }
    
}
