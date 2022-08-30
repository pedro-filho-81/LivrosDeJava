public class ContaCorrente1 {
    
    // variáveis de instância
    private String nome; // armazena o noe do cliente
    private double saldo; // arazena o saldo do cliente

    // construtor da classe
    public ContaCorrente1(String nome, double saldo)
    {
        this.nome = nome;

        // se saldo maior que zero
        if(saldo > 0.0)
            // saldo recebe saldo
            this.saldo = saldo;

    } // final construtor

    public void setNome(String nome)
    {
        this.nome = nome;
    } // final set nome

    public String getNome()
    {
        return nome;
    } // final get nome

    public void deposito(double depositoNaConta)
    {
        if(depositoNaConta > 0.0)
            this.saldo += depositoNaConta;
    } // final saldo da conta

    public double getSaldoDaConta()
    {
        return saldo;
    } // final get saldo

} // final classe
