public class Exercicio09 {
    /*
     * 1.2.9 O que cada um dos itens a seguir imprime?
     * 
     * System.out.println ('b');
     * System.out.println ('b' + 'c');
     * System.out.println ((char) ('a' + 4));
     * Explique cada resultado.
     */
    public static void main(String[] args) {

        // imprime o caractere b toda letre, simbolo, número
        // entre aspas simples é um caractere
        System.out.println('b'); // imprime b

        // soma os valores de ( b e g ) da tabela ASC e mostra o resultado
        System.out.println('b' + 'g');  // imprime 201

        // soma o valor de a mais 4 e mostra o caractere ( e ) 
        // se colocarmos um número da tabela ASC é mostrado a letra correspondente
        System.out.println( (char) ('a' + 4)); // imprime e

    } // fim main
} // fim classe
