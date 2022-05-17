import java.util.ArrayList;

public class ArrayListCollection17 {

    public static void main(String[] args) {
        
        // cria um array list do tipo String
        ArrayList<String> itens = new ArrayList<String>();

        // adicionando elementos no array list itens com o método add()
        itens.add("vermelho");
        itens.add(0, "amarelo");

        // cabeçalho
        System.out.println("Elementos do array list itens:");

        // loop para exibir os elementos do array list itens
        for( int i = 0; i < itens.size(); i++)
            System.out.printf(" %s", itens.get(i));

        System.out.println();

        // mostra os elementos usando o método display()
        display(itens, "Mostra os elementos do array list itens:");

        // adiciona novos elementos ao aray itens com o método add()
        itens.add("verde");
        itens.add("azul");

        display(itens, "Adicionando as cores verde e azul:itens.add(\"verde\");itens.add(\"azul\");");

        // removendo o elemento amarelo com o método remove()
        itens.remove("amarelo");
        display(itens, "Removendo o elemento amarelo: itens.remove(\"amarelo\");");

        // remove o elemento do índice 1 na lista
        itens.remove(1);
        System.out.printf("Remove o elemento do indice 1: itens.remove(1);");
        // mostra os elementos da lista itens
        display(itens, "\nLista itens sem o elemento do indice 1:");

        // verifica se contêm umm elemento na lista itens com o método contains()
        System.out.printf("verde é um elemento da lista? %s%n",
                            itens.contains("verde") ? " Sim" : " Nao");
    
        System.out.printf("amarelo é um elemento da lista? %s%n",
                           itens.contains("amarelo") ? " Sim" : " Nao");

        // chama o método display()
        display(itens, "Mostra a lista:");

        // mostra o número de elementos na lista com o método size()
        System.out.printf("a lista itens possui %d elementos: itens.size()\n", itens.size());

    } // fim main

    // método display
    public static void display(ArrayList<String> itens, String cabecalho) {

        // imprime o cabeçalho
        System.out.println(cabecalho);

        // loop com for aprimorado para mostra os elementos do array list
        for(String iten : itens)
            // iprimme os elementos do array list
            System.out.printf(" %s", iten);
        //cpula uma linha
        System.out.println();
    } // fim display
} // fim classe