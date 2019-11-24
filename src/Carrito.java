/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melissa
 */
public class Carrito {
     private int cuentaTotal = 0;
     private double precio=0;
    
    
    public Carrito() {
        cuentaTotal = 0;
        this.precio=6800; //precio provisional
    }
    
    
    public void añadirPrecio(int precio){
        cuentaTotal += precio;
    }
    
    public int getCuenta(){
        return cuentaTotal;
    }
}
