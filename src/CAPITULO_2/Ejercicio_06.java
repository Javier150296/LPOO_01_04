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
public class Ejercicio_06 {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        
        //x2.do2();  no hay casteo y x2 es referido a un objeto de clase X por lo tanto no puede hacer el método de su hijo
        //(Y)x2.do2();  incorrecta sintaxis de casteo para acceder al método
        ((Y)x2).do2();
        
    }
}
class X { void do1(){} }
class Y extends X {void do2(){} }
