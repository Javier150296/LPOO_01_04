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
public class Ejercicio_12 extends Building{
    Ejercicio_12(){ //el constructor llama al constructor de la superclase 
        System.out.print("h "); 
    }
    Ejercicio_12(String name){ //el constructor se sobrecarga
        this();
        System.out.print("hn "+name);
    }
    public static void main(String[] args) {
        new Ejercicio_12("x ");
    }
}

class Building{
    Building(){
        System.out.print("b ");
    }
    Building(String name){
        this();
        System.out.print("bn "+name);
    }
}