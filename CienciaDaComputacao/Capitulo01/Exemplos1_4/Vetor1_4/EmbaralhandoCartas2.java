public class EmbaralhandoCartas2 {

    public static void main(String[] args) {
        
        // vetor naipe
        String[] NAIPE = {
            "Ouro", "Paus", "Espadas", "Copas"
        };
        
        String[] CARTAS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Valete", "Dama", "Reis", "As" 
        };

        // número de cartas do baralho 52
        int num = NAIPE.length * CARTAS.length;
        
        // declara, cria e inicializa o baralho
        String[] baralho = new String[num];
        
        // loop das cartas
        for( int i = 0; i < CARTAS.length; i++) {
            // loop dos naipes
            for( int j = 0; j < NAIPE.length; j++ ) {
                    // baralho recebe a carta e o naipe
                    baralho[NAIPE.length * i + j] = CARTAS[i] + " de " + NAIPE[j];
                } // fim for
        } // fim for

        // embaralhando cartas
        // loop for para embaralhar
        for( int i = 0; i < num; i++ ) {
            // gera um número aleatório
            int alea = 1 + (int) (Math.random() * (num - 1) );
            // temp recebe um baralho
            String temp = baralho[alea];
            baralho[alea] = baralho[i];
            baralho[i] = temp;
        } // fim for

        // loop mostra carta
        for( int i = 0; i < num; i++) {
            // imprime uma carta do baralho
            System.out.println(baralho[i]);
        } // fim for
    } // fim main    
} // fim classe