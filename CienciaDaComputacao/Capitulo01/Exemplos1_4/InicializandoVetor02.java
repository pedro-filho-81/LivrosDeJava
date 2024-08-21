package Exemplos1_4;

public class InicializandoVetor02 {
    public static void main(String[] args) {

        /*  Declarando e inicializando vetores
            double é o tipo do vetor, 
            x e y são os nomes do vetor
            a palavra-chave new torna as 
            variáveis um objeto double
            o valor 10 é a quantidade de
            elementos que os vetores comportam.*/ 
        double[] x = new double[10];
        double[] y = new double[10];

        // criando variáveis
        double soma = 0.0;

        // loop for para adicionar valores aos vetores x e y
        for (int i = 0; i < 10; i++) {
            // vetor x recebe valores aleatóris
            x[i] = Math.random() * 30;
            // vetor y também recebe valores aleatórios
            y[i] = Math.random() * 20;
        } // fim for

        // cabeçalho
        System.out.println("\tx[i]\ty[i]\tx[i]*y[i]\tSoma");

        // loop para somar os valores de x e y
        for (int i = 0; i < 10; i++) {
            
            soma += x[i] * y[i]; // soma os produtos de x e y

            // depois imprimir o resultado
            System.out.println("\t " + 
            (int) x[i] + "\t " + 
            (int) y[i] + "\t   " + 
            (int) x[i] * 
            (int) y[i] + "\t         " + 
            (int) soma);
        } // fim for
    } // fim main
}// fim classe
