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
public class Ejercicio_13 {
    int x=3;
    
    public static void main(String[] args) {
        new Ejercicio_13().go1();
    }
    
    void go1(){
        int x;
        //go2(++x); //no est;a inicializada la x con un valor
    }
    
    void go2(int y){
        int x=++y;
        System.out.println(x);
    }
}

