package POJOs;
// Generated 28/08/2023 06:27:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * VentaDetalle generated by hbm2java
 */
public class VentaDetalle  implements java.io.Serializable {


     private Integer idVentaDetalle;
     private Producto producto;
     private Venta venta;
     private Integer cantidad;
     private BigDecimal monto;

    public VentaDetalle() {
    }

    public VentaDetalle(Producto producto, Venta venta, Integer cantidad, BigDecimal monto) {
       this.producto = producto;
       this.venta = venta;
       this.cantidad = cantidad;
       this.monto = monto;
    }
   
    public Integer getIdVentaDetalle() {
        return this.idVentaDetalle;
    }
    
    public void setIdVentaDetalle(Integer idVentaDetalle) {
        this.idVentaDetalle = idVentaDetalle;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Venta getVenta() {
        return this.venta;
    }
    
    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }




}


