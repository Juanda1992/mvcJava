/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.modelo;

/**
 *
 * @author 503
 */
public class Modelo {

    //VARIABLES
    private int numero1;
    private int numero2;
    
    //CONSTRUCTOR VACIO
    public Modelo() {
    }
    
    //CONSTRUCTOR
     public Modelo(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
     //ENCAPSULAMIENTO
        public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public int sumar (){
        
        return(this.numero1 + this.numero2);
    }

}
