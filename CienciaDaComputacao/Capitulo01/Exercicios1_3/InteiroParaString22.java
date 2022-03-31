import java.util.Scanner;

public class InteiroParaString22 {
    /**
     * 1.3.22 Escreva um fragmento de código que coloque a representação
     * binária de um inteiro positivo n em uma variável String s. Solução.
     * Java tem um método integrado Integer.toBinaryString(n) para este
     * trabalho, mas o objetivo do exercício é ver como esse método pode ser
     * implementado. Trabalhando a partir do PROGRAM 1.3.7, obtemos a solução
     * 
     * Cadeia s = "";
     * int potência = 1;
     * enquanto (potência <= n/2)
     * potência *= 2;
     * enquanto (potência > 0) {
     * if (n < potência) {
     * s += 0;
     * }
     * senão {
     * s += 1;
     * n -= potência;
     * }
     * potência /= 2;
     * }
     * 
     * Uma opção mais simples é trabalhar da direita para a esquerda:
     * 
     * Clique aqui para ver a imagem do código
     * 
     * Cadeia s = "";
     * for (int i = n; i > 0; i /= 2)
     * s = (i % 2) + s;
     * 
     * Ambos os métodos são dignos de estudo cuidadoso.
     * 
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pp. 83-84).
     * Pearson Educação. Edição do Kindle.
     */
    public static void main(String[] args) {

        // cria o objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro para ver seu binário: ");
        int decimal = input.nextInt();

        // cria a variável string
        String valor = "";

        // potência de 2
        int potencia = 1;
        // enquanto potência maior ou igual ao
        // decimal dividido por dois faça
        while (potencia <= decimal / 2)
            // calcular a potência por dois
            potencia *= 2;

        // enquanto potência maior que zero faça
        while (potencia > 0) {

            // se decimal menor que potência
            if (decimal < potencia) {
                // passando inteiro para String
                // o sinal de += significa concatenação
                // valor soma zero
                valor += 0;
            } // fim if

            // se não
            else {
                // passando inteiro para String
                // o sinal de += significa concatenação
                // valor soma um
                valor += 1;
                // decimal diminui o valor da potência
                decimal -= potencia;
            } // fim else

            // potência é dividica por dois
            potencia /= 2;

        } // fim while

        // imprima o valor
        System.out.print(valor);

    } // fim main
} // fim classe
