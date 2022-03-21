import java.util.Scanner;

public class JurosCompostos17 {
    public static void main(String[] args) {
        
        // cria o objeto Scanner
        Scanner input = new Scanner(System.in);
    
        // entrada de dados
        System.out.print("Informe o valor inicial R$ ");
        double valorInicial = input.nextDouble();
    
        System.out.print("Informe o valor da taxa anual: ");
        double taxa = input.nextDouble();

        // cálculos
        double indice = taxa / 100;

        // cabeçalho
        System.out.printf("%s%13s%12s%n", "Ìndice", "Valor", "Juros");

        for( int tempo = 1; tempo <= 25; tempo++ ) {
            // cálculo
            double valorFinal = valorInicial * Math.pow(1 + indice, tempo );
            // mostra valores
            System.out.printf("%2d ano%15.2f%12.2f%n", tempo, valorFinal, valorFinal - valorInicial);

        } // fim for

    } // fim main
} // fim classe