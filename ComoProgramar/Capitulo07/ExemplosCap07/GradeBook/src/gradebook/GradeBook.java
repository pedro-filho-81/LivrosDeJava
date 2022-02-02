package gradebook;

// classe grade book utilizando matriz para armazenar as notas
public class GradeBook {
    
    // variáveis de instancia
    private String nomeDoCurso;
    // matriz
    private int[][] notas;
    
    // cria o construtor
    public GradeBook( String nomeDoCurso, int[][] notas ) {
        this.nomeDoCurso = nomeDoCurso;
        this.notas = notas;
    } // fim construtor
    
    // método setNomeDoCurso
    public void setNomeDoCurso( String nomeDoCurso ) {
        this.nomeDoCurso = nomeDoCurso;
    } // fim set nome do curso
    
    // método getNomeDoCurso
    public String getNomeDoCurso() {
        return nomeDoCurso;
    } // fim get nome do curso
    
    // método menor valor
    public int getMenorNota() {
        
        // variável
        int menorNota = notas[ 0 ][ 0 ];
        
        // loop para pesquisar as notas do estudante das notas
        for( int[] notasDoEstudante : notas ) {
            // loop para pesquisar a menor nota no vetor notas do estudante
            for( int nota : notasDoEstudante ) {
                
                // verificar
                if( nota < menorNota )
                    menorNota = nota;
                
            } // fim for nota
        } // fim for notas do estudante
        
        return menorNota;
        
    } // fim método
    
    // método get maior nota
    public int getMaiorNota() {
        
        // variável
        int maiorNota = notas[0][0];
        
        // loop para vetor notas do estudante
        for( int[] notasDoEstudante : notas ) {
            // loop para ver a nota do estudante no vetor notas do estudante
            for( int nota : notasDoEstudante ) {
                
                if( nota > maiorNota )
                    maiorNota = nota;
            } // fim loop nota
        } // fim for notas do estudante
        
        return maiorNota;
        
    } // fim get maior nota
    
    // método getMédia
    public double getMedia( int[] setDeNotas ) {
        
        // variável 
        int total = 0;
        
        for( int nota : setDeNotas ) {
            total += nota;
        } // fim for
        
        return (double) total / setDeNotas.length;
    } // fim get média
    
    // método gráfico de barras
    public void graficoDeBarras() {
        
        System.out.println("DISTRIBUIÇÃO DAS NOTAS");
        
        // armzena a frequência das notas
        int[] frequencia = new int[ 11 ];
        
        // loop que cria e inicializa o vetor notas do estudante
        for( int[] notasDoExtudante : notas ) {
            // loop que cria variável nota do vetor notas do estudate
            for( int nota : notasDoExtudante ) {
                ++frequencia[ nota / 10 ]; 
            } // fim for nota
        } // fim for notas do estudante
        
        // para cada franque da nota imprime o gráfico de barras
        for( int contar = 0; contar < frequencia.length; contar++ ) {
            
            if( contar == 10 )
                System.out.printf("%5d:  ", 100 );
            else
                System.out.printf("%02d-%02d:", contar * 10, contar * 10 +9 );
            
            for( int estrela = 0; estrela < frequencia[ contar ]; estrela++ ) {
                System.out.print("*");
            } // fim for interno
            
        System.out.println(); // pula uma linha    
        } // fim for externo
        
    } // fim gráfico de barras
    
    // método mostra as notas
    public void mostraAsNotas() {
        
        System.out.printf("As notas são: %n");
        System.out.print("              ");
        
        for( int teste = 0; teste < notas[ 0 ].length; teste++ )
            System.out.printf("Teste%d  ", teste + 1 );
        
        System.out.println("  Média:");
        
        for( int estudante = 0; estudante < notas.length; estudante++ ) {
            System.out.printf("Estudante %2d", estudante + 1 );
            
            for( int teste : notas[ estudante ] )
                System.out.printf("%8d", teste );
            
            double media = getMedia(notas[ estudante ] );
            System.out.printf("%9.2f%n", media );
            
        } // fim for estudante
    } // fim mostra as notas
    
    // método processa dados
    public void processaDados() {
        // mostra notas
        mostraAsNotas();
        
        // mostra menor e maior nota
        System.out.printf("%n%s %d%n%s %d%n%n", 
                                        "A menor nota é ", getMenorNota(),
                                        "A maior nota é ", getMaiorNota() );
        
        // chama o método saída de barras
        graficoDeBarras();
        
    } // fim método processa dados
} // fim classe