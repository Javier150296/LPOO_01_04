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
public class Ejercicio_04 {
    public static void main(String[] args) {
        Mixer m2 =new Mixer(); //utiliza al constructor por default, por lo tanto m1 no es inicializada
        Mixer m3 = new Mixer(m2);
        m3.go();
        Mixer m4=m3.m1;
        m4.go();
        Mixer m5 = m2.m1;
        m5.go();
    }
}

class Mixer{
    Mixer(){
        
    }
    Mixer (Mixer m){
        m1=m;
    }
    Mixer m1;
    
    void go(){
        System.out.println("hi ");
    }
}