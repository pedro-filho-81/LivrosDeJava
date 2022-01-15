/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5_08;

/**
 * Utilizando o comando break para sair do loop for antes da contagem final
 * @author 15/01/2022
 */
public class Exp5_08 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variável contador
        int contar;
        
        // loop contar até 10
        for( contar = 1; contar <= 10; contar++ ) {
            
            // se contar igual a 5 
            if( contar == 5 ){
                // pare
                break;
            } // fim if
            
            // imprima o valor de contar
            System.out.printf("%d ", contar );
        } // fim for
        
        System.out.printf("%nO loop for foi encerrado quando atingiu o valor %d%n", contar);
    } // fim main    
} // fim classe
