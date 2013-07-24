/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Dario
 */
//Clase padre, clase abstracta que define el numero de lados y los metodos abstractos para obtener el Area y el perimetro
public abstract class Poligono {

    
    int nLados;
    
    //Constructor
    public Poligono(int nLados){
        this.nLados=nLados;
    }

    
    //get y set para la variable nLados
    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }
    
    
    //Metodos abstractos
    public abstract float getArea();
    public abstract float getPerimetro();
    
}
