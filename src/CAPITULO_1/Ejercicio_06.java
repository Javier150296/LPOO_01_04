
package CAPITULO_1;

/**
 *
 * @author JAVIER1
 */
public class Ejercicio_06 {
    
}

interface Device{ public void doIt();}

class Electronic implements Device{ //implementación de la interfaz
    @Override
    public void doIt(){}
}

abstract class Phone1 extends Electronic{}

abstract class Phone2 extends Electronic{
    public void doIt(int x){}
}

class Phone3 extends Electronic implements Device{ //Como la clase Electronic ya implementa el método de la interfaz no hay problema
    public void doStuff(){}
}

//No existen errores ya que tanto las implementaciones como las extenciones son correctas