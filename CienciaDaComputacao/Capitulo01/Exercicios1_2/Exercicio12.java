package Exercicios1_2;


// importar biblioteca Scanner
import java.util.Scanner;

public class Exercicio12 {

    /*
     * 1.2.12 Descreva o que acontece se você escrever sqrt em vez
     * de Math.sqrt no PROGRAMA 1.2.3.
     * 
     * RESPOSTA: GERA A MENSAGEM DE ERRO
     *           INFORMANDO QUE O MÉTODO SQRT(DOUBLE) NÃO FOI ENCONTRADO
     *           NA CLASSE EXERCÍCIO12 NA LINHA 28
                Exercicio12.java:28: error: cannot find symbol
                double sqroot = sqrt(discriminant);                        ^
                symbol:   method sqrt(double)
                location: class Exercicio12
                1 error
     * 
     * Sedgewick, Robert; Wayne, Kevin. Ciência da computação (p. 45).
     * Pearson Education. Edição do Kindle.
     * Pedro, 28/11/2021
     */

    public static void main(String[] args) {

        // cria o objeto input da classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um número: ");
        double b = input.nextDouble();
        System.out.print("Digite outro número: ");
        double c = input.nextDouble();

        // cálculos
        double discriminant = b * b - 4.0 * c;
        double sqroot = sqrt(discriminant);
        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;

        // imprime o resultado
        System.out.println(root1);
        System.out.println(root2);
    } // fim main
} // fim classe