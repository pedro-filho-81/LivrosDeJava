/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliminaduplicatasrepetidas;

import java.security.SecureRandom;

/**
 * 7.12 (Eliminação de duplicatas) Utilize um array unidimensional para resolver o seguinte problema: 
 * escreva um aplicativo que insere cinco números, cada um entre 10 e 100, inclusive. 
 * Enquanto cada número é lido, exiba-o somente se ele não tiver uma duplicata de um número 
 * já lido. Cuide de tratar o “pior caso”, em que todos os cinco números são diferentes. 
 * Utilize o menor array possível para resolver esse problema. Exiba o conjunto completo de valores únicos 
 * inseridos depois que o usuário inserir cada valor novo.
 * @author Pedro Filho, 20/02/2022
 */

public class EliminaDuplicatasRepetidas {

    public static void main(String[] args) {
        // TODO code application logic here

        // declara o vetor para 5 elementos
        int[] vetor = new int[ 15 ];
        
        // cabeçalho
        System.out.println("Índice  Valor  Repetido");
        
        // loop para dicionar valores ao vetor
        for( int adicionar = 0; adicionar < vetor.length; adicionar++ ) {
           
            // vetor recebe valores do método adicionarValor
            // após a verificação pelo método se o valor é um número repedido
            vetor[ adicionar ] = adicionarValor(vetor);
        
        } // fim for adicionar valor
        
        mostrarValores(vetor); // mostra os elementos do vetor
        
    } // fim main
    
    // método adiciona e verifica a duplicidade dos valores
    public static int adicionarValor( int[] vetor ) {
        
        // cria objeto para classe SecureRandom
        SecureRandom numAleatorio = new SecureRandom();
        
        // variável
        int resultado = 0; // para os valores aleatórios
        
        // loop para adicionar valores
        for( int adicionar = 0; adicionar < vetor.length; adicionar++ ) {
            
            // gera um (valor) número aleatório entre 10 e 100 inclusive
            // e atribui a variável resultado
            resultado = 10 + numAleatorio.nextInt(90);
            
            // loop para pesquisar os valores no vetor
            // toda vez que é gerado um valor o loop for pesquisa o vetor
            for( int valor = 0; valor < vetor.length; valor++ ) {            
            
                // verifica se o valor no vetor é igual ao resultado
                if( vetor[ valor ] == resultado ) // se igual                
                   
                    //  imprime o valor que já tem no vetor
                    System.out.printf("%3dº  %5d  %8b%n",valor + 1, resultado, vetor[valor]);  
                                    
            } // fim for pesquisar valor
            
        } // fim for adicionar valor
        
         // retorna o valor aleatório que não tem no vetor
        return resultado;
        
    } // fim método adicionar valor
    
    // método mostrar valores
    public static void mostrarValores(int[] vetor) {
        
        // cabeçalho
        System.out.print("vetor = { "); 
        
        // loop para mostrar os valores do vetor
        for( int valor : vetor ) 
        
            // imprime o valor
            System.out.printf("%d ", valor);        
        System.out.println("};");
        
    } // fim método mostrar valor
    
} // fim classe
