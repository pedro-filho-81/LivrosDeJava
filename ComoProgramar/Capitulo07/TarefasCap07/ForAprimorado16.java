public class ForAprimorado16 {
    /**
     * 7.16 (Usando a instrução for aprimorada) Escreva um aplicativo que
     * usa uma instrução for aprimorada para somar os valores double
     * passados pelos argumentos de linha de comando.
     * [Dica: utilize o método static parseDouble da classe Double para
     * converter uma String em um valor double.]
     * Pedro, 24/05/2022
     */
    public static void main(String[] args) {

        // variáveis double recebe argummento na linha de commando
        // commpilação: javac ForAprimorado16.java 
        // exp na linha de comando: java ForAprimorado16.java 1 2 3 4
        double n1 = Integer.parseInt(args[0]);
        double n2 = Integer.parseInt(args[1]);
        double n3 = Integer.parseInt(args[2]);
        double n4 = Integer.parseInt(args[3]);

        // vetor
        double[] vetor = { n1, n2, n3, n4 };

        // calcula valores de n1 e n2
        double soma = 0;

        // loop for aprimmorado
        for (double valor : vetor)

            // soma os valores do vetor
            soma += valor;

        // cabeçalho
        System.out.println("\nVetor: ");

        // loop for aprimorado para mostrar valores do vetor
        for (double valor : vetor)

            // imprimme os valores do vetor
            System.out.printf("%7.2f", valor);

        // imprime a soma dos valores do vetor
        System.out.printf("\nSoma = %.2f\n", soma);

    } // fim main
} // fim classe