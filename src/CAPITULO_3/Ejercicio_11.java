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
public class Ejercicio_11 {
    public static void main(String[] args) {
        Beta b1 = new Beta();
        Beta b2 = new Beta();
        Alpha a1 = new Alpha();
        Alpha a2 = new Alpha();
        
        a1.b1=b1;
        a1.b2=b1;
        a2.b2=b2;
        a1=null;
        b1=null;
        b2=null;
        
    }
}

class Beta{}
class Alpha{
    static Beta b1; //se tiene acceso a la variable estatica 
    Beta b2;
}
