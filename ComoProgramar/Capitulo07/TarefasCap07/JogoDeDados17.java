import java.security.SecureRandom;

public class JogoDeDados17 {
    /**
     * 7.17 (Jogo de dados) Escreva um aplicativo para simular o lançamento de dois dados. 
     * O aplicativo deve utilizar um objeto de classe Random, uma vez para lançar o primeiro 
     * dado e novamente para lançar o segundo dado. A soma dos dois valores deve então ser calculada. 
     * Cada dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar 
     * de 2 a 12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. 
     * A Figura 7.28 mostra as 36 possíveis combinações de dois dados. Seu aplicativo deve lançar 
     * o dado 36.000.000 vezes. Utilize um array unidimensional para contar o número de vezes que 
     * cada possível soma aparece. Exiba os resultados em formato tabular.
     * Pedro, 26/05/2022
     */
    public static void main(String[] args) {
        
        // constante
        final int NUM_DE_VEZES = 36000000;
        // vetor
        int[] dados = new int[NUM_DE_VEZES];

        // chama método adicionar
        adicionar(dados, NUM_DE_VEZES);

        // chama método mmostrar
        mostrar(dados, NUM_DE_VEZES);

    } // fim main

    // adicionar valor
    public static void adicionar(int[] vetor, int numDeVezes) {
        
        // objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

            // loop for para adicionar valores aos dados
            for(int i = 0; i < numDeVezes; i++) {
                
                // dados recebe valor aleatório
                int dado1 = 1 + aleatorio.nextInt(6);
                int dado2 = 1 + aleatorio.nextInt(6);

                // vetor recebe a soma dos dados
                vetor[i] = dado1 + dado2;

            } // fim for
    } // fim adicionar

    // mmostrar valor
    public static void mostrar(int[] vetor, int numDeVezes) {

        // vetor
        int[] frequencia = new int[13];

        // loop for para atribuir valores ao vetor
        for(int i = 0; i < numDeVezes; i++) {
            // vetor soma os valores
            ++frequencia[vetor[i]];
        } // fim for

        // cabeçalho
        System.out.printf("%s%15s%n", "Indice", "Frequência");

        // loop for para mostra os valores da frequencia
        for(int j = 2; j < frequencia.length; j++) {
            // mostra os valores da frequenia
            System.out.printf("%3d%15d%n", j, frequencia[j]);
        } // fimm for

        // pula linha
        System.out.println();
        
    } // fim mostrar

} // fim classe