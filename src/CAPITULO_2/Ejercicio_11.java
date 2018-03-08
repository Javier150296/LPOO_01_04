/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPITULO_2;

/**
 *
 * @author JAVIER1
 */
public class Ejercicio_11 extends Alpha { //se extiende directamente de Alpha y no pasa por el otro hijo SubAlpha 
    private Ejercicio_11(){
        s+="subsub ";
    }
    public static void main(String[] args) {
        new Ejercicio_11();
        System.out.println(s); //s tiene acceso default
    }
}

class Alpha{
    static String s=" ";
    protected Alpha(){
        s+="alpha ";
    }
}

class SubAlpha extends Alpha{
    private SubAlpha(){
        s+="sub ";
    }
}