/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminario2023;

import CRUDs.CRUDCliente;
import CRUDs.CRUDProducto;
import CRUDs.CRUDVentaDetalle;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

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

//        try {
//            for (Iterator it = CRUDVentaDetalle.selectMontoTotal(3).iterator(); it.hasNext();) {
//                BigDecimal item = (BigDecimal) it.next();
//                System.out.println("Monto: " + item);
//
//            }
//
//        } catch (ParseException ex) {
//            Logger.getLogger(Seminario2023.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

//-------PRODUCTOS-------
//INSERT
//System.out.println("Insert = " + CRUDs.CRUDProducto.insert("Consome", 100, precio, 1));
//System.out.println("Insert = " + CRUDs.CRUDProducto.insert("Gaseoa", 30, precio, 1)); 
//UPDATE
//System.out.println("update" + CRUDs.CRUDProducto.update(2, "Tortrix", precio, 1)); 
//SELECT
//        for (int i = 0; i < CRUDProducto.universo().size(); i++) {
//            System.out.println("Producto = " + CRUDProducto.universo().get(i).getNombreProducto());
//            System.out.println("Cantidad = " + CRUDProducto.universo().get(i).getCantidad());
//            System.out.println("Precio = " + CRUDProducto.universo().get(i).getPrecio());
//
// }
//CAMBIAR ESTADO
//System.out.println("anular" + CRUDs.CRUDProducto.anular(2, 1));
//DELETE
//System.out.println("Eliminar = " + CRUDs.CRUDProducto.eliminar(3, 1));
//SELECT ESPECÍFICO
//System.out.println("Nombre = " + CRUDs.CRUDProducto.select(2).getNombreProducto());
//-------CLIENTES-------
//INSERT
//System.out.println("Insert = " + CRUDs.CRUDCliente.insert("Diego", "Alejandro", "Samayoa", "Gomez", "12345679", "Ciudad", "12345678", 1));
//System.out.println("Insert = " + CRUDs.CRUDCliente.insert("Daniel", "Emilio", "Samayoa", "Gomez", "987654321", "Cambote", "987654321", 1));
//System.out.println("Insert = " + CRUDs.CRUDCliente.insert("Daniel", "Emilio", "Samayoa", "Gomez", "987654321", "Cambote", "987654321", 1)); //USADO PARA PROBAR DELETE
//UPDATE
//System.out.println("Update = " + CRUDs.CRUDCliente.update(1, "Homero", "Ferlandy", "Samayoa", "Sutuc", "654321", "Cambote", "98765412", 1));
//SELECT
//        for (int i = 0; i < CRUDCliente.universo().size(); i++) {
//            System.out.println("Producto = " + CRUDCliente.universo().get(i).getNombre1());
//            System.out.println("Producto = " + CRUDCliente.universo().get(i).getApellido1());
//            System.out.println("Producto = " + CRUDCliente.universo().get(i).getNit());
//
//        }
//SELECT ESPECÍFICO
//System.out.println("Nombre = "+ CRUDs.CRUDCliente.select(1).getNombre1());
//System.out.println("Apellido = "+ CRUDs.CRUDCliente.select(1).getApellido1());
//CAMBIAR ESTADO
//System.out.println("Anular = " + CRUDs.CRUDCliente.anular(2, 1));
//DELETE
//System.out.println("Eliminar = " + CRUDs.CRUDCliente.eliminar(3, 1));
//CRUD FORMA PAGO
//System.out.println("Venta = " + CRUDs.CRUDVenta.insert(1, 1, 1));
//CRUD VENTA DETALLE
//BigDecimal precio2 = new BigDecimal(100);
//System.out.println("Venta detalle = " + CRUDs.CRUDVentaDetalle.insert(2, 7, 3, precio2));
}
