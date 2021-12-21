/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_4;

/**
 *  4.4 Escreva instruções Java para realizar cada uma das seguintes tarefas:
       a) Utilize uma instrução para atribuir a soma de x e y a z, em seguida, incremente x por 1.
       b) Teste se a variável contador é maior do que 10. Se for, imprima "Contador é maior que 10".
       c) Utilize uma instrução para decrementar a variável x por 1, então subtraia-o da variável total e armazene o resultado na variável 
       total.
       d) Calcule o resto após q ser dividido por divisor e atribua o resultado a q. Escreva essa instrução de duas maneiras diferentes.
 * @author 
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
        System.out.print("Digite um valor inteiro: ");
        int x = input.nextInt();
        System.out.print("Segundo valor: ");
        int y = input.nextInt();
        System.out.print("Terceiro valor: ");
        int z = input.nextInt();
        
        System.out.printf("int x = %d, y = %d, z = %d\n", x, y, z );
        
        // calcular
        int soma = x + y + z;
        System.out.printf("A soma de %d + %d + %d = %d\n", x, y, z, soma);
        
        x += 1; // soma 1 a x
        System.out.printf("x += 1\n");
        
        System.out.printf("int x = %d, y = %d, z = %d\n", x, y, z );
        
        System.out.printf("A soma de %d + %d + %d = %d\n", x, y, z, x + y + z );
        
    } // fim main
} // fimclasse

