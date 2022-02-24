/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;


import java.util.ArrayList;

/**
 *
 * @author Paolo
 */
public class Lambda{

    public static void prova(){
       ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0; i< 100; i++)
            ls.add((int) (Math.random() * 1000));
        Media media = (a)-> {
            int m = 0;
            for(int i = 0; i< a.size(); i++)
                m+=a.get(i);
            System.out.println("SOMMA "+m);
            return m/a.size();
        };        
        
        System.out.println("Media di ls è "+media.media(ls));
            
            
        double[] lati = {4,6,7,0};
        Forma triangolo = (double[] lati1) -> {
            for (int i = 0; i < lati1.length - 1; i++) {
                lati1[lati1.length - 1] = lati1[lati1.length - 1] + lati1[i];
            }
            return lati1[lati1.length - 1];
        }; 

        System.out.println("Perimetro "+triangolo.calcolaPerimetro(lati));
        Concatena p = (char[] nome) -> {  
            String c="";
            for (int i = 0; i < nome.length; i++) {
                c = c+nome[i];
            }
            return c;
        };
        char[] a = {'1','a','d','4','t'};
        System.out.println("esperssione "+ p.c(a));        
    }
    
    public static void main(String[] args) {
        prova();
    }
}