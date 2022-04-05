import java.util.Scanner;

public class EncontraUmMes5 {

    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o mês que deseja ver entre (1 e 12): ");
        int mes = input.nextInt();

        // declara, cria e inicializa um vetor
        String[] vetorMes = {
                "Janeiro", "Fevereiro", "Marco", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "novembro", "Dezembro"
        };

        // verifica se mês é maior que zero e menor que 13
        if (mes > 0 && mes < 13) // se verdade
            // imprime o mês
            System.out.printf("Mês %d = %s ", mes, vetorMes[mes - 1]);
        else // se falso
             // imprime um aviso
            System.out.println("Digite um número entre 1 e 12 inclusive.");
    } // fim main
} // fim classe