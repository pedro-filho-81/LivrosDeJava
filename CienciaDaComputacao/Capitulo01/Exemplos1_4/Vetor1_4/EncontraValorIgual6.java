import java.util.Scanner;

public class EncontraValorIgual6 {

    /**
     * pesquisa | # valores de cupom (0 a n-1)
     * fuiColetado[i] | vetor fui coletado?
     * contar | # cupons
     * distinto | # cupons distintos
     * numeroAleatorio | cupom aleatório
     * Este programa recebe um argumento de linha de comando inteiro n
     * e simula a coleta de cupons gerando números aleatórios entre 0 e n-1
     * até obter todos os valores possíveis.
     * 05/04/2022
     */
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();

        // vetor
        boolean[] fuiColetado = new boolean[tamanho];

        // variáveis
        int contador = 0;
        int distinto = 0;

        // enquanto distinto menor que o tamanho faça
        while( distinto < tamanho) {

            // gera número aleatório
            int numeroAleatorio = (int) (Math.random() * tamanho);

            contador++; // contador soma 1

            // se não encontra fuiColetado
            if(!fuiColetado[numeroAleatorio]) {
                distinto++; // distinto soma 1

                // vetor fui coletado (já existe um valor) recebe verdadeiro
                fuiColetado[numeroAleatorio] = true;
            } // fim if

            // imprima
            System.out.printf("%6d", contador);

        } // fim while
    } // fim main
} // fim classe