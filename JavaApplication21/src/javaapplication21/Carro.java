/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author macbookair
 */
public class Carro {
    
    private boolean ligado;

    public Carro(boolean ligado) {
        
        this.ligado = ligado;
    }
    
    public boolean andar(){
        if( ligado )
            return true;
        else 
            return false;
    }

   

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    
    
}
