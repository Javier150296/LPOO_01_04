/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAPITULO_1;

/**
 *
 * @author JAVIER1
 */
public class Ejercicio_08 {
    public enum Days{MON,TUE,WED};
    public static void main(String[] args) {
        for(Days d: Days.values())
            ; //no hace nada
        Days[] d2=Days.values(); //el método values() regresa un arreglo de los valores del enum 
        System.out.println(d2[2]); //el resultado es:   WED
    }
}
