/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe6_04;

/**
 *  6.4 Forneça o cabeçalho de método para cada um dos seguintes métodos.
a) O método hypotenuse, que aceita dois argumentos de ponto flutuante de precisão dupla side1 e side2 
* e retorna um resultado de ponto flutuante de dupla precisão.
b) O método smallest, que recebe três inteiros x, y e z e retorna um inteiro.
c) O método instructions, que não aceita nenhum argumento e não retorna um valor. 
* [Observação: esses métodos são comumente utilizados para exibição de instruções para o usuário.]
d) O método intToFloat, que recebe um argumento number do tipo inteiro e retorna um float
 * @author Pedro, 25/01/2022
 */
public class Exe6_04 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variáveis
        double hipot = hypotenuse(5, 9);
        int small = smallest(5, 8, 3);
        float resultado = intToFloat(5);
        
        
        System.out.printf("hipotenuse = %.2f%n", hipot );
        System.out.printf("maior valor = %d%n", small );
        // chama a função instruction
        instruction();
        System.out.printf("inteiro para float %.2f%n", resultado);
        
    } // fim main

        // 6.4 Forneça o cabeçalho de método para cada um dos seguintes métodos.
           // a) O método hypotenuse, que aceita dois argumentos de ponto flutuante de precisão dupla side1 e side2 e retorna um resultado de 
          // ponto flutuante de dupla precisão.
                public static double hypotenuse( double side1, double side2) {
                    double hipo = Math.pow(side1, 2) + Math.pow(side2, 2);
                    return hipo;
                } // fim hipotenuse
            
            // b) O método smallest, que recebe três inteiros x, y e z e retorna um inteiro.
                    public static int smallest( int x, int y, int z ) {
                        int sma = x; // sma recebe x
                        
                        if( y > sma) // se y maior que sma
                            sma = y;
                                    
                       if( z > sma )
                           sma = z;
                                                
                        return sma;
                    } // fim método
                            
           // c) O método instructions, que não aceita nenhum argumento e não retorna um valor. [Observação: esses métodos são comumente 
            // utilizados para exibição de instruções para o usuário.]
                    public static void instruction() {
                        System.out.println("coloque instruções aqui");
                    } // fim métoro
                    
            // d) O método intToFloat, que recebe um argumento number do tipo inteiro e retorna um float    
                    public static float intToFloat( int x ) {
                        
                        float numero =  x;                        
                        
                        return numero;
                        
                    } // fim método
                    
} // fim classe
