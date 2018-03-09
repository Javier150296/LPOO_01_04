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
public class Ejercicio_03 {
    public static void main(String[] args) {
        int [][] a={{1,2},{3,4}};
        int []b= (int[]) a[1];
        Object o1 =a;
        int [][] a2 = (int [][])o1;
        int [] b2 = (int [])o1; //el objeto o1 está referenciando a 'a' y éste es de tipo int[][], por lo tanto al intentar el downcast no funciona
        System.out.println(b[1]);
    }
}
