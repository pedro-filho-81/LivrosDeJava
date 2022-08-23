import java.math.BigDecimal;
import java.util.Scanner;

public class TestaContaPoupanca {
    public static void main(String[] args) 
    {
        // entrada de dados iniciais
        BigDecimal principal1 = BigDecimal.valueOf(2000.0); // valor inicial
        BigDecimal principal2 = BigDecimal.valueOf(3000.0); // valor inicial
        BigDecimal taxa = BigDecimal.valueOf(0.05); // taxa de juros inicial
        BigDecimal novaTaxa = BigDecimal.valueOf(0.03);
        BigDecimal saldoAtual;

        // cria objeto poupança
        ContaPoupanca8_6 poupanca1 = new ContaPoupanca8_6(100, principal1, taxa, 1);
        ContaPoupanca8_6 poupanca2 = new ContaPoupanca8_6(200, principal2, taxa, 1);

        poupanca1.calculaJurosCompostos(principal1, taxa, 1);      
        exibirConta(poupanca1); // 01
        
        saldoAtual = poupanca1.getSaldo();
        poupanca1.modificarTaxaDeJuros(novaTaxa, saldoAtual, 1);
        exibirConta(poupanca1); // 02
        
        saldoAtual = poupanca1.getSaldo();
        novaTaxa = BigDecimal.valueOf(0.08);
        poupanca1.modificarTaxaDeJuros(novaTaxa, saldoAtual, 1);
        exibirConta(poupanca1); // 03

        poupanca2.calculaJurosCompostos(principal2, taxa, 1);
        exibirConta(poupanca2); // 01

        saldoAtual = poupanca2.getSaldo();
        poupanca2.modificarTaxaDeJuros(novaTaxa, saldoAtual, 1);
        exibirConta(poupanca2); // 02
        
        saldoAtual = poupanca2.getSaldo();
        novaTaxa = BigDecimal.valueOf(0.02);
        poupanca2.modificarTaxaDeJuros(novaTaxa, saldoAtual, 1);
        exibirConta(poupanca2); // 03

    } // final main

    public static void exibirConta(ContaPoupanca8_6 conta)
    {
        // exibe
        System.out.println("\nConta Poupanca:");
        System.out.printf("Conta: %d\nCapital R$ %.2f\nTaxa: %.2f%%\nSaldo = %.2f\n", conta.getNumeroDaConta(),
                conta.getValorPrincipal(), conta.getTaxaDeJurosAnual(),
                conta.getSaldo());
    } // final exibir conta

} // final classe