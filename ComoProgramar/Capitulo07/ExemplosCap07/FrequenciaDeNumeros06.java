import java.security.SecureRandom;

public class FrequenciaDeNumeros06 {
    public static void main(String[] args) {
        
        // cria o objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

        // vetor
        int[] frequencia = new int[7];

        // loop para rolar a frequência
        for(int rolar = 1; rolar <= 6000000; rolar++) {
            frequencia[1 + aleatorio.nextInt(6)]++;
        } // fi for rolar

        System.out.printf("%s%15s%n", "Indice", "Frequencia");

        // loop para mostrar
        // loop para mostrar a frequência
        for(int mostrar = 1; mostrar < frequencia.length; mostrar++) {
            System.out.printf("%3d%15d%n", mostrar, frequencia[mostrar]);
        } // fim for mostrar

    } // fim main    
} // fim classe