/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp7_06;

/**
 *Programa jogo de dados usando array em vez de switch
 * @author 28/01/2022
 */
import java.security.SecureRandom;

public class Exp7_06 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto SecureRandom
        SecureRandom numerosAleatorios = new SecureRandom();
        
        // vetor com sete elementos
        int[] frequencia = new int[7 ];
        
        // lança dados 6000000 vezes. usa o valor do dado como índice para a frenqûsncia
        for( int rolar = 1; rolar <= 6000000; rolar++ )
            // soma os valores da frequência
            ++frequencia[ 1 + numerosAleatorios.nextInt(6) ];
        
        // cabeçalho
        System.out.printf("%s%13s%n", "Face", "Frequência");
        
        // gera saída do valor de cada elemento do array
        for( int face = 1; face < frequencia.length; face++ )
            // mostra resultado
            System.out.printf("%3d%12d%n", face, frequencia[ face ] );
        
    } // fim main    
} // fim classe