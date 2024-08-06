import java.util.Scanner;

public class Exercicio05 {
    /*
     * 2.5 Escreva declarações, instruções ou comentários que
     * realizem cada uma das tarefas a seguir:
     * a) Declare que um programa calculará o produto de três inteiros.
     * b) Crie um Scanner chamado input que leia valores a partir da entrada padrão.
     * c) Declare as variáveis x, y, z e result como tipo int.
     * d) Solicite que o usuário insira o primeiro inteiro.
     * e) Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x.
     * f) Solicite que o usuário insira o segundo inteiro.
     * g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y.
     * h) Solicite que o usuário insira o terceiro inteiro.
     * i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z.
     * j) Compute o produto dos três inteiros contidos nas variáveis x, y e z
     * e atribua o resultado à variável result.
     * Deitel, Paul; Deitel, Harvey (2016-07-18T22:58:59).
     * Java: como programar (p. 49). Edição do Kindle.
     * Pedro,11/12/2021
     */
    public static void main(String[] args) {

        // a) Declare que um programa calculará o produto de três inteiros.
        // este programa calculará o produto de três inteiros
        System.out.println("Este programa calculará o produto de três inteiros");

        // b) Crie um Scanner chamado input que leia valores a partir da entrada padrão.
        Scanner input = new Scanner(System.in);

        // c) Declare as variáveis x, y, z e result como tipo int.
        int x;
        int y;
        int z;
        int result;

        // d) Solicite que o usuário insira o primeiro inteiro.
        System.out.print("Digite o primeiro inteiro: ");

        // e) Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x.
        x = input.nextInt();

        // f) Solicite que o usuário insira o segundo inteiro.
        System.out.print("Informe o segundo inteiro: ");

        // g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y.
        y = input.nextInt();

        // h) Solicite que o usuário insira o terceiro inteiro.
        System.out.print("Informe o terceiro inteiro: ");

        // i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z.
        z = input.nextInt();

        // j) Compute o produto dos três inteiros contidos nas variáveis x, y e z
        // e atribua o resultado à variável result.
        result = x * y * z;

        //k) Use System.out.printf para exibir a mensagem
        // seguida pelo valor da variável result.
        System.out.printf("%s%d%n", "O valor do produto é ", result);  
  
    } // fim main
} // fim classe