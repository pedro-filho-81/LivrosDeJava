/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5_21;

/**
 *5.21 (Triplos de Pitágoras) Um triângulo retângulo pode ter lados cujos comprimentos são todos inteiros. 
 * O conjunto de três valores inteiros para os comprimentos dos lados de um triângulo retângulo é chamado de triplo de Pitágoras. 
 * Os comprimentos dos três lados devem satisfazer a relação de que a soma dos quadrados de dois dos lados é igual ao quadrado 
 * da hipotenusa. Escreva um aplicativo para exibir uma tabela dos triplos de Pitágoras para side1, side2 e hypotenuse, todos não 
 * maiores que 500. Utilize um loop for triplamente aninhado que tenta todas as possibilidades. Esse é um método de computação 
 * de “força bruta”. Você aprenderá nos cursos de ciência da computação mais avançados que para muitos problemas interessantes 
 *  não há uma abordagem algorítmica conhecida além do uso de força bruta absoluta.
 * @author Pedro Filho, 22/01/2022
 */
public class Exe5_21 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        for( int lado1 = 1; lado1 <= 500; lado1++ ) {
            for( int lado2 = 1;lado2 <= 500; lado2++ ) {
                for( int hipo = 1; hipo <= 500; hipo++ ) {
                    if( ( Math.pow(lado1, 2) + Math.pow(lado2, 2) ) == Math.pow(hipo, 2) ) {
                        System.out.printf("%3d   + %3d   = %3d%n", lado1, lado2, hipo );
                    }
                }
            }
        }
    }
    
}
