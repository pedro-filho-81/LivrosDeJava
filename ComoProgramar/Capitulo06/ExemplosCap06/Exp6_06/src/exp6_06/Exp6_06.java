/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp6_06;

/**
 * Demonstração de método sobrecarregado
 * @author 23/01/2022
 */
public class Exp6_06 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.printf("Square of integer 7 is %d%n", square(7) );
        System.out.printf("Square of double 7.5 is %f%n", square(7.5) );
    } // fim main

    // método square com argumento de int 
    public static int square(int intValue)
    { 
        System.out.printf("%nCalled square with int argument: %d%n", intValue); 
        
        return intValue * intValue; 
    } // fim método
    
    // método square com argumento double 
    public static double square(double doubleValue)
    { 
            System.out.printf("%nCalled square with double argument: %f%n", doubleValue); 

            return doubleValue * doubleValue; 
    }// fim método

} // fim classe
