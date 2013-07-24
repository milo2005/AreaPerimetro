/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Dario

*/

//clase Rectangulo, hereda de Poligono
public class Rectangulo extends Poligono{

    int ladoA, ladoB;

    //Constructor
    public Rectangulo(int ladoA, int ladoB) {
        //Invocamos el constructor del padre (Clase Poligono)
        super(4);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    
//    Funciones get y set para ladoA y ladoB
    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    
    
    //Metodo para obtener el Area
    @Override
    public float getArea() {
        return ladoA*ladoB;
    }

    //Metodo para obtener el perimetro
    @Override
    public float getPerimetro() {
        return (2*ladoA)+(2*ladoB);
    }
    
}
