/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp04;

/**
 *Este programa imprime as raízes do polinômio x2 + bx + c, usando a fórmula quadrática. 
 * Por exemplo, as raízes de x2 – 3x + 2 são 1 e 2, pois podemos fatorar a equação como (x – 1)(x – 2); 
 * as raízes de x2 – x – 1 são ϕ e 1 – ϕ, onde ϕ é a proporção áurea; e as raízes de x2 + x + 1 não são números reais.
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 25). Pearson Educação. Edição do Kindle
 * 30/01/2022
 */

import java.util.Scanner;

public class Exp04 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto da classe Scanner
        Scanner imput = new Scanner(System.in);
        
        // entrada de dados
        System.out.print("Digite um número: ");
        double b = imput.nextDouble();
        System.out.print("Digite outro nùmero: ");
        double c = imput.nextDouble();

        double discriminant = b*b - 4.0*c; // calcula a discriminante
        double sqroot =  Math.sqrt(discriminant); // calcula a raiz quadrada

        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;

        System.out.println(root1);
        System.out.println(root2);
    }
    
}
