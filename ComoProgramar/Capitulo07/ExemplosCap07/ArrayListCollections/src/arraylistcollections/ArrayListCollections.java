/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistcollections;

import java.util.ArrayList;

/**
 *Declaração da coleção ArrayList<T> genérica
 * 14/02/2022
 */
public class ArrayListCollections {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //   o ArrayList String itens com capacidade para 10 elementos
        ArrayList<String> itens = new ArrayList<String>();
        System.out.println("ArrayList<String> itens = new ArrayList<String>();");
        System.out.println("Cria o array list String itens.");
        
        itens.add("Vermelho"); // adiciona um item a lista
        System.out.printf("\nitens.add(\"Vermelho\"); ->\nadiciona a Strint Vermelho ao array itens:\n");
        
        itens.add(0, "Amarelo"); // adiciona o item amarelo no índice zero
        System.out.printf("\nitens.add(0, \"Amarelo\"); ->\nAdiciona a String Amarelo na posição 0\n");
        
        // cabeçalho
        System.out.print("\nMostra a lista de elementos do Array itens:\n{");
        
        // loop para mostrar os itens da lista
        for( int i = 0; i < itens.size(); i++ ) {
            System.out.printf("  %s", itens.get(i) );
        } // fim for
        System.out.println("  }"); // pula linha  
        
        display(itens, "\nMostra os elementos do Array com o método display:\n" );
        
        itens.add("Verde"); // adiciona a cor verde
        display(itens, "\nitens.add(\"Verde\"); -> Adiciona a String Verde ao array itens\n");
        
        itens.add("Azul"); // adiciona a cor azul
        display(itens, "\nitens.add(\"Azul\"); -> Adiciona a String Azul ao array itens\n");
        
        display(itens, "\nMostra a lista com dois novos elemsntos:\n");       
        
        itens.remove("Amarelo"); // remove o segundo item do array
        display(itens, "\nitens.remove(\"Amarelo\"); -> Remove o elemento Amarelo da lista itens\n");
        
        itens.remove(1); // remove o item que está no índice 1
        display(itens, "\nitens.remove(1); -> Remove o segundo elemento da lista ( verde )\n");
        
        // verifica se o elemento Vermelh se encontra no array
        System.out.printf("\nitens.contains(\"Vermelho\") -> %s%s\n", 
                                    "\nVerifica se a String \" Vermelho \" está no array itens? ",
                                    itens.contains("Vermelho") );        
        
        // exibe o número de elementos do array
        System.out.printf("\nitens.size() -> Mostra quantos elementos tem o array itens:\nTem %s elementos%n", itens.size() );
        
    } // fim main

    // método display
    public static void display( ArrayList<String> itens, String cabecalho ) {

        System.out.print( cabecalho ); // mostra o cabeçalho

        // loop para mostrar os eleentos do array
        for( String item : itens ) {
            System.out.printf(" %s", item );
        } // fim for item    
        System.out.println(); // pula linha

    }    // fim método display

} // fim classe
