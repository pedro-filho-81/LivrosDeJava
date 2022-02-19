package comissaodevendas;

public class Comissao {

    // cria o nome da loja
    private String nomeDaLoja;
    // cria vetor salario
   private int[] salarios; // declara o vetor salários semanal dos vendedores
   
    // cria o construtor
    public Comissao( String nomeDaLoja, int[] salarios ) {
        this.nomeDaLoja = nomeDaLoja;
        this.salarios = salarios;
    } // fim construtor
   
    // configura o nome da loja
    public void setNomeDaLOja( String nomeDaLOja ) {
        this.nomeDaLoja = nomeDaLOja;
    } // fim set nome da loja
    
    // retorna o nome da loja
    public String getNomeDaLOja() {
        return nomeDaLoja;
    } // fim get nome da loja
    
    // mostra o maior valor das comissões
    public int getMaiorComissao() {
        
        int maior = salarios[0];
        
        for( int salario : salarios ) {
            if( maior < salario ) // se maior menor que o salário
                maior = salario; // maior recebe o salário
        } // fim for salario
         // retorna o maior
         return maior;
         
    } // fim método maior valor
    
    // método menor valor
    public int getMenorComissao() {
        
        // variável
        int menor = salarios[0];
        
        // loop para achar o menor salário
        for( int salario : salarios ) {
            if( menor > salario ) // se menor maior que o salávio
                menor = salario; // menor recebe o salário
        } // fim for salário
        
        // retorne o menor salário
        return menor;
    } // fim menor valor
    
    // enconta a média dos salários
    public float getMediaDosSalarios() {
        
        // var
        int total = 0;
        
        // loop para achar a média
        for( int salario : salarios ) {
            
            total += salario; // soma todos os salários
        } // fim for
        
        // retorne a média
        return ( float ) total / salarios.length;
        
    } // fim média
    
    // imprime os elementos do array
    public void displayLoja() {
        
        // mostra o nome da loja        
        System.out.printf("%n%s%n%s%n", "Lista das comissões pagas da loja:", nomeDaLoja);
        
        // mostra o cabeçalho da tabela
        System.out.println("*********************");
        System.out.printf("%s%10s%n", "Vendedores", "Valores");
        System.out.println("*********************");
        
        // loop para mostrar os valores das comissões dos vendedores
        for( int comissao = 0; comissao < salarios.length; comissao++) {
            // imprime os valores dos vendedores
            System.out.printf("Vendedor%3d  R$%5d%n", comissao + 1, salarios[ comissao ] );
        } // fim for    
        
    } // fim display loja    
    
    // gera saída do gráfico de barras exibindo distribuição dos salários
    public void getMostraBarras() {
        
        // cabeçalho da distribuição dos salários
        System.out.print("\nDistribuição dos salários:");
    
        // array frequência
        int[] frequencia = new int[11];
        
        // para cada salário incrementa os valores
        for( int salario : salarios )
            frequencia[ salario / 100 ]++;
            
        for( int contar = 0; contar < frequencia.length; contar++ ) {
            
            if( contar == 10 )
                System.out.printf("    %5d:  ", 1000);
            else 
                if ( contar >= 2)
                    System.out.printf("%03d - %03d:  ", contar * 100, contar * 100 + 99 );
            
            // loop para as estrelas
            for( int estrelas = 0; estrelas < frequencia[ contar ]; estrelas++ )
                System.out.print("*"); // imprime asterisco
            
            System.out.println(); // pula linha
            
        } // fim for contar        
    } // fim mostra barras
    
    // mostra o processo dos salários
    public void processoSalario() {
        
        displayLoja();
        
        System.out.printf("%nMenor comissão paga R$%d%n", getMenorComissao() );
        System.out.printf("Maior comissão paga R$%d%n", getMaiorComissao() );        
        System.out.printf("Valor médio das comissões pagas R$%.0f%n", getMediaDosSalarios() );
        
        getMostraBarras();
        
    } // fim processo salário       
    
} // fim classe Comissão
