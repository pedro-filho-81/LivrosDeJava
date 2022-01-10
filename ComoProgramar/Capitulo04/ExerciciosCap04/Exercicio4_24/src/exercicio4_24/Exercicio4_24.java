/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_24;

/**
 *4.24 (Validando entrada de usuário) Modifique o programa na Figura 4.12 para validar suas entradas.
 * Para qualquer entrada, se o valor entrado for diferente de 1 ou 2, continue o loop até o usuário inserir um valor correto.
 * @author Pedro Filho, 10/01/2022
 */

import java.util.Scanner;

public class Exercicio4_24 {

    public static void main(String[] args) {
        // TODO code application logic here

        // cria o objeto para a classe Scanner
        Scanner entrada = new Scanner( System.in);
        
        // variáveis
        int contador = 0;
        int senha;
        
        // entrada de dados
        System.out.println("Digite sua senha: " );
        senha = entrada.nextInt(); // entrada de senha do usuário
        
        // enquanto senha diferente de 1 ou 2 faça
        while( contador < 3 ) {
            
            // se senha igual a 1 faça
            if( senha == 1 ) {
                System.out.println("Senha digitada corretamente.");
                contador = 3; // contador recebe 3 fim do programa
            } // fim if
           // se senha igual a 2
            else if ( senha == 2 ) {
               System.out.println("Senha digitada corretamente.");
               contador = 3; // contador recebe 3 fim do programa
           } // fim if
           else {
               System.out.println("Senha indevida!");
               
            // entrada de dados
            System.out.println("Digite sua senha: " );
            senha = entrada.nextInt(); // entrada de senha do usuário
           } // fim else
                
           // incrementa contador
           contador++;                   
           
        } // fim while
    } // fim main
} // fim classe
