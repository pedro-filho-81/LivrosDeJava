import java.util.Scanner;

public class FaturaTeste12 {
    /*
     * 3.12 (Classe Invoice) Crie uma classe chamada Invoice para que uma loja
     * de suprimentos de informática a utilize para representar uma
     * fatura de um item vendido nela. Uma Invoice (fatura) deve incluir
     * quatro partes das informações como variáveis de instância — o
     * número (tipo String), a descrição (tipo String), a quantidade comprada
     * de um item (tipo int) e o preço por item (double).
     * Sua classe deve ter um construtor que inicializa as quatro variáveis de
     * instância. Forneça um método set e um get para cada variável de instância.
     * Além disso, forneça um método chamado getInvoiceAmount que calcula o valor
     * de fatura (isto é, multiplica a quantidade pelo preço por item) e depois
     * retorna esse valor como double. Se a quantidade não for positiva,
     * ela deve ser configurada como 0. Se o preço por item não for positivo,
     * ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado
     * InvoiceTest que demonstra as capacidades da classe Invoice.
     * Pedro, 14/12/2021
     */

    public static void main(String[] args) {

        Fatura12 fatura = new Fatura12("12345", "Computador", 3, 50.25);

        System.out.println("\nPRIMEIRO PRODUTO");

        // imprime primeiro
        System.out.printf(
                "Fatura número %s%nProduto: %s%nQuqntidade: %d%nPreço unutário  R$ %.2f%nValor Total R$ %.2f ",
                fatura.getNumero(),
                fatura.getDescricao(),
                fatura.getQuantidade(),
                fatura.getPreco(),
                fatura.getPreco() * fatura.getQuantidade());

        // variável input para Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("\nDigite o número da fatura:");
        String numDaFatura = input.nextLine();
        fatura.setNumero(numDaFatura);

        System.out.print("Nome do produto: ");
        String produto = input.nextLine();
        fatura.setDescricao(produto);

        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();
        fatura.setQuantidade(quantidade);

        System.out.print("Preço do produto R$ ");
        double valorDoItem = input.nextDouble();
        fatura.setPreco(valorDoItem);

        System.out.println("\nOUTROS PROD123UTO");

        // imprime primeiro
        System.out.printf( "%nFatura número %s%nProduto: %s%nQuqntidade: %d%nPreço unutário R$ %.2f%nValor Total R$ %.2f ",
                fatura.getNumero(),
                fatura.getDescricao(),
                fatura.getQuantidade(),
                fatura.getPreco(),
                fatura.getPreco() * fatura.getQuantidade());

    } // fim main
} // fim classe
