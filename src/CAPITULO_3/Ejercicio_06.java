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
public class Ejercicio_06 {
    
}

class Bird{
    {System.out.println("b1 ");}
    public Bird(){System.out.println("b2 ");
}}

class Raptor extends Bird{
    static {System.out.println("r1 ");}
    public Raptor(){
        System.out.println("r2 ");
    }
{System.out.println("r3 ");}
static {System.out.println("r4 ");}
}
class Hawk extends Raptor{
    public static void main(String[] args) {
        System.out.println("pre ");
        new Hawk();
        System.out.println("hawk ");
    }
}