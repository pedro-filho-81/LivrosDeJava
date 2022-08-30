import java.util.Scanner;

public class TestaContaCorrente1 {
    public static void main(String[] args)
    {
        // cria objeto da conta corrente
        ContaCorrente1 conta1 = new ContaCorrente1("Pedro", 50.00);
        ContaCorrente1 conta2 = new ContaCorrente1("Cleonice", -20.00);

        // exibir resultado
        System.out.printf("%-10s%15.2f\n", conta1.getNome(), conta1.getSaldoDaConta());
        System.out.printf("%-10s%15.2f\n", conta2.getNome(), conta2.getSaldoDaConta());

        // cria o objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.println("Digite o valor do deposito R$");
        double depo = input.nextDouble();
        conta1.deposito(depo);

        // exibir resultado
        System.out.printf("%-10s%15.2f\n", conta1.getNome(), conta1.getSaldoDaConta());

        // entrada de dados
        System.out.println("Digite o valor do deposito R$");
        depo = input.nextDouble();
        conta2.deposito(depo);

        // exibir resultado
        System.out.printf("%-10s%15.2f\n", conta2.getNome(), conta2.getSaldoDaConta());

    } // final principal
} // final classe