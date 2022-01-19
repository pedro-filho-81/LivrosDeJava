/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5_15;

/**
 *  5.15 (Programa para impressão de triângulos) Escreva um aplicativo que exibe os seguintes padrões separadamente, 
 * um embaixo do outro. Utilize loops for para gerar os padrões. Todos os asteriscos (*) devem ser impressos por uma única 
 * instrução na forma System.out. print('*'); o que faz com que os asteriscos sejam impressos lado a lado. Uma instrução na 
 * forma System.out.println(); pode ser utilizada para mover-se para a próxima linha. Uma instrução na forma 
 * System.out.print(' '); pode ser utilizada para exibir um espaço para os últimos dois padrões. Não deve haver outras instruções 
 * de saída no programa. 
 * [Dica: os dois últimos padrões requerem que cada linha inicie com um número adequado de espaços em branco.]
 * @author Pedro Filho, 19/01/2022
 */
public class Exe5_15 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // primeiro triângulo
        System.out.println("A)");
        // primeiro triângulo
        for( int linha = 1; linha <= 10; linha++ ){
            for( int coluna = 1; coluna <= linha; coluna++ ) {
                System.out.print("*"); // imprime asterisco
            } // fim for interno
            System.out.println(); // pula linha
        } // fim for externo        
        
        // segundo triângulo
        System.out.println("B)");
        // primeiro triângulo
        for( int linha = 1; linha <= 10; linha++ ){
            for( int coluna = linha; coluna <= 10; coluna++ ) {
                System.out.print("*"); // imprime asterisco
            } // fim for interno
            System.out.println(); // pula linha
        } // fim for externo
        
        // terceiro triângulo
        System.out.println("C)");
        // primeiro triângulo
        for( int linha = 1; linha <= 10; linha++ ){
            // loop para triangulo vazio
            for( int coluna = 1; coluna <= linha; coluna++ ) {
                System.out.print(' '); // imprime asterisco
            } // fim for interno
            for( int asterisco = linha; asterisco <= 10; asterisco++ ) {
                System.out.print('*'); // pula linha
            } // fim for asterisco
            System.out.println();
        } // fim for externo
         
        // quarto triângulo
        System.out.println("D)");
        // primeiro triângulo
        for( int linha = 1; linha <= 10; linha++ ){
            for( int coluna = linha; coluna <= 10; coluna++ ) {
                System.out.print(' '); // imprime asterisco
            } // fim for interno
            for( int asterisco = 1; asterisco <= linha; asterisco++ ) {
                System.out.print('*'); // pula linha
            } // fim for
            System.out.println(); // pula linha
        } // fim for externo
       
        
    } // fim main    
} // fim classe
