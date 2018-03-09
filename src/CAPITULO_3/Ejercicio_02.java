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
public class Ejercicio_02 {
    public static void main(String[] args) {
        //System.out.println(new Alien().invade(7)); Error en el argumento invade porque no está casteado a short
    }
}

class Alien{
    String invade(short ships){
        return "a few";
    }
    String invade(short ... ships){
        return "many";
    }
}