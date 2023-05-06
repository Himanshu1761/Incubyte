/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Incubyte_test;

import static Incubyte_test.Incubyte.Add;
import static Incubyte_test.Incubyte.Negative;
import static Incubyte_test.Incubyte.Unknownamountofnumbers;
import static Incubyte_test.Incubyte.newline;



/**
 *
 * @author pc
 */
public class Mainclass {
    
    public static void main(String[] args){
         Add(""); //Test Case Pass-1
        Unknownamountofnumbers("3,2,5,6");//Handles unknown amount of numbers. Test Case Passes-3
        int a=newline("3,6n15");//Different delimiters. Test Case Passes-4
        System.out.println(a);
        Negative("-3,-5");//When negative no is thrown runtime exception is generated. Test Case Passes-2
        
    }
}
