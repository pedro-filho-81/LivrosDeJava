import java.security.SecureRandom;

public class EmbaralhandoDistribuindo30 {
    /**
     * 7.30 (Embaralhamento e distribuição) Modifique o aplicativo da Figura 7.11 
     * para distribuir uma mão de cinco cartas de pôquer. Então, modifique a classe 
     * DeckOfCards da Figura 7.10 para incluir métodos que determinam se uma mão contém
     * a) um par
     * b) dois pares
     * c) trinca (por exemplo, três valetes)
     * d) quadra (por exemplo, quatro ases)
     * e) flush (isto é, cinco cartas do mesmo naipe)
     * f) straight (isto é, cinco cartas de valores consecutivos)
     * g) full house (isto é, duas cartas de um valor e três cartas de outro valor)
     * [Dica: adicione os métodos getFace e getSuit à classe Card da Figura 7.9.
     */    
    
    public static void main(String[] args) {

        // declara, cria e inicializa o vetor naipe
        String[] naipe = {"Ouro", "Copas", "Paus", "Espadas"};
        
        // declara, cria e inicializa o vetor cartas
        String[] cartas = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                            "Valete", "Dama", "Rei"};

        // constante 
        // índice para o baralho de 52 cartas
        final int INDICE = (naipe.length * cartas.length);

        // índice para o jogo de poker
        final int INDICE_POKER = 5;
        
        // declara, cria o vetor baralho que utiliza
        // o tamanho do naipe e das cartas coo ìndice
        String[] baralho = new String[INDICE];
        // vetor cartasDoBaralho recebe os valoes das 52 cartas embaralhadas
        String[] cartasDoBaralho = new String[INDICE];
        // vetor naipesDoBaralho recebe os naipes embaralhados
        String[] naipesDoBaralho = new String[INDICE];
                
        // vetor poker recebe as 5 cartas jogadas
        String[] poker = new String[INDICE_POKER];
        // vetor recebe os valores das 5 cartas jogadas
        String[] cartasJogadas = new String[INDICE_POKER];
        // vetor recebe os naipes das 5 cartas jogadas
        String[] naipesJogados = new String[INDICE_POKER];

        // função adiciona cartas ao baralho, ao cartasDoBaralho, ao naipesDoBaralho
        adicionarCartas(cartas, naipe, baralho, cartasDoBaralho, naipesDoBaralho);
        
        // embaralharCartas no vetor baralho, cartasDoBaralho e naipesDoBaralho
        embaralharCartas(cartas, naipe, baralho, cartasDoBaralho, naipesDoBaralho);

        recebeCartasJogadas(baralho, poker, cartasDoBaralho, cartasJogadas,
                            naipesDoBaralho, naipesJogados);
        
        System.out.printf("\n%50s\n", "CARTAS DISTRIBUIDAS");
        // exibir poker
        exibirPoker(poker);
        System.out.println();

        processaJogadas(poker, cartasJogadas, naipesJogados);
        flush(naipesJogados);; // 5 carta de naipes iguais

    } // final principal

    // adicionar cartas ao baralho organizado
    public static void adicionarCartas(String[] cartas, String[] naipe, String[] baralho,
                                        String[] cartasDoBaralho, String[] naipesDoBaralho) {

        // loop para inicializar o vetor baralho
        // loop das cartas
        for(int i = 0; i < cartas.length; i++) {
            // loop para os naipes
            for(int j = 0; j < naipe.length; j++) {

                // baralho recebe as cartas e os naipes ordenados
                baralho[naipe.length * i + j] = cartas[i] + " de " + naipe[j];

                // vetor cartasDoBaralho recebe os valores das cartas
                cartasDoBaralho[naipe.length * i + j] = cartas[i];

                // vetor naipesDobaralho recebe os valores dos naipes
                naipesDoBaralho[naipe.length * i + j] = naipe[j];

            } // final for naipe
        } // final for cartas

    } // final adicionar

    // Embaralharcartas
    public static void embaralharCartas(String[] cartas, String[] naipe, String[] baralho,
                                        String[] cartasDoBaralho, String[] naipesDoBaralho) {

        // cria o objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

        // loop para percorrer o vetor
        for(int i = 0; i < baralho.length; i++) {

            // cria constante índice igual ao SIZE do baralho
            final int INDICE = aleatorio.nextInt(baralho.length);

            // cria variável teporaria
            // embaralhado o baralho
            String temp = baralho[INDICE];
            baralho[INDICE] = baralho[i];
            baralho[i] = temp;

            // embaralhado as cartas;
            // pegando os valores e individualizando
            // confore a posição no naralho
            String tpCartas = cartasDoBaralho[INDICE];
            cartasDoBaralho[INDICE] = cartasDoBaralho[i];
            cartasDoBaralho[i] = tpCartas;

            // embaralhado o naipe;
            // individualizando confore a posição no baralho
            String tpNaipes = naipesDoBaralho[INDICE];
            naipesDoBaralho[INDICE] = naipesDoBaralho[i];
            naipesDoBaralho[i] = tpNaipes;

        } // final for i

    } // final EmbaralharCartas

    // recebe cartas do poker
    public static void recebeCartasJogadas(String[] baralho, String[] poker,
                                            String[] cartasDoBaralho, String[] cartasJogadas,
                                            String[] naipesDoBaralho, String[] naipesJogados) {

        /* loop para adicionar os valores das 
        5 prieiras cartas do baralho aos vetores
        poker, cartasJogadas e naipesJogados */
        for(int i = 0; i < poker.length; i++) {

            // poker recebe as 5 prieiras cartas do baralho
            poker[i] = baralho[i];
            
            // cartasJogadas recebe as 5 prieiras cartas do baralho
            cartasJogadas[i] = cartasDoBaralho[i];
            
            // naipesJogados recebe os 5 prieiros naipes distribuidos no baralho
            naipesJogados[i] = naipesDoBaralho[i];
        
        } // final for i

    } // final recebe cartas jogadas

    // Exibir cartas do poker
    public static void exibirPoker(String[] poker) {

        // loop for para exibir as 5 cartas do poker
        for(int i = 0; i < poker.length; i++) {
            // exibe as cartas
            System.out.printf("%-20s", poker[i]);
        } // final for i

    } // final exibirPoker

    // função processa jogadas
    public static void processaJogadas(String[] poker, String[] cartasJogadas, String[] naipesJogados) {

        flush(naipesJogados);
        fullHouse(cartasJogadas);
        straight(cartasJogadas);
        quadra(cartasJogadas);
        trinca(cartasJogadas);
        doisPares(cartasJogadas);
        umPar(cartasJogadas);

    } // final processaJogadas

    // full house verifica se existe uma trinca e umPar
    public static void fullHouse(String[] cartasJogadas) {
        
        if(cartasJogadas[0] == cartasJogadas[1] && cartasJogadas[1] == cartasJogadas[2] && // 0 = 1 = 2 & 3 = 4
            cartasJogadas[3] == cartasJogadas[4] ||
            cartasJogadas[0] == cartasJogadas[1] && cartasJogadas[1] == cartasJogadas[3] && // 0 = 1 = 3 & 2 = 4
            cartasJogadas[2] == cartasJogadas[4] ||
            cartasJogadas[0] == cartasJogadas[1] && cartasJogadas[1] == cartasJogadas[4] && // 0 = 1 = 4 & 2 = 3
            cartasJogadas[2] == cartasJogadas[3] ||
            cartasJogadas[0] == cartasJogadas[2] && cartasJogadas[2] == cartasJogadas[3] &&  // 0 = 2 = 3 & 1 = 4
            cartasJogadas[1] == cartasJogadas[4] ||
            cartasJogadas[1] == cartasJogadas[2] && cartasJogadas[3] == cartasJogadas[4] && // 1 = 2 = 3 & 0 = 4
            cartasJogadas[4] == cartasJogadas[0] ||
            cartasJogadas[1] == cartasJogadas[3] && cartasJogadas[3] == cartasJogadas[4] && // 1 = 3 = 4 & 0 = 2
            cartasJogadas[0] == cartasJogadas[2] ||
            cartasJogadas[1] == cartasJogadas[4] && cartasJogadas[2] == cartasJogadas[3] && // 1 = 4 = 0 & 2 = 3
            cartasJogadas[3] == cartasJogadas[0]) 
            {
                System.out.println("\nFull house");
            } // final if
             
    } // final fullHouse

    // fluch verifica se existe 5 cartas de naipes iguais
    public static void flush(String[] naipesJogados) {

        if(naipesJogados[0] == naipesJogados[1] && naipesJogados[1] == naipesJogados[2] &&
            naipesJogados[2] == naipesJogados[3] && naipesJogados[3] == naipesJogados[4])
        {
            System.out.printf("Flush de %5s", naipesJogados[0]);
        }  // final if

    } // final flush

    // straight verifica se te 5 cartas de valores consecutivos
    public static void straight(String[] cartasJogadas) {

        if(cartasJogadas[0] == "As" && cartasJogadas[1] == "2" && cartasJogadas[2] == "3" &&
           cartasJogadas[3] == "4" && cartasJogadas[4] == "5" ||
           cartasJogadas[0] == "2" && cartasJogadas[1] == "3" && cartasJogadas[2] == "4" &&
           cartasJogadas[3] == "5" && cartasJogadas[4] == "6" ||
           cartasJogadas[0] == "3" && cartasJogadas[1] == "4" && cartasJogadas[2] == "5" &&
           cartasJogadas[3] == "6" && cartasJogadas[4] == "7" ||
           cartasJogadas[0] == "4" && cartasJogadas[1] == "5" && cartasJogadas[2] == "6" &&
           cartasJogadas[3] == "7" && cartasJogadas[4] == "8")
        {
            System.out.printf("Straigt");
        } // final  if

    } // final straight

    // quadra verifica se existe 4 cartas iguais
    public static void quadra(String[] cartasJogadas) {

        // 0, 1, 2, 3 ou 1, 2, 3, 4
        if(cartasJogadas[0] == cartasJogadas[1] && cartasJogadas[1] == cartasJogadas[2] && // 0, 1, 2, 3
           cartasJogadas[2] == cartasJogadas[3] ||
           cartasJogadas[0] == cartasJogadas[1] && cartasJogadas[1] == cartasJogadas[2] && // 0, 1, 2, 4
           cartasJogadas[2] == cartasJogadas[4] ||
           cartasJogadas[0] == cartasJogadas[1] && cartasJogadas[1] == cartasJogadas[3] && // 0, 1, 3, 4
           cartasJogadas[3] == cartasJogadas[4] ||
           cartasJogadas[0] == cartasJogadas[2] && cartasJogadas[2] == cartasJogadas[3] && // 0, 2, 3, 4
           cartasJogadas[3] == cartasJogadas[4] ||
           cartasJogadas[1] == cartasJogadas[2] && cartasJogadas[2] == cartasJogadas[3] && // 1, 2, 3, 4
           cartasJogadas[3] == cartasJogadas[4] ) 
           {
                // exibe
                System.out.printf("Quadra\n");
           }// final if

    } // final quadra

    // trinca verifica se existe 3 cartas iguais
    public static void trinca(String[] cartasJogadas) {

            // condições para verificar se exixte 3 cartas iguais
            // 0, 1, 2, 3, 4
            if(cartasJogadas[0] == cartasJogadas[1] && cartasJogadas[1] == cartasJogadas[2] || // 0,1,2
               cartasJogadas[0] == cartasJogadas[1] && cartasJogadas[1] == cartasJogadas[3] || // 0,1,3
               cartasJogadas[0] == cartasJogadas[1] && cartasJogadas[1] == cartasJogadas[4] || // 0,1,4
               cartasJogadas[0] == cartasJogadas[2] && cartasJogadas[2] == cartasJogadas[3] || // 0,2,3
               cartasJogadas[0] == cartasJogadas[2] && cartasJogadas[2] == cartasJogadas[4] || // 0,2,4
               cartasJogadas[0] == cartasJogadas[3] && cartasJogadas[3] == cartasJogadas[4] || // 0,3,4
               cartasJogadas[1] == cartasJogadas[2] && cartasJogadas[2] == cartasJogadas[3] || // 1,2,3
               cartasJogadas[1] == cartasJogadas[3] && cartasJogadas[3] == cartasJogadas[4] || // 1,3,4
               cartasJogadas[2] == cartasJogadas[3] && cartasJogadas[3] == cartasJogadas[4] )  // 2,3,4 
               { 
                    // exibe
                    System.out.printf("Trinca\n");
                    // break;
               } // fim if

    } // trinca

    // dois pares verifica se existe 2 pares diferente de cartas
    public static void doisPares(String[] cartasJogadas) {

            // condições ( 0, 1, 2, 3, 4 )
            if(cartasJogadas[0] == cartasJogadas[1] && cartasJogadas[2] == cartasJogadas[3] || //0,1 - 2,3
               cartasJogadas[0] == cartasJogadas[1] && cartasJogadas[2] == cartasJogadas[4] || //0,1 - 2,4
               cartasJogadas[0] == cartasJogadas[2] && cartasJogadas[1] == cartasJogadas[3] || //0,2 - 1,3
               cartasJogadas[0] == cartasJogadas[2] && cartasJogadas[1] == cartasJogadas[4] || //0,2 - 1,4
               cartasJogadas[0] == cartasJogadas[3] && cartasJogadas[1] == cartasJogadas[2] || //0,3 - 1,2
               cartasJogadas[0] == cartasJogadas[3] && cartasJogadas[1] == cartasJogadas[4] || //0,3 - 1,4
               cartasJogadas[0] == cartasJogadas[4] && cartasJogadas[1] == cartasJogadas[2] || //0,4 - 1,2
               cartasJogadas[0] == cartasJogadas[4] && cartasJogadas[1] == cartasJogadas[3] || //0,4 - 1,3
               cartasJogadas[0] == cartasJogadas[1] && cartasJogadas[1] == cartasJogadas[3] || //0,1 - 1,3
               cartasJogadas[1] == cartasJogadas[2] && cartasJogadas[3] == cartasJogadas[4] || //1,2 - 3,4
               cartasJogadas[2] == cartasJogadas[3] && cartasJogadas[1] == cartasJogadas[4] )  //2,3 - 1,4
               {
                    // exibe
                    System.out.printf("Dois pares\n");
                    
               } // final if

    } // final doisPares

    // umPar verifica se te 1 par de cartas iguais
    public static void umPar(String[] cartasJogadas) {

        if(cartasJogadas[0] == cartasJogadas[1] || 
           cartasJogadas[0] == cartasJogadas[2] ||
           cartasJogadas[0] == cartasJogadas[3] ||
           cartasJogadas[0] == cartasJogadas[4]) { 
                System.out.printf("Possui Um par -> %-5s = %5s", cartasJogadas[0], cartasJogadas[0]);    
        } // fim if 
        else if(cartasJogadas[1] == cartasJogadas[2] || 
                cartasJogadas[1] == cartasJogadas[3] ||
                cartasJogadas[1] == cartasJogadas[4]) {
                    System.out.printf("Possui Um par -> %-5s = %5s", cartasJogadas[1], cartasJogadas[1]);
        } // fim else if
        else if(cartasJogadas[2] == cartasJogadas[3] || 
                cartasJogadas[2] == cartasJogadas[4] ) {
                    System.out.printf("Possui Um par -> %-5s = %5s", cartasJogadas[2], cartasJogadas[2]);
        } // fim else if
        else if(cartasJogadas[3] == cartasJogadas[4]) {
            System.out.printf("Possui Um par -> %-5s = %5s", cartasJogadas[3], cartasJogadas[4]);
        } // final else if

        System.out.println();

    } // final umPar

    // Exibir cartas
    public static void exibirCartas(String[] baralho) {

        // loop para exibir as cartas do baralho
        for(int i = 0; i < baralho.length; i++) {
            
            if(i % 4  == 0)
                // pula linha
                System.out.println();

            // exibe as cartas do baralho
            System.out.printf("%19s", baralho[i]);
            
        } // final for i

    } // final exibirCartas

} // final classe