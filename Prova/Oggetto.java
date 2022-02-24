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
public class Oggetto implements OggettoPrint, OggettoPrint2{

    @Override
    public void stampa() {
        System.out.println("Ciao Mondo");
    }

    @Override
    public void stampa(String suffisso) {
        System.out.println("Ciao Mondo "+suffisso);
    }
}
