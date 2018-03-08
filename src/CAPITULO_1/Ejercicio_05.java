
package CAPITULO_1;
import pkgA.Foo;
/**
 *
 * @author JAVIER1
 */
public class Ejercicio_05 {
    public static void main(String[] args) {
        Foo f = new Foo();
        //System.out.println(" "+f.a); //Existe un error al tratar de accesar fuera del paquete ya que 'a' tiene el acceso default 
        //System.out.println(" "+f.b); //No se podrá accesar a 'b' ya que tiene acceso protegido 
        System.out.println(" "+f.c);
    }
}
