import java.util.Scanner;

public class TestaContaCorrente2 {
    public static void main(String[] args)
    {
        // cria objeto da conta corrente
        ContaCorrente2 conta1 = new ContaCorrente2("Pedro", 50.00);
        ContaCorrente2 conta2 = new ContaCorrente2("Cleonice", -20.00);

        conta1.displayConta();
        conta2.displayConta();
        
        // cria o objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.println("Digite o valor do saque da conta 1 R$");
        double saque = input.nextDouble();
        conta1.setSaqueDaConta(saque);
        conta1.displayConta();
        
        // entrada de dados
        System.out.println("Digite o valor do deposito da conta 1 R$");
        double depo = input.nextDouble();
        conta1.deposito(depo);
        conta1.displayConta();
        
    } // final principal
} // final classe
