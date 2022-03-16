import java.util.Scanner;

public class JurosCompostos24 {
    /**
     * 1.2.24 Juros compostos continuamente. 
     * Escreva um programa que calcule e imprima a quantidade de 
     * dinheiro que você teria após t anos se investisse P dólares 
     * a uma taxa de juros anual r (composta continuamente). 
     * O valor desejado é dado pela fórmula Pert.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 47). 
     * Pearson Educação. Edição do Kindle.
     * @autor Pedro, 15/02/2022
     */
    public static void main(String[] args) {
        // cria o objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Informe o valor inicial R$ ");
        double valorInicial = input.nextDouble();

        System.out.print("Informe o valor da taxa: ");
        double taxa = input.nextDouble();

        System.out.print("Informe o tempo da aplicação: ");
        int tempo = input.nextInt();

        // cálculos
        double indice = taxa / 100;
        double valorFinal = valorInicial * Math.pow(1 + indice, tempo);

        // mostra o resultado
        System.out.println("\nRESUMO DA APLICAÇÃO");
        System.out.printf("Valor inicial R$ %.2f%n", valorInicial);
        System.out.printf("Taxa %f%% %n", indice);
        System.out.printf("Tempo aplicado: %d anos%n", tempo);
        System.out.printf("Juros recebidos R$ %.2f%n", valorFinal - valorInicial);
        System.out.printf("Valor final R$ %.2f%n", valorFinal);

    } // fim main    
} // fim classe
