/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliminaduplicatarepetida2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Elimina duplicata repetida 2 usando a classe Arrays
 * @author Pedro, 24/02/2022
 */
public class EliminaDuplicataRepetida2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto array list
        ArrayList<Integer> duplicatas = new ArrayList<Integer>();
        
        // cria um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);
        
        // variável
        int numero = 0;
        
        // loop para adicionar valores ao vetor
        while( numero != -1 ) {
          
            // entrada de dados
            System.out.print("Digite o número da duplicata ( -1 para sair ): ");
            // aguarda entrada do usuário
            numero = entrada.nextInt();
            
            // se umero igual a -1
            if( numero == -1 )
                // sair do loop
                break;
            
            // verifica se o número digitado consta no vetor
            if( duplicatas.contains(numero) == false ) // se falso
                // adiciona o número ao vetor
                duplicatas.add(numero);
            else 
                System.out.println("Duplicata repetida");
                                
        } // fim while
        
        System.out.println("\nDuplicatas cadastradas:");
        mostrarValores(duplicatas);
        
        // pula linha
        System.out.println();     
        
    } // fim main

    // cria método para mostrar os valores do vetor
    public static void mostrarValores( ArrayList<Integer> duplicatas ) {
        
        System.out.print("duplicatas = { ");
        
        for (Integer duplicata : duplicatas) {
            // imprime o valor
            System.out.printf("%s ", duplicata );
        }   // fim for
        
        System.out.println("};");
            
    } // fim método mostrar valores

} // fim classe
