/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Dario
 */
//Clase Hexagono, hereda de Poligono
public class Hexagono extends Poligono{

    int lado;

    //Constructor
    public Hexagono(int lado) {
        //Invocamos el constructor del padre (Clase poligono)
        super(6);
        this.lado = lado;
    }

    //funciones get y set para lado
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    
    //Metodo para obtener el Apotenma
    ////    _____________________
    /////  /    2             2
    ///  \/ lado    -  (lado/2)  
    public float getApotema(){
        int ladoC= lado*lado;
        return  (float) Math.sqrt(ladoC-(ladoC/4));
    }
    
//    Metodo para calcular el area
    @Override
    public float getArea() {
        return getApotema()*getPerimetro()/2;
    }

//    Metodo para calcular el perimetro
    @Override
    public float getPerimetro() {
       return getnLados()*lado;
    }
    
}
