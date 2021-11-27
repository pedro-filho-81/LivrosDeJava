public class VerdadeiroOuFalso03 {
    /*
        1.2.3 Suponha que a e b sejam variáveis booleanas. Mostre que a expressão
        (! (a && b) && (a || b)) || ((a && b) ||! (a || b))
        avalia como verdadeiro.
        RESPOSTA: COM o operador ( || <=> OU ) 
                basta um ser verdade para A expressão ser verdadeira
                para ser uma expressão falsa TODOS devem ser falso
        Sedgewick, Robert; Wayne, Kevin. Ciência da computação (p. 44). Pearson Education. Edição do Kindle.
    */
    public static void main(String[] args) {
        
        // variaveis
        boolean a = false;
        boolean b = false;

        // calcula
        boolean expressao = ( !(a && b) && (a || b)) || ((a && b) ||!(a || b));

        // imprime resultado
        System.out.println("\nboolean a = true;");
        System.out.println("boolean b = false;");
        System.out.println("boolean expressao = ( !(a && b) && (a || b)) || ((a && b) ||! (a || b)); ");
        System.out.println("A expressão é " + expressao );
        System.out.println();

        // imprime resultado
        System.out.println("boolean a = false;");
        System.out.println("boolean b = true;");
        System.out.println("boolean expressao = ( !(a && b) && (a || b)) || ((a && b) ||! (a || b)); ");
        System.out.println("A expressão é " + expressao );
        System.out.println();

        // imprime resultado
        System.out.println("boolean a = true;");
        System.out.println("boolean b = true;");
        System.out.println("boolean expressao = ( !(a && b) && (a || b)) || ((a && b) ||! (a || b)); ");
        System.out.println("A expressão é " + expressao );
        System.out.println();

        // imprime resultado
        System.out.println("boolean a = false;");
        System.out.println("boolean b = faose;");
        System.out.println("boolean expressao = ( !(a && b) && (a || b)) || ((a && b) ||! (a || b)); ");
        System.out.println("A expressão é " + expressao );
        System.out.println();

    } // fim main
} // fim classe
