
import gradebook.GradeBook;

// Cria o objero GradeBook usando uma matriz para armazenar as notas
// e então, invoca o método processa dados para mostrar 
public class GradeBookTeste {
    
    // cria o método main
    public static void main(String[] args) {
        
        // cria uma matriz
        int[][] matrizNotas = { { 87, 96, 71 },
                                             { 68, 87, 91 },
                                             { 94, 100, 90 },
                                             { 100, 81, 82 },
                                             { 83, 65, 85 },
                                             { 78, 87, 65 },
                                             { 85,75,83 },
                                             { 91, 94, 100 },
                                             { 76, 72, 84 },
                                             { 87, 93, 73 }
                                            }; // fim matriz
        
        // cria objeto da classe
        GradeBook meuGradeBook = new GradeBook("Livro Java Como Programar", matrizNotas);
        
        System.out.println("Bem vindo aou curso:" + meuGradeBook.getNomeDoCurso() );
        
        // chama o método processa
        meuGradeBook.processaDados();
        
    } // fim main
} // im classe
