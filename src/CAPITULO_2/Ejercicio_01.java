
package CAPITULO_2;
import pkgA.Frobnicate;
/**
 *
 * @author JAVIER1
 */
public class Ejercicio_01 {
    
}
/*abstract class Frob implements Frobnicate{
    //public abstract void twiddle(String s){} //Un método abstracto no debe de tener cuerpo, solo debe ser declarado
}*/

//abstract class Frob implements Frobnicate{}

/*class Frob extends Frobnicate{ //Las clases implementan interfaces no las extienden
    public void twiddle(Integer i){} 
}*/
/*class Frob implements Frobnicate{
    public void twiddle(Integer i){} //Intenta sobrecargarlo, pero no lo implementa en ningun momento
}*/
class Frob implements Frobnicate{
    @Override
    public void twiddle(String i){} //implementa
    public void twiddle(Integer i){} //sobrecarga
}