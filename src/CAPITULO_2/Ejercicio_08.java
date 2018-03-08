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
public class Ejercicio_08 {
    public static void main(String[] args) {
        new Ejercicio_08().go();
    }
    void go(){
        new Hound().bark();
        ((Dog)new Hound()).bark();
        //((Dog)new Hound()).sniff();   Se hace un Upcast donde Dog no tiene el método sniff()
    }
}

class Dog{
    public void bark(){
        System.out.println("woof ");
    }
}
class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff ");
    }
    @Override
    public void bark(){
        System.out.println("howl ");
    }
}