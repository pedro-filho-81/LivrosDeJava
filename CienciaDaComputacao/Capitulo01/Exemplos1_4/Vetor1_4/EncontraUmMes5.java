import java.util.Scanner;

public class EncontraUmMes5 {

    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o mês que deseja ver entre (1 e 12): ");
        int mes = input.nextInt();

        // vetor
        String[] vetorMes = {
                "Janeiro", "Fevereiro", "Marco", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "novembro", "Dezembro"
        }; 
        if( mes > 0 && mes < 13 )
            System.out.printf("Mês %d = %s ", mes, vetorMes[mes - 1]);
        else
            System.out.println("Digite um número entre 1 e 12 inclusive.");
    } // fim main
} // fim classe