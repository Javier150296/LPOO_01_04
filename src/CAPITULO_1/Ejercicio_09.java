
package CAPITULO_1;

/**
 *
 * @author JAVIER1
 */
public class Ejercicio_09 extends Hobbit {
    public static void main(String[] args) {
        Short myGold=7;
        //System.out.println(countGold(myGold,6)); //a pesar de que el tipo de dato Short encaja automáticamente
        //el método countGold no puede ser invocado en un ambiente estático como lo es el main
    }
}

class Hobbit{
    int countGold(int x, int y){
        return x+y;
    }
}