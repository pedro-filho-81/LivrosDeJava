/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atribuindovalorparax;

/**
 *4.3 Escreva quatro instruções Java diferentes que adicionam 1 à variável de inteiro x.
 * @author Pedro Filho, 21/12/2021
 */
public class Atribuindo4valoresParaX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // atribuindo valores para x
        // criando e inicializando a variável x
        int x = 1; // x recebe 1
        System.out.println("Cria e inicializa x com 1: int x = "+ 1 );
        
        x += 1; // x recebe a soma de 1
        System.out.println("Soma 1 a x:  x += 1 => " + x);
        
        x++; //  pós-incrementa x em 1
        System.out.println("Pós-incrementa x com 1: x++ =>  " + x );
        
        ++x; // pré-incrementa x em 1
        System.out.println("Pré-incrementa x em 1: ++x => " + x );
        
        System.out.println("Acima 4 maneiras de atribuir o valor 1 a x");
    } // fim main    
} // fim classe
