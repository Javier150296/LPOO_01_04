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
public class Ejercicio_13 {
    public static void main(String[] args) {
        new Ejercicio_13().go();
    }
    
    void go(){
        Mamma1 m = new Zebra();
        System.out.println(m.name+m.makeNoise()); //aplica el polimorfiso sólo en el método de instancia 
    }
}

class Mamma1{
    String name = "furry ";
    String makeNoise(){
        return "generic noise";
    }
}

class Zebra extends Mamma1{
    String name = "stripes ";
    @Override
    String makeNoise(){
        return "bray ";
    }
}