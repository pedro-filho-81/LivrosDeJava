import java.util.Scanner; 

public class ParOuImpar25 {
    /*
        2.25 (Impar ou par) Escreva um aplicativo que leia um inteiro, 
        além de determinar e imprimir se ele é ímpar ou par. 
        [Dica: utilize o operador de resto. Um número par é um múltiplo de 2. 
        Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
        Pedro, 12/12/2021
    */
    
    public static void main(String[] args) {
        
        // variável para Scanner
        Scanner input = new Scanner(System.in );

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int n = input.nextInt();

        // verifica se é par ou impar
        // se n % 2 == 0 é par
        if( n % 2 == 0 )
            System.out.printf("%d%s%n", n, " Número par");

        // se n % 2 != 0 é ímpar
        if( n % 2 != 0 )
            System.out.printf("%d%s%n", n, " Número ímpar.");
    } // fim main
} // fim classe
