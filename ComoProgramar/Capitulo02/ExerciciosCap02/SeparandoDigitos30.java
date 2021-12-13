import java.util.Scanner; 

public class SeparandoDigitos30 {
    /*
        2.30 (Separando os dígitos em um inteiro) Escreva um aplicativo que insira 
            um número consistindo em cinco dígitos a partir do usuário, 
            separe o número em seus dígitos individuais e imprima os dígitos separados uns 
            dos outros por três espaços. Por exemplo, se o usuário 
            digitar o número 42339, o programa deve imprimir  4 2 3 3 9
            Suponha que o usuário insira o número correto de dígitos. O que acontece quando você 
            insere um número com mais de cinco dígitos? O que acontece quando você insere um 
            número com menos de cinco dígitos? [Dica: é possível fazer este exercício 
            com as técnicas que aprendeu neste capítulo. Você precisará tanto das operações de 
            divisão como das de resto para selecionar cada dígito.
            Pedro, 13/12/2021
    */
    public static void main(String[] args) {
        
        // variável Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um número entre 0 e 99999: ");
        int num = input.nextInt(); // aguarda entrada do usuário

        // variáveis
        int n1 = num / 10000 % 10000; // encontra o primeiro valor
        int n2 = num % 10000 / 1000; // segundo valor
        int n3 = num % 1000 / 100;  // terceiro valor
        int n4 = num % 100 / 10; // quarto valor
        int n5 = num % 10 / 1; // quinto valor

        // imprime resultado
        System.out.printf("%d   %d   %d   %d   %d%n%n", n1, n2, n3, n4, n5 );
        
         
    } // fim main    
} // fim classe
