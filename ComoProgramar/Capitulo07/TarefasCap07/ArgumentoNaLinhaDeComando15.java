import java.security.SecureRandom;

public class ArgumentoNaLinhaDeComando15 {
    /**
     * 7.15 (Argumentos de linha de comando) Reescreva a Figura 7.2 para que
     * o tamanho do array seja especificado pelo primeiro argumento de
     * linha de comando. Se nenhum argumento de linha de comando for fornecido,
     * utilize 10 como o tamanho padrão do array
     * Pedro, 24/05/2022
     */
    public static void main(String[] args) {

        // variável
        int tamanho = 10;

        // entrada do usuário na linha de comando
        tamanho = Integer.parseInt(args[0]);

        // vetor
        int[] vetor = new int[tamanho];

        // chama adicionar valores
        adicionar(vetor);

        // chama mostrar valores
        mostrar(vetor);

    } // fim mmain

    public static void adicionar(int[] vetor) {
        // objeto Secure Random
        SecureRandom aleatorio = new SecureRandom();

        // loop for para adicionar valores ao vetor
        for (int i = 0; i < vetor.length; i++) {
            // adicionando valores aleátorios ao vetor
            vetor[i] = 1 + aleatorio.nextInt(50);
        } // fim for

    } // fim adicioanr

    // mostra valores do veetor
    public static void mostrar(int[] vetor) {
        // cabeçalho
        System.out.println("\nVetor: ");
        // loop for para mostrar os valores do vetor
        for (int i = 0; i < vetor.length; i++)
            // mostra os valores do vetor
            System.out.printf("%3d", vetor[i]);
        // pula linha
        System.out.println();
    } // fim mostrar valor

} // fim classe