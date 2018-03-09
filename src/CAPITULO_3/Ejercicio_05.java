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
public class Ejercicio_05 {
    int x=5;
    public static void main(String[] args) {
        final Ejercicio_05 f1 =new Ejercicio_05(); //f1 es final no puede ser referenciada a un objeto diferente
        Ejercicio_05 f2 = new Ejercicio_05(); //se hace instancia de un nuevo objeto f2
        Ejercicio_05 f3 = Switch(f1,f2); //f3 tendrá la referencia de f1
        System.out.println((f1==f3)+" "+(f1.x==f3.x));
    }
    
    static Ejercicio_05 Switch(Ejercicio_05 x, Ejercicio_05 y){
        final Ejercicio_05 z=x; //z hace referencia a x que se pasó la referencia de f1
        z.x=6;
        return z;
    }
}

