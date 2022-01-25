/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe6_03;

/**
 * Biblioteca Math
 * @author Pedro, 25/01/2022
 */
public class Exe6_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // valor de pi
        System.out.printf("Constante Math.PI = %.10f%n", Math.PI );
        
        // valor de E
        System.out.printf("%nConstante Math.E = %.10f%n", Math.E );
        
        // imprime o valor absoluto
        System.out.printf("%nMath.abs(23,7) = %f%n", Math.abs(23.7) );
        System.out.printf("Mat.abs(0,0) = %f%n", Math.abs(0.0) );
        System.out.printf("Math.abs(-23.7) = %f%n", Math.abs(-23.7) );
        
        // arredonda para o menor valor
        System.out.printf("%nMath.ceil(9,2) = %f%n", Math.ceil(9.2) );
        System.out.printf("Math.ceil(-9,8) = %f%n", Math.ceil(-9.8) );
        
        // arredonda para o maior valor
        System.out.printf("%nMath.floor(9,2) = %f%n", Math.floor(9.2) );
        System.out.printf("Math.floor(-9,8) = %f%n", Math.floor(-9.8) );
        
        // coseno
        System.out.printf("%nMath.cos(0,0) = %f%n", Math.cos(0.0) );
        // seno
        System.out.printf("%nMath.sin(0,0) = %f%n", Math.sin(0.0) );
        // tangente
        System.out.printf("%nMath.tan(0,0) = %f%n", Math.tan(0.0) );        
        
        //exponencial
        System.out.printf("%nMath.exp(1,0) = %f%n", Math.exp(1.0) );
        System.out.printf("Math.exp(2,0) = %f%n", Math.exp(2.0) );
        
        // logaritimo
        System.out.printf("%nMath.log(Math.E) = %f%n", Math.log(Math.E) );
        System.out.printf("Math.log(Math.E * Math.E) = %f%n", Math.log(Math.E * Math.E) );
        
        // maior valor entre x e y
        System.out.printf("%nMath.max(2.3, 12.7) = %f%n", Math.max(2.3, 12.7) );
        System.out.printf("Math.max(-2.3, -12,7) = %f%n", Math.max(-2.3, -12.7) );
        
        // menor valor entre x e y
        System.out.printf("%nMath.min(2.3, 12.7) = %f%n", Math.min(2.3, 12.7) );
        System.out.printf("Math.min(-2.3, -12,7) = %f%n", Math.min(-2.3, -12.7) );
        
        // potência de x
        System.out.printf("%nMath.pow(2.0, 7,0) = %f%n", Math.pow(2.0, 7.0) );
        System.out.printf("Math.pow(9,0, 0,5) = %f%n", Math.pow(9.0, 0.5) );
        
        // raiz quadrada
        System.out.printf("%nMath.sqrt(900,0) = %f%n", Math.sqrt(900.0) );
    } // fim main    
} // fim classe
