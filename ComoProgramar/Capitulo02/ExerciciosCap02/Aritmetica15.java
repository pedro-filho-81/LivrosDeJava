import java.util.Scanner; 

class Aritmetica15 {
    /*
        2.15 (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, 
        obtenha dele esses números e imprima sua soma, produto, diferença e quociente (divisão). 
        Utilize as técnicas mostradas na Figura 2.7.
        Pedro, 11/12/2021
    */
    public static void main(String[] args) {

        // cria Variável input para a classe Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int x = input.nextInt();
        System.out.print("Digite outro inteiro: ");
        int y = input.nextInt();

        // mostra o resultado
        System.out.println("\nARITMÉTICA" );
        System.out.println("Para:\nint x = " + x + "\nint y = " + y );
        System.out.printf("%s%d%n", "Soma = ", x + y );
        System.out.printf("%s%d%n", "Subtração = ", x - y );
        System.out.printf("%s%d%n", "Produto = ", x * y );
        System.out.printf("%s%d%n", "Divisão = ", x / y );
        System.out.printf("%s%d%n", "Resto = ", x % y );

    } // fim main
} // fim classe
