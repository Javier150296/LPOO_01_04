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
public class Ejercicio_09 {
    static String s="";
    public static void main(String[] args) {
        int x=4;
        Boolean y=true;
        short[] sa={1,2,3};
        doStuff(x,y);
        doStuff(x);
        doStuff(sa,sa);
        System.out.println(s);
    }
    static void doStuff(Object o){s+="1";} //doStuff(x); x como Integer
    static void doStuff(Object... o){s+="2";} //doStuff(x,y); doStuff(sa,sa);
    static void doStuff(Integer... i){s+="3";}
    static void doStuff(Long L){s+="4";}
}