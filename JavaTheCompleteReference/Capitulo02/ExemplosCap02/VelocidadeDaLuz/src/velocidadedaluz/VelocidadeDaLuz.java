/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velocidadedaluz;

/**
 * Calcula a velocidade da luz em uma certa distância em dias
 * 21/02/2022
 */
public class VelocidadeDaLuz {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // calcula a velocidade da luz em uma distância 
        // variáveis
        int velocidadeDaLuz;
        long dias;
        long segundos;
        long distancia;
        
        // velocidade da luz em milha por segundos
        velocidadeDaLuz = 186000;
        
        // espscifica o número de dias 
        dias =1000;
        
        // converte para segundos
        segundos = dias * 24 * 60 * 60;
        
        // calcula a distância que a luz percorre
        distancia = velocidadeDaLuz * segundos;
        
        System.out.printf("Em %d", dias );
        System.out.printf(" dias a luz viaja %d milhas.%n", distancia);
        
    } // fim main    
} // fim classe