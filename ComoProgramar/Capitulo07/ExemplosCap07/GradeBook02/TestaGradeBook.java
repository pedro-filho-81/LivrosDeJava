public class TestaGradeBook {
    public static void main(String[] args) {
        
        // vetor notas
        int[] notasDosAlunos = {87, 68, 75, 82, 98, 100, 54, 36, 77, 94};

        // objeto GradeBook
        GradeBook meuGradeBook = new GradeBook("Java Como Programar", notasDosAlunos);

        // mostra resultado
        System.out.printf("Bem vindo ao Curso: %n%s%n%n",
                            meuGradeBook.getNomeDoCurso());

        meuGradeBook.processaMetodos();

    } // fim main 
} // fim classe