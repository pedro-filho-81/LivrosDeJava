public class InicializandoVetor02 {
    public static void main(String[] args) {

        // declarando e inicializando vetor
        double[] x = new double[10];
        double[] y = new double[10];

        // criando variáveis
        double soma = 0.0;

        // adicionando valores a x, y e soma
        for (int i = 0; i < 10; i++) {
            x[i] = Math.random() * 30; // adiciona valores a x
            y[i] = Math.random() * 20; // adiciona valores a y

        } // fim for

        // loop para mostrar os valores de x e y
        for (int i = 0; i < 10; i++) {
            
            soma += x[i] * y[i]; // soma os produtos de x e y
            System.out.println(x[i] + "    " + y[i] + "    " +
                                 x[i] * y[i] + "    " + soma);
        } // fim for
    } // fim main
}// fim classe
