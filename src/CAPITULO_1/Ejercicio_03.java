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
public class Ejercicio_03 {
    public static void main(String[] args) {
        doStuff(1);
        doStuff(1,2);
    }
    static void doStuff(int... doArgs){} //Sí es válida la sintaxis para usar la variable de argumentos
    //static void doStuff(int[] doArgs){} Inválido ya que en los parámetros espera un arreglo de enteros 
    //static void doStuff(int doArgs...){} Error en la sintaxis para la variable de argumentos
    //static void doStuff(int... doArgs, int y){} La variable de argumentos debe ser la última en la lista de parámetros
    //static void doStuff(int x, int... doArgs){} //Sí es valida la sintaxis para usar la variable de argumentos
}
