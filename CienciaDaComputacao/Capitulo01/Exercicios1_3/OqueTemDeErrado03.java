package Exercicios1_3;

public class OqueTemDeErrado03 {
    /*
     * 1.3.3 O que há de errado (se houver) com cada uma das seguintes afirmações?
     * int a = 2;
     * int b = 1;
     * int c;
     * if (a> b) então c = 0;
     * if a> b {c = 0; }
     * if (a> b) c = 0;
     * if (a> b) c = 0
     * senão b = 0;
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 81).
     * Pearson Education. Edição do Kindle.
     * Pedro, 01/12/2021
     */
    public static void main(String[] args) {

        // variáveis
        int a = 2;
        int b = 1;
        int c;

        // A:
        if (a > b) // então
            c = 0;
        /*
         * if (a> b) então c = 0;
         * OqueTemDEErrado03.java:26: ( error: variable declaration not allowed here )
         * c = 0;
         * ^
         * 1 error
         * aparece essa mensagem de erro informando a linha e o erro:
         * 26: erro: declaração de variável não permitida aqui
         * só que, o erro é a palavra ( então ) que pode ser um comentário
         * e não foi colocado o // antes da palavra
         * Nem sempre o erro de compilação está na linha indicada
         * Temos que verificar com ateção.
         */

        // B:
        if (a > b) {
            c = 0;
        }

        /*
         * if a> b {c = 0; }
         * OqueTemDEErrado03.java:38: error: '(' expected
         * if a > b
         * ^
         * OqueTemDEErrado03.java:38: error: ')' expected
         * if a > b
         * ^
         * 2 errors
         * Nesse foram esquecidos os parênteses antes e depois da condição
         * correto: if( a > b )
         */

        // C:
        if (a > b)
            c = 0; // este não tem erros

        // D:
        if (a > b)
            c = 0; //
        else
            b = 0;

        /*
         * if (a> b) c = 0 else b = 0;
         * OqueTemDEErrado03.java:55: ( error: ';' expected)
         * if (a> b) c = 0
         * ^
         * 1 error
         * Neste a indicação é que falta o ponto e virgúla no final da instrução
         * Correto: if ( a > b ) c = 0;
         */

    } // fim main
} // fim classe
