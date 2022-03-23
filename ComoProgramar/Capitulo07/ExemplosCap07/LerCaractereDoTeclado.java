import java.util.Scanner;

public class LerCaractereDoTeclado {
    /**
     * Entrada de um caractere usando a Classe Scanner
     * 
     */
    public static void main(String[] args) {
        // cria o objeto Scanner
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um caractere: ");
        // cria variável que recebe o caractere digitado pelo usuário
        char letra = entrada.next().charAt(0);

        // mostra o caractere digitado pelo usuário
        System.out.println("Você digitou o caractere: " + letra );
        
    } // fim main
} // fim classe