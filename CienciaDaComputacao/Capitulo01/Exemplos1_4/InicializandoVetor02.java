package Exemplos1_4;

public class InicializandoVetor02 {
    public static void main(String[] args) {

        // declarando e inicializando vetor
        // tipo-nome= inicializa [10] quantidade de elementos
        // tipo double, nome x, novo double[tamanho => 10] 
        double[] x = new double[10];
        double[] y = new double[10];

        // criando variáveis
        double soma = 0.0;

        // adicionando valores aos vetores x e y
        for (int i = 0; i < 10; i++) {
            x[i] = Math.random() * 30; // adiciona valores a x
            y[i] = Math.random() * 20; // adiciona valores a y
        } // fim for

        // cabeçalho
        System.out.println("\tx[i]\ty[i]\tx[i]*y[i]\tSoma");

        // loop para somar os valores de x e y
        for (int i = 0; i < 10; i++) {
            
            soma += x[i] * y[i]; // soma os produtos de x e y

            // depois imprimir o resultado
            System.out.println("\t " + (int) x[i] + "\t " + (int) y[i] + "\t   " +
                                 (int) x[i] * (int) y[i] + "\t         " + (int) soma);
        } // fim for
    } // fim main
}// fim classe
