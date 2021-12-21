/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_4;

/**
*       4.4 Escreva instruções Java para realizar cada uma das seguintes tarefas:
*      a) Utilize uma instrução para atribuir a soma de x e y a z, em seguida, incremente x por 1.
*      b) Teste se a variável contador é maior do que 10. Se for, imprima "Contador é maior que 10".
*      c) Utilize uma instrução para decrementar a variável x por 1, então subtraia-o da variável total 
*        e armazene o resultado na variável total.
*      d) Calcule o resto após q ser dividido por divisor e atribua o resultado a q. Escreva essa instrução de duas maneiras diferentes.
* @author Pedro Filho, 21/12/2021
*/

import java.util.Scanner;

public class Exercicio4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // inicializa objeto 
        Scanner input = new Scanner(System.in);
        
        //  a) Utilize uma instrução para atribuir a soma de x e y a z, em seguida, incremente x por 1.
        // entrada de dados
        System.out.printf("Digite um valor inteiro: ");
        int x = input.nextInt();
        System.out.println("Segundo valor: ");
        int y = input.nextInt();
        System.out.println("Terceiro valor: ");
        int z = input.nextInt();
        
        // calcular
        int soma = x + y + z;

        System.out.printf("A soma de %d + %d + %d = %d\n", x, y, z, soma);
    } // fim main
} // fimclasse

