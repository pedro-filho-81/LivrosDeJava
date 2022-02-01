package gradebookteste;

// classe GradeBook utiliza um array para armazenar as notas de teste

public class GradeBook {
    // cria a variável de instância
    private String nomeDoCurso; // para o nome do curso
    
    // cria o arras para as notas dos alunos
    private int[] notas; 
    
    // construtor
    public GradeBook( String nomeDoCurso, int[] notas ) {
        this.nomeDoCurso = nomeDoCurso;
        this.notas = notas;
    } // fim construtor
    
    // cria método configura o nome do curso
    public void setNomeDoCurso( String nomeDoCurso ) {
        this.nomeDoCurso = nomeDoCurso; // recebe o nome do curso
    } // fim método
    
    // método get nome do curso
    public String getNomeDoCurso() {
        return nomeDoCurso; // retorna o nome do curso
    } // fim get nome do curso
    
    // método saída das notas
    public void saidaDasNotas() {
        
        // imprime
        System.out.println("\nAs notas são: ");
        
        // loop para mostrar as notas
        for( int estudante = 0; estudante < notas.length; estudante++ ) {
            // mostra o estudante e as notas
            System.out.printf("Estudante %2d: nota %2d%n", estudante + 1, notas[ estudante ] );
        } // fim for
        
    } // fim método saída das notas
    
    // método get média da classe
    public double getMediaDaClasse() {
        
        // variável
        int total = 0;
        
        // loop para somar os valores das notas
        for( int nota : notas ) {            
            total += nota; // soma as notas
        } // fim for notas
        
        return (double) total / notas.length;
    } // fim get média da classe
    
    // método get menor valor
    public int getMenorValor() {
        // variável menor
        int menorValor = notas[ 0 ];
        
        // loop para mostrar o menor valor
        for( int nota: notas ) {
            
            // se nota menor que menor valor
            if( nota < menorValor ) {
                menorValor = nota; // menor valor recebe nota
            } // fim if menor valor            
        } // fim for menor valor
        
        return menorValor; // retorna o menor valor
    } // fim menor valor
    
    // método maior valor
    public int getMaiorValor() {
             
        // variável
        int maiorValor = notas[ 0 ];
            
       // loop para encontrar o menor valor
       for( int nota : notas ) {
            // se maior valor menor que a nota
                if( nota > maiorValor ) {
                    // maior valor recebe a nota
                    maiorValor = nota;
                } // fim if
            } // fim for
            
            return maiorValor;
            
    } // fim get maior valor
        
    // cria gráfico de barras
    public void graficoDeBarras() {
        // distribuição das notas CABEÇALHO
        System.out.println("\n\nDISTRIBUIÇÃO DAS NOTAS");
        
        // cria vetor frânquia
        int[] franquia = new int[ 11 ];
        
        // loop para incrementar a frânquia
        for( int nota : notas ) {
            // adiciona 1 a quantidade 
            ++franquia[ nota / 10 ];            
        } // fim for nota

        // loop para gerar gráficos
        for( int contar = 0; contar < franquia.length; contar++ ) {
            
            // gera saída do rótulo de barra
            if( contar == 10 )
                System.out.printf("%5d:   ", 100 );
            else
                System.out.printf("%02d-%02d:   ", contar *10 , contar * 10 + 9 );
            
            // imprime barra de asterisco
            for( int estrela = 0; estrela < franquia[ contar ]; estrela++ )
                System.out.print("*");
            
            System.out.println(); // pula linha            
        } // fim for contar
        
    } // fim gráfico de barras
    
    // realiza várias operações nos dados
    public void processaDados() {
        
        // chama o método saida das notas
        saidaDasNotas();
        
        // chama a função get média e mostra a média da classe
        System.out.printf("%nA média da classe é %.2f%n", 
                                    getMediaDaClasse() );
        
        // chama o método get menor valor e get maior valor
        System.out.printf("A menor nota é %d%nA maior nota é %d", 
                                    getMenorValor(), getMaiorValor());
        
        // chama o método gráfico de barras
        graficoDeBarras();
        
    } // fim processa dados
    
} // fim classe GradeBook