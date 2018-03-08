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
public class Ejercicio_09 extends Tree {
    public static void main(String[] args) {
        new Ejercicio_09().go();
    }
    
    void go(){
        go2(new Tree(), new Ejercicio_09());
        //go2((Ejercicio_09) new Tree(), new Ejercicio_09()); Existe un error al hacer downcast de un objeto tipo Tree a su hijo, cuando en el método se espera un argumento de tipo Tree
    }
    void go2(Tree t1, Ejercicio_09 r1){
        Ejercicio_09 r2 = (Ejercicio_09)t1;
        Tree t2 = (Tree)r1;
    }
}

class Tree{}