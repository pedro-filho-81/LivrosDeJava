/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfraction;

/**
 7.3 Realize as seguintes tarefas para um array chamado fractions:
a) Declare uma constante ARRAY_SIZE que é inicializada como 10.
b) Declare um array com ARRAY_SIZE elementos do tipo double e os inicialize como 0.
c) Referencie o elemento 4 do array.
d) Atribua o valor 1.667 ao elemento 9 do array.
e) Atribua o valor 3.333 ao elemento 6 do array.
f) Some todos os elementos do array, utilizando uma instrução for. 
* Declare a variável inteira x como uma variável de controle para o loop.
 * @author Pedro, 16/02/2022
 */
public class ArrayFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // 7.3 Realize as seguintes tarefas para um array chamado fractions:
      //a) Declare uma constante ARRAY_SIZE que é inicializada como 10.
      final int ARRAY_SIZE = 10;
      
      //  b) Declare um array com ARRAY_SIZE elementos do tipo double e os inicialize como 0.
      double[] fractions = new double[ ARRAY_SIZE ];
      
      //  c) Referencie o elemento 4 do array.
      fractions[4] =  0;
      
      //  d) Atribua o valor 1.667 ao elemento 9 do array.
      fractions[9] = 1.667;
      
      //  e) Atribua o valor 3.333 ao elemento 6 do array.
      fractions[6] = 3.333;
      
      //  f) Some todos os elementos do array, utilizando uma instrução for. 
      //  Declare a variável inteira x como uma variável de controle para o loop.
      
      int x;
      int soma = 0;
      
      for( x = 0; x < fractions.length; x++ )
          soma += fractions[ x ];
    } // fim main
} // fim classe
