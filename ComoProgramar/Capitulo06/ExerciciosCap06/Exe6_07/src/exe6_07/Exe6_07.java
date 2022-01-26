/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe6_07;

/**
 *  6.7 Qual é o valor de x depois que cada uma das seguintes instruções é executada?
a) x = Math.abs(7.5);
b) x = Math.floor(7.5);
c) x = Math.abs(0.0);
d) x = Math.ceil(0.0);
e) x = Math.abs(-6.4);
f) x = Math.ceil(-6.4);
g) x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
 * @author Pedro, 26/01/2022
 */
public class Exe6_07 {

    public static void main(String[] args) {
        // TODO code application logic here
                
            // 6.7 Qual é o valor de x depois que cada uma das seguintes instruções é executada?
            // a) x = Math.abs(7.5);
            double  x = Math.abs(7.5);
            System.out.printf(" x = Math.abs(7.5) = %.2f%n", Math.abs(7.5) );
         
            //b) x = Math.floor(7.5);
            double  x1 = Math.floor(7.5);
            System.out.printf(" x1 = Math.floor(7.5) = %.2f%n", Math.floor(7.5) );
         
           //c) x = Math.abs(0.0);
            double  x2 = Math.abs(0.0);
            System.out.printf(" x2 = Math.abs(0.0) = %.2f%n", Math.abs(0.0) );
         
           // d) x = Math.ceil(0.0);
           double  x3 = Math.ceil(7.5);
           System.out.printf(" x3 = Math.ceil(7.5) = %.2f%n", Math.ceil(7.5) );
         
           // e) x4 = Math.abs(-6.4);
           double  x4 = Math.abs(-6.4);
           System.out.printf(" x4 = Math.abs(-6.4) = %.2f%n", Math.abs(-6.4) );
           
            // f) x = Math.ceil(-6.4);
           double  x5 = Math.ceil(-6.4);
           System.out.printf(" x5 = Math.ceil(-6.4) = %.2f%n", Math.ceil(-6.4) );
           
           // g) x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
           double x6 = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
           System.out.printf(" x6 = Math.ceil(-Math.abs(-8 + Math.floor(-5.5))) = %.2f%n", Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));        
    } // fim main    
} // fim classe