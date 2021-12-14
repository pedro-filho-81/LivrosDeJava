public class Empregado13 {

    // variáveis de instância
    private String nome; // para o nome
    private String sobreNome; // para o sobre nome
    private double salario; // para o salário

    // cria o construtor
    public Empregado13(String nome, String sobreNome, double salario) {
        this.nome = nome;
        this.sobreNome = sobreNome;

        if (salario > 0.0)
            this.salario = salario;
    } // fim construtor

    // método setNome
    public void setNome(String nome) {
        this.nome = nome;
    } // fim setNome

    public String getNome() {
        return nome;
    } // fim sobrenome

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    } // fim sobre nome

    // método
    public String getSobreNome() {
        return sobreNome;
    } // fim get sobre nome

    public void setSalario(double salario) {
        if (salario > 0.0)
            this.salario = salario;

        if (salario < 0.0)
            System.out.println("Valor indevido!");
    } // fim set salário

    public double getSalario() {
        return salario;
    } // fim get salário

} // fim classe
