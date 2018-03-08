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
public class Ejercicio_15 {
    static String s = "-";
    public static void main(String[] args) {
        A[] aa = new A[2];
        B[] bb = new B[2];
        
        sifter(aa); //el argumento es un arreglo de tipo A
        sifter(bb); //el argumento es un arreglo de tipo B
        sifter(7); // el argumento es un objeto
        System.out.println(s);
    }
    
    static void sifter(A[]... a2){ s += "1"; } //recibe varios arreglos de tipo A
    static void sifter(B[]... b1){ s += "2"; } //recibe varios arreglos de tipo B
    static void sifter(B[] b1){ s += "3"; } //recibe un arreglo de tipo B
    static void sifter(Object o) { s += "4"; } //recibe un objeto
}

class A{ }

class B extends A{ }
