import java.math.BigDecimal;

public class TestaContaPoupanca {
    public static void main(String[] args)
    {
        // entrada de dados iniciais
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal taxa = BigDecimal.valueOf(0.05);

        ContaPoupanca8_6 poupanca = new ContaPoupanca8_6(100, principal, taxa, 1);

        System.out.println("\nConta Poupanca:");
        System.out.printf("Conta: %d\nCapital R$ %.2f\nTaxa: %.2f%%\nSaldo = %.2f\n", poupanca.getNumeroDaConta(),
                                poupanca.getValorPrincipal(), poupanca.getTaxaDeJurosAnual(),
                                poupanca.getSaldo());

        // depósitos, taxa e tempo
        BigDecimal deposito = BigDecimal.valueOf(1000);
        BigDecimal novaTaxa = BigDecimal.valueOf(0.03);
        int tempo = 2;
        poupanca.setTaxaDeJurosAnual(novaTaxa);
        poupanca.calculaJurosCompostos(deposito, taxa, tempo);
        System.out.println("\nConta Poupanca nova taxa:");
        System.out.printf("Conta: %d\nCapital R$ %.2f\nTaxa: %.2f%%\nTempo: %d%nSaldo = %.2f\n", poupanca.getNumeroDaConta(),
                                poupanca.getValorPrincipal(), poupanca.getTaxaDeJurosAnual(),
                                tempo ,poupanca.getSaldo());

    } // final main
} // final classe
