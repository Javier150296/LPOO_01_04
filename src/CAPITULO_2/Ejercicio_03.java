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
public class Ejercicio_03 extends Clidder{
    public final void flipper(){System.out.println("Clidlet");}
    public static void main(String[] args) {
        new Ejercicio_03().flipper();  //accede al método declarado dentro de la misma clase
    }
}

class Clidder{
    private final void flipper(){System.out.println("Clidder");} //El método el privado por lo tanto no será heredado
}