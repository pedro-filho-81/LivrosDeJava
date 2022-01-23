/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp6_04;

/**
 *  Você lança dois dados. Cada dado tem seis faces que contêm um, dois, três, quatro, cinco e seis pontos, 
respectivamente. Depois que os dados param de rolar, a soma dos pontos nas faces viradas para cima é calculada. 
Se a soma for 7 ou 11 no primeiro lance, você ganha. Se a soma for 2, 3 ou 12 no primeiro lance (chamado 
“craps”), você perde (isto é, a “casa” ganha). Se a soma for 4, 5, 6, 8, 9 ou 10 no primeiro lance, essa soma torna-
-se sua “pontuação”. Para ganhar, você deve continuar a rolar os dados até “fazer sua pontuação” (isto é, obter 
um valor igual à sua pontuação). Você perde se obtiver um 7 antes de fazer sua pontuação.
 * @author 23/01/2022
 */

import java.security.SecureRandom;

public class Exp6_04 {

        // cria um gerador seguro de números aleatórios para uso no método rollDice
        private static final SecureRandom randomNumbers = new SecureRandom();
        
        // tipo enum com constantes que representam o estado do jogoÿ
        private enum Status { CONTINUE, WON, LOST }; 
        
        // constantes que representam lançamentos comuns dos dados
        private static final int SNAKE_EYES = 2;
        private static final int TREY = 3;
        private static final int SEVEN = 7;
        private static final int YO_LEVEN = 11;
        private static final int BOX_CARS = 12;
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        int myPoint = 0; // pontos se não ganhar ou perder na 1ª rolagem
        Status gameStatus; // pode conter CONTINUE, WON ou LOSTÿ

        int sumOfDice = rollDice(); // primeira rolagem dos dados
        
        // determina o estado do jogo e a pontuação com base no primeiro lançamento 
        switch ( sumOfDice ) 
        {
            case SEVEN: // ganha com 7 no primeiro lançamento ÿ
            case YO_LEVEN: // ganha com 11 no primeiro lançamentoÿ
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // perde com 2 no primeiro lançamentoÿ
            case TREY: // perde com 3 no primeiro lançamento ÿ
            case BOX_CARS: // perde com 12 no primeiro lançamento ÿ
                gameStatus = Status.LOST;
                break;
            default: // não ganhou nem perdeu, portanto registra a pontuaçãoÿ
                gameStatus = Status.CONTINUE; // jogo não terminouÿ
                myPoint = sumOfDice; // informa a pontuação ÿ
                System.out.printf("Point is %d%n", myPoint);
                break; 
        } // fim switch

        // enquanto o jogo não estiver completo
        while (gameStatus == Status.CONTINUE) // nem WON nem LOST
        { 
            sumOfDice = rollDice(); // lança os dados novamenteÿ

            // determina o estado do jogo
            if (sumOfDice == myPoint) // vitória por pontuação
                gameStatus = Status.WON;
            else
                if (sumOfDice == SEVEN) // perde obtendo 7 antes de atingir a pontuação
                    gameStatus = Status.LOST;
        } // fim while
    } // fim main 
        
        // lança os dados, calcula a soma e exibe os resultados
        public static int rollDice()
        {
            // seleciona valores aleatórios do dado
            int die1 = 1 + randomNumbers.nextInt(6); // primeiro lançamento do dado
            int die2 = 1 + randomNumbers.nextInt(6); // segundo lançamento do dado

            int sum = die1 + die2; // soma dos valores dos dados
        
            // exibe os resultados desse lançamento
            System.out.printf("Player rolled %d + %d = %d%n", 
                                        die1, die2, sum);

            return sum;
        } // fim método       
} // fim classe
