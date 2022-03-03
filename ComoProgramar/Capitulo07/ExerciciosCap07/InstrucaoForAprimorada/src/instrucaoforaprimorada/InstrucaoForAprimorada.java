/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrucaoforaprimorada;

/**
 *  7.16 (Usando a instrução for aprimorada) 
 * Escreva um aplicativo que usa uma instrução for aprimorada para somar os valores double
 * passados pelos argumentos de linha de comando. 
 * [Dica: utilize o método static parseDouble da classe Double para converter uma String em um valor double.]
 * @author Pedro, 03/03/2022
 */

import java.util.Scanner;

public class InstrucaoForAprimorada {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // entrada de dados
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = entrada.nextInt();
        
        // declara um vetor
        double[] vetor = new double[tamanho ];
        
        // chama método adicionar valor
        adicionarValor(vetor, tamanho );
    
        // chama método mostrar valor
        mostrarValor(vetor);
    } // fim main
    
    // método adicionar valor
    public static void adicionarValor( double[] vetor, int tamanho ) {
        
        // cria o objeto Scanner
        Scanner entrada = new Scanner(System.in);
        int indice = 0; // para o índice do vetor
        
        // loop for aprimorado para atribuir valor ao vetor
        while( indice < tamanho ) {
            
            System.out.print("Digite um valor de ponto-flutuante: ");
            double valor = entrada.nextDouble();  
            
            double resposta = pesquisarValor(vetor, valor, tamanho);
        
            while( true ) {
                if( resposta == -1 ) {
                    System.out.println("Valor repetido;");
                    break;
                } // fim if
                else {
                    vetor[ indice ] = resposta;
                    indice++;
                    break;
                } // fim else
            } // fim while resposta,,,            
        } // fim while indice 
        
    } // fim adicionar valor
    
    // método pesquisar valor
    public static double pesquisarValor( double[] vetor, double valor, int tamanho ) {
        
        int indice = 0;
        
        while( indice < tamanho) {
        
            if( vetor[ indice ] == valor ) {
                return -1.0;
            } // fim if
            
            indice++;
        } // fim while
        
        return valor;
    } // fim pesquisar valor
    
    // cria método mostrar valor
    public static void mostrarValor( double[] vetor) {
    
        System.out.print("vetor = {");
        
        for( double valor : vetor ) {
            System.out.printf("%5.2f ", valor );
        } // fim for aprimorado
        
        System.out.println(" };");
        
    } // fim mostrar valor
    
} // fim classe
