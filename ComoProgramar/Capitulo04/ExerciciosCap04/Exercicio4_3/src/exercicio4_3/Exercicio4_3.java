package exercicio4_3;
/*
 *4.3 Escreva quatro instruções Java diferentes que adicionam 1 à variável de inteiro x.
 * @author Pedro Filho, 19/12/2021
 */
public class Exercicio4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 1;
        System.out.println("Cria e inicializa x em um: int x = 1 => " +  x);
        x += 1;
        System.out.println("Soma um a x: x += 1 => " + x );
        x++;
        System.out.println("Pós-incrementa x: x++ => " + x );
        ++x;
        System.out.println("Pré-incrementa x: ++x => " + x );
    } // fim main    
} // fim classe