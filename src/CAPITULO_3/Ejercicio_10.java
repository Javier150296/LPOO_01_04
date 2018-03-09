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
public class Ejercicio_10 {
    public static void main(String[] args) {
        Dozens [] da=new Dozens[3];
        da[0]=new Dozens();
        Dozens d = new Dozens();
        da[1]=d;
        d=null;
        da[1]=null;
        
    }
}
class Dozens{
    int [] dz={
        1,2,3,4,5,6,7,8,9,10,11,12
    };
}