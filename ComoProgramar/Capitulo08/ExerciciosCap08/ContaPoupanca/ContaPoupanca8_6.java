import java.math.BigDecimal;
import java.text.NumberFormat;

// cria a classe conta poupança
public class ContaPoupanca8_6 
{

    // variáveis instância
    private static int numeroDaConta;
    private static BigDecimal saldo;
    private static BigDecimal novoSaldo;
    private static BigDecimal valorPrincipal;
    public BigDecimal taxaDeJurosAnual;
    public int tempo;

    // construtor
    public ContaPoupanca8_6(int numeroDaConta, BigDecimal valorPrincipal, BigDecimal taxaDeJurosAnual, 
                            int tempo)
    {
        this.numeroDaConta = numeroDaConta;
        this.valorPrincipal = valorPrincipal;
        this.saldo = valorPrincipal;
        this.taxaDeJurosAnual = taxaDeJurosAnual;
        this.tempo = tempo;

    } // final construtor

    // numeroDaConta
    public void setNumeroDaConta(int numeroDaConta)
    {
        this.numeroDaConta = numeroDaConta;
    } // final numero da conta

    public int getNumeroDaConta()
    {
        return numeroDaConta;
    } // final get numero da conta

    public void setValorPrincipal(BigDecimal valorPrincipal)
    {
        this.valorPrincipal = valorPrincipal;
    } // final principal

    public BigDecimal getValorPrincipal()
    {
        return valorPrincipal;
    } // final get principal

    public void setTaxaDeJurosAnual(BigDecimal taxaDeJurosAnual)
    {
        this.taxaDeJurosAnual = taxaDeJurosAnual;
    } // final set juros anual

    public BigDecimal getTaxaDeJurosAnual()
    {
        return taxaDeJurosAnual;
    } // final taxa de juros

    public void setTempo(int tempo) throws IllegalAccessException
    {
        if(tempo <= 0)
            throw new IllegalAccessException("Valor tem que ser maior que 0");

        this.tempo = tempo;
        
    }// final tempo

    public void calculaJurosCompostos(BigDecimal valor, BigDecimal taxa, int tempo)
    {
        // calcula os novos valores com a taxa de juros anual
        // multiply => 1 + pow(taxa, tempo)
        saldo = valor.multiply(taxa.add(BigDecimal.ONE).pow(tempo));
        
    } // final calcula juros copostos

    public BigDecimal getSaldo()
    {
        return saldo;
    } // final getSaldo

    public void modificarTaxaDeJuros(BigDecimal novaTaxa, BigDecimal valor, int tempo)
    {
        this.taxaDeJurosAnual = novaTaxa;
        
        // calcula os novos valores com a taxa de juros anual
        // multiply => 1 + pow(taxa, tempo)
        saldo = valor.multiply(taxaDeJurosAnual.add(BigDecimal.ONE).pow(tempo));
        
    } // final modificaTaxa

} // final classe