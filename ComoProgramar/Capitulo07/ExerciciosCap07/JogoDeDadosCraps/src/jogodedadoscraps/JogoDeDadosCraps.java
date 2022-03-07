/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodedadoscraps;

import java.security.SecureRandom;

/**
 *  7.18 (Jogo de dados Craps) Escreva um aplicativo que executa 1.000.000 de partidas do jogo de dados craps 
 * (Figura 6.8) e responda às seguintes perguntas: 
 * a) Quantos jogos são ganhos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois da vigésima rolagem?
 * b) Quantos jogos são perdidos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois da vigésima rolagem?
 * c) Quais são as chances de ganhar no jogo de dados? [Observação: você deve descobrir que o craps é um dos jogos mais 
 * comuns de cassino. O que você supõe que isso significa?]
 * d) Qual é a duração média de um jogo de dados craps?
 * e) As chances de ganhar aumentam com a duração do jogo?
 * @author Pedro 05/03/2022
 */
public class JogoDeDadosCraps {
    
    // cria o gerador de números aleatorio para rodar no método rola dados
    private static final SecureRandom numeroAleatorio = new SecureRandom();
    
    // tipo enum como constante que representam o estado do jogo
    private enum Status { CONTINUE, VENCEU, PERDEU };
    
    // CONSTANTES que representam lançamentos comuns do jogo
    private static final int DOIS = 2;
    private static final int TRES = 3;
    private static final int SETE = 7;
    private static final int ONZE = 11;
    private static final int DOZE = 12;
    
    // JOGA UMA partida de Craps
    public static void main(String[] args) {
        // TODO code application logic here
        
        // variáveis
        int meusPontos = 0; // se não ganhar ou perder na primeira jogada
       
        Status statusDoJogo; // pode contar CONTINUE, VENCEU, PERDEU
        
        // constante do vetor
        final int NUMERO = 50;
        
        // variáveis
        int venceuNaPrimeira = 0;
        int perdeuNaPrimeira = 0;
        int contaContinue = 0;
        int contarVenceu = 0;
        int contarPerdeu = 0;
        int i;
        
        // declara um vetor
        int[] vetor = new int[NUMERO];
        
        // loop for para executar o jogo
        for( i = 0; i < NUMERO; i++ ) {
        
            int somaDosDados = rolaDados(); // recebe o valor do método rola dados
            
            // DETERMINA o estado do jogo
            switch( somaDosDados ) {

                case SETE:
                case ONZE:
                    statusDoJogo = Status.VENCEU;
                    break;

                case DOIS:
                case TRES:
                case DOZE:
                    statusDoJogo = Status.PERDEU;
                    break;

                default:
                    statusDoJogo = Status.CONTINUE;
                    contaContinue++;
                    meusPontos = somaDosDados;
                    System.out.printf("Meus pontos são: %3d%n", meusPontos);
                    break;
            } // fim switch

            int contador = 0;
            
            // se statusDoJogo diferente de Status.CONTINUE
            if( statusDoJogo != Status.CONTINUE && statusDoJogo == Status.VENCEU ) {
                venceuNaPrimeira += 1;
                if( i <= NUMERO )
                    vetor[ i ] = 1;
            } // fim if
            else if( statusDoJogo != Status.CONTINUE && statusDoJogo == Status.PERDEU ) {
                perdeuNaPrimeira += 1;
                if( i <= NUMERO )
                    vetor[ i ] = 2;
            } // fim else if                
            
            // ENQUANTO O status do jogo igual ao status continue faça
            while( statusDoJogo == Status.CONTINUE ) {

                somaDosDados = rolaDados(); 

                // se soma dos dados igual a meus pontos
                if( somaDosDados == meusPontos )
                    statusDoJogo = Status.VENCEU;                        
                else
                    if( somaDosDados == SETE )
                        statusDoJogo = Status.PERDEU;
               
            } // fim while
           
            // se status do jogo igual a venceu
            if( statusDoJogo == Status.VENCEU ) {
                System.out.println("Você venceu.");
                contarVenceu += 1;               
            } // fim if
            else {
                System.out.println("Você perdeu.");
                contarPerdeu += 1;
            } // fim else
        } // fim for
        
        // imprime relatório
        System.out.println("\nRESUMO DAS JOGADAS");
        System.out.printf("Você rolou os dados %d vezes%n", i );
        System.out.printf("Venceu %d e perdeu %d vezes%n", contarVenceu, contarPerdeu);
        
        System.out.printf("Venceu na primeira rolagem %d vezes%n", venceuNaPrimeira );
        somaVenceu(vetor);
        
        System.out.printf("Perdeu na primeira rolagem %d vezes%n", perdeuNaPrimeira );
        somaPerdeu(vetor);
        
        System.out.printf("Não venceu ou perdeu na 1ª rolagem %d vezes%n", contaContinue);
        
        //mostraVetor(vetor);
        
        
    } // fim main
    
    // método rola dados
    public static int rolaDados() {
        
        int dado1 = 1 + numeroAleatorio.nextInt(6);
        int dado2 = 1 + numeroAleatorio.nextInt(6);
        int soma = dado1 + dado2;
        
        // mostra o resultado desse lançamento
        System.out.printf("Jogador rolou %d + %d = %d%n", dado1, dado2, soma );
        
        return soma;
        
    } // fim rola dados
    
    public static void mostraVetor( int[] vetor ) {
        System.out.printf("%s%8s%n", "Índice", "Valor");
        for( int num = 0; num < vetor.length; num++ ) {
            System.out.printf("%3d%8d%n", num + 1, vetor[ num ]);
        } // fim for
    } //fim MOSTRA VETOR
    
    // somaVenceu
    public static void somaVenceu( int[] vetor ) {
        System.out.print( "Na {" );
        // loop para mostrar a posição que venceu na primeira jogada
        for( int soma = 0; soma < vetor.length; soma++ ) {
            if( vetor[ soma ] == 1 )
                System.out.printf("%3dª", soma + 1);            
        } // fim for soma
        System.out.println(" } Rolagem,\n");
    }// fim soma venceu
    
    
    // somaVenceu
    public static void somaPerdeu( int[] vetor ) {
        System.out.print( "Na {" );
        // loop para mostrar a posição que venceu na primeira jogada
        for( int soma = 0; soma < vetor.length; soma++ ) {
            if( vetor[ soma ] == 2 )
                System.out.printf("%3dª", soma + 1);
        } // fim for soma
        System.out.println(" } Rolagem,\n");
    }// fim soma venceu
    
} // fim classe
