import java.security.SecureRandom;

import java.util.ArrayList;

public class JogoDeDadosCraps18 {
    /**
     * 7.18 (Jogo de dados Craps) Escreva um aplicativo que executa 1.000.000 de partidas 
     * do jogo de dados craps (Figura 6.8) e responda às seguintes perguntas:
     * a) Quantos jogos são ganhos na primeira rolagem, segunda rolagem, …, vigésima 
     * rolagem e depois da vigésima rolagem?
     * b) Quantos jogos são perdidos na primeira rolagem, segunda rolagem, …, vigésima 
     * rolagem e depois da vigésima rolagem?
     * c) Quais são as chances de ganhar no jogo de dados? [Observação: você deve descobrir 
     * que o craps é um dos jogos mais comuns de cassino. O que você supõe que isso significa?]
     * d) Qual é a duração média de um jogo de dados craps?
     * e) As chances de ganhar aumentam com a duração do jogo?
     * Pedro, 06/05/2022
     */

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
        int contagem = 0;
        int venceuNaPrimeira = 0;
        int perdeuNaPrimeira = 0;
        int venceuDepois = 0;
        int perdeuDepois = 0;
        int contaContinue = 0;
        int contarVenceu = 0;
        int contarPerdeu = 0;
        int contarRolaDados = 0;
        int i;
        
        // declara e cria um vetor
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        
        // loop for para executar o jogo
        for( i = 0; i < NUMERO; i++ ) {
        
            // cria a variável soma dos dados que recebe o valor de rola dados
            int somaDosDados = rolaDados(); // recebe o valor do método rola dados
            
            // se a soma dos dados maior que zero
            if( somaDosDados > 0 )
                // soma a contagem de rola dados
                contarRolaDados++;
            
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
            
            // se statusDoJogo diferente de Status.CONTINUE
            if( statusDoJogo != Status.CONTINUE && statusDoJogo == Status.VENCEU ) {
                venceuNaPrimeira += 1;
                vetor.add(1);
            } // fim if
            else if( statusDoJogo != Status.CONTINUE && statusDoJogo == Status.PERDEU ) {
                perdeuNaPrimeira += 1;
                vetor.add(2);
            } // fim else if  2        
            
            // ENQUANTO O status do jogo igual ao status continue faça
            while( statusDoJogo == Status.CONTINUE ) {

                somaDosDados = rolaDados(); 
                
                // se a soma dos dados maior que zero
                if( somaDosDados > 0 )
                    // soma a contagem de rola dados
                    contarRolaDados++;
            
                // se soma dos dados igual a meus pontos
                if( somaDosDados == meusPontos ) {
                    statusDoJogo = Status.VENCEU;
                    venceuDepois += 1;
                    vetor.add(3);
                } // fim if
                else if( somaDosDados == SETE ) {
                        statusDoJogo = Status.PERDEU;
                        perdeuDepois += 1;
                        vetor.add(4);
                } // fim else if
                
                contaContinue++;
                
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
        System.out.printf("Você rolou os dados %d vezes%n", contarRolaDados);        
        System.out.printf("Venceu %d e perdeu %d vezes%n", contarVenceu, contarPerdeu);        
        System.out.printf("1 => Venceu  na primeira rolagem %d vezes%n", venceuNaPrimeira );        
        System.out.printf("2 => Perdeu na primeira rolagem %d vezes%n", perdeuNaPrimeira );        
        System.out.printf("3 => Venceu depois da primeira rolagem %d vezes%n", venceuDepois );        
        System.out.printf("4 => Perdeu depois da primeira rolagem %d vezes%n", perdeuDepois );
        somaFrequencia(vetor);
        
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
        
    // cria método frequência
    public static void somaFrequencia( ArrayList<Integer> vetor ) {
        
        // declara e cria o vetor frequência
        int[] frequencia = new int[ 5 ];
        
        // loop para contar os valores dos elementos do vetor
        for( int valor : vetor ) {
            ++frequencia[ valor ];
        } // fim for
        
        System.out.printf("%n%s%12s%n", "Indice", "Frequencia");
        
        // loop para mostrar os valores da frequencia
        for( int valor = 0; valor < frequencia.length; valor++ ) {
            if( valor > 0)
                System.out.printf("%3d%8d%n", valor, frequencia[valor] );
        } // fim for
        
    } // fim frequencia
    
    public static void mostraVetor( ArrayList<Integer> vetor  ) {
        System.out.printf("%s%8s%n", "Indice", "Valor");
        for( int num = 0; num < vetor.size(); num++ ) {
            System.out.printf("%3d%8d%n", num + 1, vetor.get(num) );
        } // fim for
    } //fim MOSTRA VETOR

} // fim classe