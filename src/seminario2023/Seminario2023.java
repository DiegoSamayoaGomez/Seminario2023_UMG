/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminario2023;

import CRUDs.CRUDProducto;
import java.math.BigDecimal;

/**
 *
 * @author Samayoa
 */
public class Seminario2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigDecimal precio = new BigDecimal(10);
        //INSERT
//        System.out.println("Insert = " + CRUDs.CRUDProducto.insert("Consome", 100, precio, 1)); 
//System.out.println("Insert = " + CRUDs.CRUDProducto.insert("Gaseoa", 30, precio, 1)); 

//UPDATE
//System.out.println("update" + CRUDs.CRUDProducto.update(2, "Tortrix", precio, 1)); 

//SELECT
//        for (int i = 0; i < CRUDProducto.universo().size(); i++) {
//            System.out.println("Producto = " + CRUDProducto.universo().get(i).getNombreProducto());
//            System.out.println("Cantidad = " + CRUDProducto.universo().get(i).getCantidad());
//            System.out.println("Precio = " + CRUDProducto.universo().get(i).getPrecio());
//
// 
    
  //}
  
  //Cambiar estado
  
  //System.out.println("anular" + CRUDs.CRUDProducto.anular(2, 1));
  
  //Eliminar
  //System.out.println("Eliminar = " + CRUDs.CRUDProducto.eliminar(3, 1));
  
  //Select especifico
        System.out.println("Nombre = " + CRUDs.CRUDProducto.select(2).getNombreProducto());
  
    }

}
