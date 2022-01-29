/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp7_07;

/**
 *  Vinte estudantes foram solicitados a classificar em uma escala de 1 a 5 
 * a qualidade da comida no refeitório estudantil, com 1 sendo “horrível” e 
 * 5 sendo “excelente”. Coloque as 20 respostas em um array de inteiros e 
 * determine a frequência de cada classificação
 * @author 28/01/2022
 */

public class Exp7_07 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria array de resposta
        int[] respostas = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 6, 3, 3, 3, 2, 3, 3, 2, 4 };
        
        int[] frequencia = new int[ 6 ];
        
        // cabeçalho
        System.out.printf("%s%10s%n", "Índice", "Valores");
        
        // loop para mostrar os valores do vetor
        for( int contar = 0; contar < respostas.length; contar++ ) {
            System.out.printf("%3d%10d%n", contar, respostas[contar]);
        } // fim for contar
        
        //para cada resposta, seleciona um elemento de respostas e utiliza esse valor
        // como índice de frequência para determinar o elemento e incrementar
        for( int resposta = 0; resposta < respostas.length; resposta++ ) {
            try
            {
                ++frequencia[ respostas[ resposta ] ];
            } // fim try
            catch(ArrayIndexOutOfBoundsException e )
            {
                System.out.println( e ); // invoca o método toString
                System.out.println("Este elemento do vetor está fora dos limites da exceção [ " + respostas[ resposta ] + " ]" );
                System.out.printf("respostas[ %d ] = %d%n%n", resposta, respostas[ resposta ] );
            } // fim catch
        } // fim for resposta
        
        System.out.printf("%s%15s%n", "Índice", "Frequência");
        
        // gera a saída  dos valoresdo vetor
        for( int indice = 1; indice < frequencia.length; indice++ )
            System.out.printf("%6d%10d%n", indice,  frequencia[indice] );
    } // fim main    
} // fim classe