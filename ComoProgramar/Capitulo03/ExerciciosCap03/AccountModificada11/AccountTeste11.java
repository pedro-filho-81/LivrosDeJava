import java.util.Scanner;

public class AccountTeste11 {
    /*
     * 3.11 (Classe Account modificada) Modifique a classe Account (Figura 3.8) para
     * fornecer um método chamado withdraw que retira dinheiro de uma Account.
     * Assegure que o valor de débito não exceda o saldo de Account. Se exceder,
     * o saldo deve ser deixado inalterado e o método deve imprimir uma mensagem que
     * indica
     * "Withdrawal amount exceeded account balance" [Valor de débito excedeu o saldo
     * da conta].
     * Modifique a classe AccountTest (Figura 3.9) para testar o método withdraw.
     * Pedro, 13/12/2021
     */

    public static void main(String[] args) {

        // cria o objeto da classe Account
        Account11 account1 = new Account11("Pedro Filho", 50 );

        // variável Scanner
        Scanner input = new Scanner(System.in);

        // imprime Account1
        System.out.printf("A 1ª conta é de %s\ninicia com R$ %d\n",
                account1.getName(), 
                account1.getBalance() );

        // entrada de dados
        System.out.print("\nDigite o valor do saque: ");
        int retirarValor = input.nextInt();
        account1.retirada(retirarValor);

        displayData(account1);
    
    } // fim main 
    
    public static void displayData(Account11 conta)
    {
        // imprime Account1
        System.out.printf("A conta é de %s\ntem de saldo R$ %d\n ",
                conta.getName(), 
                conta.getBalance() );
    } // final displayData

} // fim classe
