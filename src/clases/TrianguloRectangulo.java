/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Dario
 */

//Clase TrianguloRectangulo, hereda de la clase poligono
public class TrianguloRectangulo extends Poligono{

    int ladoA, ladoB;

    
    //Constructor
    public TrianguloRectangulo(int ladoA, int ladoB) {
        //Invocamos el constructor del padre (Clase Poligono)
        super(3);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        
    }

    //Funciones get y set para ladoA y ladoB
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

    //Metodo para calcular la hipotenusa
    ////    _____________________
    /////  /     2            2
    ///  \/ ladoA    +  ladoB  
    public float getHipotenusa(){
        int h=(ladoA*ladoA)+(ladoB*ladoB);
        //la Clase Math nos proporciona varias funciones matematicas, entre llas la raiz cuadrada (sqrt)
        float hSqrt=(float) Math.sqrt(h);
        return hSqrt;
    }
    
    //Metodo para obtener el Area
    @Override
    public float getArea() {
       return ladoA*ladoB/2;
    }

    //Metodo para obtener el perimetro
    @Override
    public float getPerimetro() {
       return ladoA+ladoB+getHipotenusa();
    }
    
}
