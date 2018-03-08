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
public class Ejercicio_14 {
    public static void main(String[] args) {
        System.out.println("El correcto diseño de un programa donde la clase Foozels son un tipo de Jammers,los Jammers pueden tener Quizels, los Quizels son un tipo de Klakkes y los Floozels pueden tener muchos Floozets es:\n"
                + "import java.util.*;\n"
                + "interface Klakker {};\n"
                + "class Jammer { Set<Quizel> q;}\n"
                + "class Quizel implements Klakker {}\n"
                + "public class Floozel extends Jammer { List<Floozet> f; }\n"
                + "interface Floozet {}\n");
    }
}
