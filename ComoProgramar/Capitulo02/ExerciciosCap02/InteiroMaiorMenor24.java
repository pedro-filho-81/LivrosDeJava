import java.util.Scanner; 

public class InteiroMaiorMenor24 {
    /*
        2.24 (Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, 
        além de determinar e imprimir o maior e o menor inteiro no grupo. Utilize 
        somente as técnicas de programação que você aprendeu neste capítulo.
        Pedro, 12/12/2021
    */

    public static void main(String[] args) {
        
        // variável input para a classe Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int n1 = input.nextInt();
        System.out.print("Digite outro inteiro: ");
        int n2 = input.nextInt();
        System.out.print("Digite outro inteiro: ");
        int n3 = input.nextInt();
        System.out.print("Digite outro inteiro: ");
        int n4 = input.nextInt();
        System.out.print("Digite outro inteiro: ");
        int n5 = input.nextInt();

        // variáveis
        int maior = n1;
        int menor = n1;

        // se n2 maior que maior
        if( n2 > maior )
            maior = n2;
        
        if( n3 > maior )
            maior = n3;
            
        if( n4 > maior )
            maior = n4;
            
        if( n5 > maior )
            maior = n5;
        
        // imprime o resultado
        System.out.printf("%s\t%d%n", "O maior valor é ", maior );
        System.out.printf("%s\t%d%n", "O menor valor é ", menor );
    } // fim main
    
} // fim classe
