/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacomprimentovariavel;

/**
 *  7.14 (Lista de argumento de comprimento variável) Escreva um aplicativo que calcula 
 * o produto de uma série de inteiros que são passados para método product utilizando uma 
 * lista de argumentos de comprimento variável. Teste seu método com várias chamadas, 
 * cada uma com um número diferente de argumentos.
 * @author Pedro 27/02/2022
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ListaComprimentoVariavel {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto arraylist
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        
        // cria o objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // variáveis
        int produto = 0;
        
        adicionarValor(vetor);
        mostrarValores(vetor);      
        produto = produtoVetor(vetor);
        
        System.out.printf("Produto = %d%n", produto );
            
    } // fim main    
    
    public static void adicionarValor( ArrayList<Integer> vetor ) {
            
        // cria o objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // variável
        int numero = 0;
             
        while( numero != -1 ) {

            // entrada de dados
            System.out.print("Digite um inteiro (-1 para sair): ");
            numero = entrada.nextInt();

            if(numero == -1 )
                 break;
            else if( vetor.contains(numero) == false )
               vetor.add(numero);
            else
                System.out.println("Número repetido.");            

        } // fim while       
    
    } // fim adicionar valor
    
    // mètodo mostra valor
    public static void mostrarValores(ArrayList<Integer> vetor ) {
        
        System.out.print("vetor = {");
        
        for( int valor = 0; valor < vetor.size(); valor++ ) {
            System.out.printf("%3d", vetor.get(valor));
        } // fim for
       
        System.out.println(" }");
       
    } // fim mostrar valor
    
    // mètodo produtoo
    public static int produtoVetor( ArrayList<Integer> vetor ) {
        
        int soma = 0;
        for( int valor = 0; valor < vetor.size(); valor++ ) {
            soma += vetor.get(valor);
        } // fim for
        
        return soma * vetor.size();
    } // fim produto
} // fim classe
