public class GradeBook12 {

    // variáveis de instância
    private String nomeDoCurso;
    // matriz para às notas
    private int[][] notas;

    // construtor da classe
    public GradeBook12(String nomeDoCurso, int[][] notas) {
        this.nomeDoCurso = nomeDoCurso;
        this.notas = notas;
    } // fim construtor

    // método set nome do curso
    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    } // fim set nome do curso

    // método get nome do curso
    public String getNomeDoCurso() {
        return nomeDoCurso;
    } // fim get nome do curso

    // método processa notas
    public void processaNotas() {
        // chama mostra notas
        mostraNotas();

        // mostra menor e maior nota
        System.out.printf("\nMenor nota = %3d\nMaior nota = %3d\n\n",
                            getMenorValor(), getMaiorValor());

        graficoDeBarras();

    } // fim processa notas

    // get menor valor
    public int getMenorValor() {

        int menorValor = notas[0][0];

        // loop pelas linhas da matriz
        for (int[] notasDoEstudante : notas) {
            // loop pelas colunas da matriz
            for (int nota : notasDoEstudante) {
                // se a nota menor que o menor valor
                if (nota < menorValor) {
                    // menor valor recebe nota
                    menorValor = nota;
                } // fim if
            } // fim for notA
        } // FIM FOR notas do estudante

        // retorne o menor valor
        return menorValor;
    } // fim get menor valor

    // método maior valor
    public int getMaiorValor() {

        // variável recebe o primeiro valor da mmatriz
        int maiorValor = notas[0][0];

        // loop para alinha cria o vetor nota do estudante
        for (int[] notaDoEstudante : notas) {
            // loop para a coluna
            for (int nota : notaDoEstudante) {
                // se nota maior que maior valor
                if (nota > maiorValor) {
                    // maior valor recebe a nota
                    maiorValor = nota;
                } // fim if
            } // fim for coluna
        } // fim for linha
        // retorne maior valor
        return maiorValor;
    } // fim get maior valor

    // método média
    public double getMedia(int[] notaDoEstudante) {
        // variável somma
        int soma = 0;

        for (int nota : notaDoEstudante) {
            soma += nota;
        } // fim for nota

        // retorne a média
        return (double) soma / notaDoEstudante.length;

    } // fim mmétodo média

    // método gráfico de barras
    public void graficoDeBarras() {

        System.out.println("Distribuição das notas:");

        // vetor frequencia das notas
        int[] frequencia = new int[11];

        // for linha
        for (int[] notaDoEstudante : notas) {
            // loop para a coluna
            for (int nota : notaDoEstudante) {
                // para cada nota em notas soma 1 a frequência
                ++frequencia[nota / 10];
            } // fimm for coluna
        } // fim for nota

        // para cada frequencia de nota imprima gráfico de barras
        for (int contar = 0; contar < frequencia.length; contar++) {

            if (contar == 10) {
                System.out.printf("  %5d: ", 100);
            } // fimm if
            else {
                System.out.printf("%02d - %02d: ", contar * 10, contar * 10 + 9);
            } // fim else

            for (int asterisco = 0; asterisco < frequencia[contar]; asterisco++) {
                System.out.print("*");
            } // fim for astrisco

            System.out.println();

        } // fim for contar

    } // fimm método gráfico de barras

    // método mostra mmatriz
    public void mostraNotas() {

        // cabeçalho
        System.out.println("As notas sao: ");
        System.out.print("            ");

        // cria o título das colunas
        for (int teste = 0; teste < notas[0].length; teste++)
            System.out.printf("%8s%d", "Teste", teste + 1);

        System.out.printf("%8s%n", "Media:");

        // for linha
        for (int estudante = 0; estudante < notas.length; estudante++) {

            System.out.printf("Estudante%2d", estudante + 1);

            for (int teste : notas[estudante])
                System.out.printf("%7d", teste);

            double media = getMedia(notas[estudante]);
            System.out.printf("%9.2f%n", media);

        } // fimmm for estudante
    } // fim mostra

} // fim classe