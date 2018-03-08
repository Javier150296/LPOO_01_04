/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPITULO_2;

/**
 *
 * @author JAVIER1
 */
public class Ejercicio_10 extends Singer {
    public static String sing(){return "fa";}
    public static void main(String[] args) {
        Ejercicio_10 t=new Ejercicio_10();
        Singer s =new Ejercicio_10();
        System.out.println(t.sing()+" "+s.sing());
    }
}

class Singer{
    public static String sing(){return "la";}
}

//El resultado arrojado es: fa la