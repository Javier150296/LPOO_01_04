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
public class Ejercicio_07 {
    public enum Suits{
            CLUBS(20), DIAMONDS(20),HEARTS(30),SPADES(30),
            NOTRUMP(40){
                public int getValue(int bid){ //se sobrecarga el método
                    return ((bid-1)*30)+40;
                }
            };
            Suits(int points){
                this.points=points;
            }
            private int points;
            public int getValue(int bid){
                return points*bid;
            }
    }
    public static void main(String[] args) {
        System.out.println(Suits.NOTRUMP.getValue(3));
        System.out.println(Suits.SPADES+" "+Suits.SPADES.points);
        System.out.println(Suits.values());
    }
}
