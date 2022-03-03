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
        int tamanho = entrada.nextInt(); // usuário informa o tamanho do vetor
        
        // declara um vetor e determina o seu tamanho
        double[] vetor = new double[tamanho ];
        
        // chama método adicionar valor ao vetor
        adicionarValor(vetor, tamanho );
    
        // chama método mostrar valor do vetor
        mostrarValor(vetor);
    } // fim main
    
    // método adicionar valor
    public static void adicionarValor( double[] vetor, int tamanho ) {
        
        // cria o objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // variável para o indice do vetor
        int indice = 0; // para o índice do vetor
        
        // loop while enquanto o indice for menor que o tamanho do vetor faça
        while( indice < tamanho ) {
            
            // entrada de dados
            System.out.print("Digite um valor de ponto-flutuante: ");
            // aguarda a entrada do valor do elemento do vetor pelo uauário
            double valor = entrada.nextDouble();  
            
            // cria a variável resposta que 
            // chama o método pasquisar valor que recebe como argumentos
            // o vetor, o valor do usuário e o tamanho do vetor
            // o método verifica se o valor já existe no vetor
            // se exitir é retornado o valor -1
            // se não existir o valor ele é adicionado ao vetor
            double resposta = pesquisarValor(vetor, valor, tamanho);
        
            // cria um loop infinito
            while( true ) {
                
                // verifica se a resposta é igual a -1
                if( resposta == -1 ) { // se verdade
                    // é impresso a mensagem
                    System.out.println("Valor repetido;");
                    break; // e sai do loop infinito
                } // fim if
                else { // se a resposta for diferente de -1
                    // o valor digitado é adicionado ao vetor 
                    vetor[ indice ] = resposta;
                    // e ao índice é adicionado 1
                    indice++;
                    break; // e sai do loop infinito
                } // fim else
                
            } // fim loop infinito
        } // fim while indice         
    } // fim adicionar valor
    
    // método pesquisar valor
    public static double pesquisarValor( double[] vetor, double valor, int tamanho ) {
        
        // cria o indice do vetor
        int indice = 0; //  começando em 0
        
        // loop enquanto o indice for menor que o tamanho faça
        while( indice < tamanho) {
        
            // verifica no vetor se existe um valor igual ao digitado pelo usuário
            if( vetor[ indice ] == valor ) { // se existir
                // retorna o valor -1.0 e sai do método
                return -1.0;
            } // fim if
            else // se não existir
                indice++; // incrementa o indice em 1
        } // fim while
        
        // e retorna o valor digitado
        return valor;
    } // fim pesquisar valor
    
    // cria método mostrar valor
    public static void mostrarValor( double[] vetor) {
    
        System.out.print("vetor = {");
        // loop com o for aprimorado para mostrar os valores do vetor
        for( double valor : vetor ) {
            // imprime os valores do vetor
            System.out.printf("%5.2f ", valor );
        } // fim for aprimorado
        
        System.out.println(" };");
        
    } // fim mostrar valor
    
} // fim classe
