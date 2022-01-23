/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp6_05;

/**
 *Figura 6.9: Scope.java
   A classe Scope demonstra os escopos de campo e de variável local.
 * @author 23/01/2022
 */
public class Exp6_05 {

    // campo acessível para todos os métodos dessa classeÿ
    private static int x = 1;

    // O método main cria e inicializa a variável local x 
    // e chama os métodos useLocalVariable e useField    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // campo acessível para todos os métodos dessa classeÿ
        int x = 1;

        // O método main cria e inicializa a variável local x 
        // e chama os métodos useLocalVariable e useField
        System.out.printf("local x in main is %d%n", x);

            useLocalVariable(); // useLocalVariable tem uma variável local x
            useField(); // useField utiliza o campo x da classe Scope
             useLocalVariable(); // useLocalVariable reinicializa a variável local x
            useField(); // campo x da classe Scope retém seu valor

            System.out.printf("%nlocal x in main is %d%n", x);
    } // fim main    

    private static void useLocalVariable() {
        
        int x = 25; // inicializada toda vez que useLocalVariable é chamado
        
        System.out.printf( "%nlocal x on entering method useLocalVariable is %d%n", x);
        
        ++x; // modifica a variável local x desse métodoÿ
        
        System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
    } // fim método

    private static void useField() {
        System.out.printf("%nfield x on entering method useField is %d%n", x);
        
        x *= 10; // modifica o campo x da classe Scopeÿ
        
        System.out.printf("field x before exiting method useField is %d%n", x);
    } // fim método
} // fim classe