/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroaleatorioespecifico;

/**
 *  6.13 Escreva instruções que exibirão um número aleatório de cada um dos seguintes conjuntos:
        a) 2, 4, 6, 8, 10.
        b) 3, 5, 7, 9, 11.
        c) 6, 10, 14, 18, 22.
 * @author Pedro, 24/02/2022
 */
import java.security.SecureRandom;

public class NumeroAleatorioEspecifico {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto para SecureRandom
        SecureRandom numeroAleatorio = new SecureRandom();
        
        System.out.println("Imprime um dos valores: a) 2, 4, 6, 8, 10.");
        for( int i = 0; i <= 5; i++ ) {
            int par = numeroAleatorio.nextInt(11);
            if( par > 0 && par % 2 == 0 ) {
                System.out.println(par);
                break;
            } // fim if
        } // fim for
        
        System.out.println("Imprime um dos valores: b) 3, 5, 7, 9, 11.");
        for( int i = 0; i <= 5; i++ ) {
            int impar = numeroAleatorio.nextInt(12);
            if( impar > 2 && impar % 2 != 0 ) {
                System.out.println(impar);
                break;
            } // fim if
        } // fim for
        
        System.out.println("Imprime um dos valores: c) 6, 10, 14, 18, 22.");
        for( int i = 0; i <= 15; i++ ) {
            int par = numeroAleatorio.nextInt(23);
            if( par == 6 || par == 10 || par == 14 || par == 18 || par == 22) {
                System.out.println(par);
                break;
            } // fim if
        } // fim for
            
    } // fim mani    
} // fim classe
