public class Fatura12 {

    // variáveis de instância
    private String numero; // número da fatura
    private String descricao; // descrição do produto
    private int quantidade; // quantidade comprada
    private double preco; // preço do produto

    // cria o construtor da classe
    public Fatura12(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero; // variável de instância recebe parâmetro
        this.descricao = descricao; // variável de instância recebe parâmetro

        // se a quantidade for maior que zero
        if (quantidade > 0)
            // variável de instância recebe parâmetro
            this.quantidade = quantidade;

        // se o preço for maior que zero
        if (preco > 0.0)
            // variável de instância recebe parâmetro
            this.preco = preco;

    } // fim construtor

    // setNumero
    public void setNumero(String numero) {
        this.numero = numero;
    } // fim setNumero

    // getNumero
    public String getNumero() {
        return numero;
    } // fim getNumero

    // setDescricao
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } // fim setDescricao

    // getDescricao
    public String getDescricao() {
        return descricao;
    } // fim getDescricao

    public void setQuantidade(int quantidade) {
        if (quantidade > 0)
            this.quantidade = quantidade;

        if (quantidade <= 0)
            System.out.println("A quantidade tem que ser maior que 0");
    } // fim setQuantidade

    public int getQuantidade() {
        return quantidade;
    } // fim getQuantidade

    public void setPreco(double preco) {
        if (preco > 0.0)
            this.preco = preco;

        if (preco <= 0.0)
            System.out.println("O preço tem que ser maior que 0.0.");
    } // fim setPreco

    public double getPreco() {
        return preco;
    } // fim getPreco

} // fim da classe Fatura
