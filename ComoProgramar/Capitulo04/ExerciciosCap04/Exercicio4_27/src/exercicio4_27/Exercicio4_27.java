/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_27;

/**
 *4.27 (Problema do else oscilante) Determine a saída para cada um dos conjuntos dados de código quando x é 9 e y é 11 
 * e quando x é 11 e y é 9. O compilador ignora o recuo em um programa Java. Da mesma forma, o compilador Java sempre 
 * associa um else com o if imediatamente precedente a menos que instruído a fazer de outro modo pela colocação de chaves ({}). 
 * À primeira vista, o programador pode não ter certeza de qual if um else particular corresponde — essa situação é conhecida como 
 * "problema do else oscilante". Eliminamos o recuo do seguinte código para tornar o problema mais desafiador. 
 * [Dica: aplique as convenções de recuo que você aprendeu.]
        a) if (x < 10) 
        if (y > 10) 
        System.out.println("*****"); 
        else 
        System.out.println("#####"); 
        System.out.println("$$$$$");
        b) if (x < 10) 
        { 
        if (y > 10) 
        System.out.println("*****"); 
        } 
        else 
        { 
        System.out.println("#####"); 
        System.out.println("$$$$$"); 
        }
 * @author Pedro, 10/01/2022
 */
public class Exercicio4_27 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("A) "); // cabeçalho da questão A
        
        // cria variáveis
        int x = 9; // x recebe 9
        int y = 11; // y recebe 11
        
        if (x < 10) // se x menor que 10
            if (y > 10)  // e se y maior que 10
                System.out.println("*****");  // imprime *****
            
            else  // se y for menor que 10
                System.out.println("#####");  // imprime #####
        
        System.out.println("$$$$$"); // imprime independente da condição
        
        System.out.println("\nB) "); // cabeçalho da questão B
        
        if (x < 10) { // se x menor que 10
            if (y > 10) // se y maior que 10
                System.out.println("*****"); // imprima *****
        }  // fim if
        
        else // se não
        { 
            // imprima #####
            System.out.println("#####"); 
            // imprima $$$$$
            System.out.println("$$$$$"); 
        } // fim else
        
        // RESPOSTA QUANDO X = 9 E Y = 11
        /*
            A) 
            *****
            $$$$$
            B) 
            *****
        */
        
        // RESPOSTA QUANDO X = 11 E Y = 9
        /*
            A) 
            $$$$$
            B) 
            #####
            $$$$$
        */
      
    } // fim main    
} // fim classe
