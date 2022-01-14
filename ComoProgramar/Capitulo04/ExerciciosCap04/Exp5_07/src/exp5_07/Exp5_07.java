/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5_07;

/**
 *  Você foi contratado por uma companhia de seguros de automóvel que atende estes estados do nordeste dos Estados 
Unidos — Connecticut, Maine, Massachusetts, New Hampshire, Nova Jersey, Nova York, Pensilvânia, Rhode Island 
e Vermont. A empresa quer que você crie um programa que produz um relatório indicando para cada uma das 
apólices de seguro de automóvel se a apólice é válida em um estado com seguro de automóvel “sem culpa” (modalidade 
de seguro em que o segurado é indenizado independentemente de sua responsabilidade no sinistro) — Massachusetts, 
Nova Jersey, Nova York e Pensilvânia.
 * @author 14/01/2022
 */
public class Exp5_07 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //  cria os objetos da classe seguro auto
        SeguroAuto apolice1 = new SeguroAuto(11111111, "Toyota Camry", "NJ" );
        SeguroAuto apolice2 = new SeguroAuto(22222222, "Ford Fusion", "ME" );

        // exibe se cada apólice está em um estado “sem culpa”
        policyInNoFaultState(apolice1);
        policyInNoFaultState(apolice2);
        } 

        // método que mostra se um AutoPolicy 
        // está em um estado com seguro de automóvel “sem culpa” 
        public static void policyInNoFaultState( SeguroAuto apolice)
        {
            System.out.println("Apólice Seguro de Auto:");
            System.out.printf(
            "Conta #: %d; %nCarro: %s; %nEstado %s a no-fault state%n%n", 
            apolice.getNumeroDaConta(), 
            apolice.getModeloDoCarro(),
            apolice.getEstado(),
            apolice.isNoFaultState() ? "é " : "não é ");
        } // fim função
        
} // fim classe
