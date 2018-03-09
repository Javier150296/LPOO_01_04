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
public class Ejercicio_12 {
    public static void main(String[] args) {
        Box b1 = new Box(5);
        Box[] ba= go(b1, new Box(6));
        ba[0] =b1; //ba tendrá {b1, b1}
        for(Box b: ba){
            System.out.print(b.size+" ");
        }
    }
    
    static Box[] go(Box b1, Box b2){
        b1.size=4; //se modifica la evalor de size el objeto b1
        Box[] ma={b2, b1};
        return ma;
    }
}

class Box{
    int size;
    Box(int s){
        size=s;
    }
}

