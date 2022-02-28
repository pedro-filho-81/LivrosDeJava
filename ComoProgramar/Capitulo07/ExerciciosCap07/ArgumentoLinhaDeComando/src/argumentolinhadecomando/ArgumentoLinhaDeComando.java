/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argumentolinhadecomando;

/**
 *  7.15 (Argumentos de linha de comando) Reescreva a Figura 7.2 para que o tamanho do array seja especificado 
 * pelo primeiro argumento de linha de comando. Se nenhum argumento de linha de comando for fornecido, utilize 10 
 * como o tamanho padrão do array.
 * @author Pedro 27/02/2022
 */
import java.util.Scanner;
import java.util.ArrayList;

public class ArgumentoLinhaDeComando {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o  objeto vetod da classe Array list
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        
        adicionarValor(vetor);
        mostrarValores(vetor);
        
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
    
} // fim classe
