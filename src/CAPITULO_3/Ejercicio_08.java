/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPITULO_3;

/**
 *
 * @author JAVIER1
 */
public class Ejercicio_08 {
    static int ouch=7;
    public static void main(String[] args) {
        new Ejercicio_08().go(ouch);
        System.out.println(" "+ouch);
    }
    void go(int ouch){
        ouch++;
        //for(int ouch=3 ; ouch<6 ; ouch++) //se intenta hacer una variable dentro del for con un nombre igual al recibido por el método y se redeclara
            //;
        System.out.println(" "+ouch);
    }
}
