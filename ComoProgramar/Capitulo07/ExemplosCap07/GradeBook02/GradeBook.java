public class GradeBook {

    // variável de instância
    private String nomeDoCurso;
    private int[] notasDosAlunos;

    // cria o construtor
    public GradeBook(String nomeDoCurso, int[] notasDosAlunos) {
        this.nomeDoCurso = nomeDoCurso;
        this.notasDosAlunos = notasDosAlunos;
    } // fim construtor

    // recebe o nome do curso
    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    } // fim método nome do curso

    // método get retorna o nome do curso
    public String getNomeDoCurso() {
        return nomeDoCurso;
    } // fimm get

    // processa os métodos da classe
    public void processaMetodos() {
        // chama outputGrades
        mostrarNotas();

        // média das notas
        System.out.printf("\nMédia das notas = %5f%n", 
                            getMediaDasNotas() );

        // mostra a menor e a maior nota
        System.out.printf("Menor nota = %5d%nMaior nota = %5d%n", 
                            getMenorNota(), getMaiorNota() );

        // mostra o gráfico de barras
        graficoDeBarras();

    } // fim processa métodos

    // menor nota
    public int getMenorNota() {

        // variável enor nota
        int menorNota = notasDosAlunos[0];

        // fal ummm loop pelo vetor de notas
        for( int nota : notasDosAlunos) {
            
            // se a nota menor que a menor nota
            if(nota < menorNota)
                // menor nota recebe a nota
                menorNota = nota;
        } // fim for nota

        // retorne a mmenor nota
        return menorNota;

    } // fim menor nota

    // método maior nota
    public int getMaiorNota() {
        // variável
        int maiorNota = notasDosAlunos[0];

        // loop pelo vetor notas dos alunos
        for(int nota : notasDosAlunos) {
            // se a nota for mmaior que q maior nota
            if(nota > maiorNota) {
                // maior nota recebe o valor da nota
                maiorNota = nota;
            } // fim if
        } // fim for
            
        //retorne o valor da mmaior nota
        return maiorNota;

    } // fim método maior nota

    // método get mmédia
    public double getMediaDasNotas() {

        // variável
        int soma = 0;

        // loop pelo vetor
        for(int nota : notasDosAlunos) {
            // soma as notas dos alunos
            soma += nota;
        } // fimm for 

        // retorna a média
        return (double) soma / notasDosAlunos.length;

    } // fimm média das notas

    // gráfico de barras
    public void graficoDeBarras() {

        // distribuição das notas
        System.out.println("Distribuição das notas:");

        // vetor frequência das notas
        int[] frequencia = new int[11];

        // loop para adicionar valor na frequência
        for(int nota : notasDosAlunos) {
            ++frequencia[nota / 10];
        } // fimm for aprimmmorado

        // loop para
        for(int contar = 0; contar < frequencia.length; contar++) {

            // gera saída de barras
            if(contar == 10) {
                System.out.printf("  %5d: ", 100);
            } // fimm if
            else {
                System.out.printf("%02d - %02d: ",
                                    contar * 10, contar * 10 + 9);
            } // fim else

            // loop para imprimir a barra de asterosco
            for( int estrela = 0; estrela < frequencia[contar]; estrela++) {
                // imprime asterisco
                System.out.print("*");
            } // fim for

            System.out.println(); // pula linha

        } // fim for contar
    } // fim gráfico de barras

    // mostrar notas
    public void mostrarNotas() {
        for( int mostra = 0; mostra < notasDosAlunos.length; mostra++) {
            System.out.printf("Estudante %2d: %3d%n",
                                mostra + 1, notasDosAlunos[mostra]);
        } // fim for mostra
    } // fim mostrar notas

} // fim classe