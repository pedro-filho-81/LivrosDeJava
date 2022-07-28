import java.security.SecureRandom;

public class PokerDoisJogadores31 {
    /**
     * 7.31 (Embaralhamento e distribuição de carta) Utilize os métodos 
     * desenvolvidos na Questão 7.30 para escrever um aplicativo que distribui 
     * duas mãos de pôquer de cinco cartas, avalia cada mão e determina qual é a melhor
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
        
        // declara e cria os vetores para os jogadores
        String[] jogador1 = new String[INDICE_POKER];
        // vetor recebe os valores das 5 cartas jogadas
        String[] cartasJogadas1 = new String[INDICE_POKER];
        // vetor recebe os naipes das 5 cartas jogadas
        String[] naipesJogados1 = new String[INDICE_POKER];

        String[] jogador2 = new String[INDICE_POKER];
        // vetor recebe os valores das 5 cartas jogadas
        String[] cartasJogadas2 = new String[INDICE_POKER];
        // vetor recebe os naipes das 5 cartas jogadas
        String[] naipesJogados2 = new String[INDICE_POKER];

        // função adiciona cartas ao baralho, ao cartasDoBaralho, ao naipesDoBaralho
        adicionarCartas(cartas, naipe, baralho, cartasDoBaralho, naipesDoBaralho);
        
        // embaralharCartas no vetor baralho, cartasDoBaralho e naipesDoBaralho
        embaralharCartas(cartas, naipe, baralho, cartasDoBaralho, naipesDoBaralho);

        recebeCartasJogadas(baralho, jogador1, jogador2, cartasDoBaralho, cartasJogadas1,
                            naipesDoBaralho, naipesJogados1, cartasJogadas2, naipesJogados2);
        
        System.out.printf("\n%50s\n", "JOGADOR1 CARTAS DISTRIBUIDAS");
        // exibir poker
        exibirPoker(jogador1);
        System.out.println();

        System.out.printf("\n%50s\n", "JOGADOR2 CARTAS DISTRIBUIDAS");
        // exibir poker
        exibirPoker(jogador2);
        System.out.println();

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
    public static void recebeCartasJogadas(String[] baralho, String[] jogador1, String[] jogador2,
                                            String[] cartasDoBaralho, String[] cartasJogadas1,
                                            String[] naipesDoBaralho, String[] naipesJogados1,
                                            String[] cartasJogadas2, String[] naipesJogados2) {

        // variável contador
        int contador = 0;
        int contador2 = 0;

        /* loop para adicionar os valores das 
        5 prieiras cartas do baralho aos vetores
        poker, cartasJogadas e naipesJogados */
        for(int i = 0; i < 10; i++) {

            if(i < 5) { 
            // jogador1 recebe as 5 prieiras cartas do baralho
            jogador1[contador] = baralho[i];            
            // cartasJogadas recebe as 5 prieiras cartas do baralho
            cartasJogadas1[contador] = cartasDoBaralho[i];
            // naipesJogados recebe os 5 prieiros naipes distribuidos no baralho
            naipesJogados1[contador] = naipesDoBaralho[i];
    
            contador++; // increenta contador e 1

            } // final if < 5
            else if(i >= 5 && i < 10) {
                jogador2[contador2] = baralho[i];
                cartasJogadas2[contador2] = cartasDoBaralho[i];
                naipesJogados2[contador2] = naipesDoBaralho[i];
                contador2++;
            } // final 
            
        } // final for i
    
    } // final recebe cartas jogadas

    // Exibir cartas do poker
    public static void exibirPoker(String[] jogador) {

        // loop for para exibir as 5 cartas do poker
        for(int i = 0; i < jogador.length; i++) {
                
            // exibe as cartas
            System.out.printf("%-20s", jogador[i]);

        } // final for i

    } // final exibirPoker

    // função processa jogadas
    public static void verificandoJogadas(String[] cartasJogadas1, String[] naipesJogados1,
                                            String[] cartasJogadas2, String[] naipesJogados2) {

                                                
    } // final processaJogadas

    // full house verifica se existe uma trinca e umPar
    public static String fullHouse(String[] cartasJogadas) {
        
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

            return "1"; // te valor 1

    } // final fullHouse

    // fluch verifica se existe 5 cartas de naipes iguais
    public static String flush(String[] naipesJogados) {

        if(naipesJogados[0] == naipesJogados[1] && naipesJogados[1] == naipesJogados[2] &&
            naipesJogados[2] == naipesJogados[3] && naipesJogados[3] == naipesJogados[4])
        {
            System.out.printf("Flush de %5s", naipesJogados[0]);
        }  // final if

        return "3"; // valor 3

    } // final flush

    // straight verifica se te 5 cartas de valores consecutivos
    public static String straight(String[] cartasJogadas) {

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

        return "2"; // valor 2

    } // final straight

    // quadra verifica se existe 4 cartas iguais
    public static String quadra(String[] cartasJogadas) {

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

           return "4";

    } // final quadra

    // trinca verifica se existe 3 cartas iguais
    public static String trinca(String[] cartasJogadas) {

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

               return "5";

    } // trinca

    // dois pares verifica se existe 2 pares diferente de cartas
    public static String doisPares(String[] cartasJogadas) {

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

               return "6";

    } // final doisPares

    // umPar verifica se te 1 par de cartas iguais
    public static String umPar(String[] cartasJogadas) {

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
        
        return "7"; 

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