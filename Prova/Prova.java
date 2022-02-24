/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

/**
 *
 * @author Paolo
 */
public class Prova {
    public static void stampa(OggettoPrint o){
        System.out.print("Stampo dal main: ");
        o.stampa();
    }   

    public static void main(String[] args){
        Oggetto o = new Oggetto();
        o.stampa();
        stampa(o);
        stampa(()->{System.out.println("Ciao da LAMBDA");});
        OggettoPrint op = ()-> System.out.println("Ciao da OP");
        op.stampa();
        //se ho un solo parametro in ingresso posso evitare di usare le ()
        OggettoPrint2 op2 = suffisso -> {
            System.out.println("Ciao da OP " + suffisso);
            System.out.println(suffisso);
        };
        op2.stampa("SUFFISSO");
    }
}


