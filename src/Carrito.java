/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melissa
 */
public class Carrito extends VentaLibro{
     private int cuentaTotal = 0;
    
    
    public Carrito() {
        super();
        cuentaTotal = 0;
    }
    
   
    public void añadirPrecio(int precio){
        cuentaTotal += precio;
    }
    
    public int getCuenta(){
        return cuentaTotal;
    }
}
