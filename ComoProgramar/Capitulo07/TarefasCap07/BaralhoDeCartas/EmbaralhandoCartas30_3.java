

import java.security.SecureRandom;

public class EmbaralhandoCartas30_3 {
    /**
     * Prog. para Embaralhar as cartas do baralho
     * Pedro, 06/07/2022
     */
    public static void main(String[] args) {

        // declara, cria e inicializa o vetor naipe
        String[] naipe = {"Ouro", "Copas", "Paus", "Espadas"};
        
        // declara, cria e inicializa o vetor cartas
        String[] cartas = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                            "Valete", "Dama", "Rei"};

        // constante
        final int INDICE = (naipe.length * cartas.length);

        // declara, cria o vetor baralho que utiliza
        // o tamanho do naipe e das cartas coo ìndice
        String[] baralho = new String[INDICE];

        // chaa função adicionar
        adicionarCartas(cartas, naipe, baralho);

        // CABEÇALHO
        System.out.printf("%50s"," BARALHO DE CARTAS ORIGINAL:");
        // exibi cartas 
        exibirCartas(baralho);
        System.out.println(); // pula linha

        System.out.printf("\n%50s","BARALHO DE CARTAS ALEATÓRIO:");
        //embaralharCartas
        embaralharCartas(baralho);
        exibirCartas(baralho);
        System.out.println(); // pula linha

    } // final principal

    // adicionar valor
    public static void adicionarCartas(String[] cartas, String[] naipe, String[] baralho) {
        
        // loop para inicializar o vetor baralho
        // loop das cartas
        for(int i = 0; i < cartas.length; i++) {
            // loop para os naipes
            for(int j = 0; j < naipe.length; j++) {

                // baralho recebe as cartas e os naipes ordenados
                baralho[naipe.length * i + j] = cartas[i] + " de " + naipe[j];

            } // final for naipe
        } // final for cartas
        
    } // final adicionar

    // Embaralharcartas
    public static void embaralharCartas(String[] baralho) {

        // cria o objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

        // loop para percorrer o vetor
        for(int i = 0; i < baralho.length; i++) {

            // cria constante índice
            final int INDICE = aleatorio.nextInt(baralho.length);

            // cria variável teporaria
            String temp = baralho[INDICE];
            baralho[INDICE] = baralho[i];
            baralho[i] = temp;

        } // final for i

    } // final EmbaralharCartas

    // Exibir cartas
    public static void exibirCartas(String[] baralho) {
        // loop para exibir as cartas do baralho
        for(int i = 0; i < baralho.length; i++) {
            
            if(i % 4 == 0)
                // pula linha
                System.out.println();

            // exibe as cartas do baralho
            System.out.printf("%19s", baralho[i]);
            
        } // final for i

    } // final exibirCartas

} // final classe
