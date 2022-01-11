/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_28;

/**
 *4.28 (Outro problema do else oscilante) Modifique o código dado para produzir a saída mostrada em 
 * cada parte do problema. Utilize as técnicas de recuo adequadas. Não faça nenhuma alteração além de inserir 
 * chaves e alterar o recuo do código. O compilador ignora recuo em um programa Java. Eliminamos o recuo do 
 * código fornecido para tornar o problema mais desafiador. [Observação: é possível que não seja necessária 
 * nenhuma modificação para algumas das partes.]
* if (y == 8) 
   if (x == 5) 
System.out.println("@@@@@"); 
else 
System.out.println("#####"); 
System.out.println("$$$$$"); 
System.out.println("&&&&&");
a) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
 @@@@@ 
 $$$$$ 
 &&&&&
b) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
 @@@@@
c) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
 @@@@@
d) Supondo que x = 5 e y = 7, a seguinte saída é produzida. [Observação: todas as três últimas instruções de saída depois do else são 
partes de um bloco].
 ##### 
 $$$$$ 
 &&&&&
 * @author 10/01/2022
 */
public class Exercicio4_28 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
            a) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
             @@@@@ 
             $$$$$ 
             &&&&&
        */
        
        // variáveis
        int x = 5;
        int y = 8;
        
        // se y igual a 8
        if (y == 8) 
            // e se x igual a 5
            if (x == 5) 
                // imprima
                System.out.println("@@@@@"); 
            else // se não
                // imprima
                System.out.println("#####"); 
        
        // imprima independente da condição if
         System.out.println("$$$$$"); 
         System.out.println("&&&&&");
         
    } // fim main
} // fim classe