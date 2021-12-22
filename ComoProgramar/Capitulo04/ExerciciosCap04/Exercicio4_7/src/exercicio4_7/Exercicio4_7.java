/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_7;

/**
 *  4.7 Determine o valor das variáveis na instrução product *= x++;
 * depois que o cálculo é realizado. Suponha que todas as variáveis sejam 
 * do tipo int e inicialmente tenham o valor 5
 * @author Pedro Filho, 22/12/2021
 */
public class Exercicio4_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int produto = 5;
        int x = 5;
        
        produto *= x++;
        
        System.out.println("Produto = " + produto);
        System.out.println("x = " + x );
    } // fim main
    
}// fi, classe
