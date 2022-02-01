
package gradebookteste;

/**
 *   // Figura 7.15: GradeBookTest.java
     // GradeBookTest cria um objeto GradeBook utilizando um array de notas, 
    // e, então, invoca o método processGrades para analisá-las.
 *  01/02/2022
 */
public class GradeBookTeste {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria vetor de notas
        int[] vetorNotas = { 87, 98, 74, 65, 100, 42, 70, 22, 39, 55 };
        
        // cria o objeto para a classe GradeBook, com o nome do curso e o vetor das notas
        GradeBook meuGradeBook = new GradeBook( "Java 8 Como Programar", vetorNotas);
        
        // mensagem de boas vindas
        System.out.printf("Bem vindo ao curso: %n%s%n", 
                                    meuGradeBook.getNomeDoCurso() );
        
        // chama o método processa dados
        meuGradeBook.processaDados();
        
    } // fim main    
} // fim classe