package POJOs;
// Generated 17/07/2023 07:01:33 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int idCliente;
     private Usuario usuarioByUsuarioModifica;
     private Usuario usuarioByUsuarioIngreso;
     private boolean estado;
     private String nombre1;
     private String nombre2;
     private String apellido1;
     private String apellido2;
     private String nit;
     private String direccion;
     private String telefono;
     private Date fechaIngreso;
     private Date fechaModifica;
     private Set<Venta> ventas = new HashSet<Venta>(0);

    public Cliente() {
    }

	
    public Cliente(int idCliente, Usuario usuarioByUsuarioIngreso, boolean estado, String nombre1, String apellido1, String nit, Date fechaIngreso) {
        this.idCliente = idCliente;
        this.usuarioByUsuarioIngreso = usuarioByUsuarioIngreso;
        this.estado = estado;
        this.nombre1 = nombre1;
        this.apellido1 = apellido1;
        this.nit = nit;
        this.fechaIngreso = fechaIngreso;
    }
    public Cliente(int idCliente, Usuario usuarioByUsuarioModifica, Usuario usuarioByUsuarioIngreso, boolean estado, String nombre1, String nombre2, String apellido1, String apellido2, String nit, String direccion, String telefono, Date fechaIngreso, Date fechaModifica, Set<Venta> ventas) {
       this.idCliente = idCliente;
       this.usuarioByUsuarioModifica = usuarioByUsuarioModifica;
       this.usuarioByUsuarioIngreso = usuarioByUsuarioIngreso;
       this.estado = estado;
       this.nombre1 = nombre1;
       this.nombre2 = nombre2;
       this.apellido1 = apellido1;
       this.apellido2 = apellido2;
       this.nit = nit;
       this.direccion = direccion;
       this.telefono = telefono;
       this.fechaIngreso = fechaIngreso;
       this.fechaModifica = fechaModifica;
       this.ventas = ventas;
    }
   
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public Usuario getUsuarioByUsuarioModifica() {
        return this.usuarioByUsuarioModifica;
    }
    
    public void setUsuarioByUsuarioModifica(Usuario usuarioByUsuarioModifica) {
        this.usuarioByUsuarioModifica = usuarioByUsuarioModifica;
    }
    public Usuario getUsuarioByUsuarioIngreso() {
        return this.usuarioByUsuarioIngreso;
    }
    
    public void setUsuarioByUsuarioIngreso(Usuario usuarioByUsuarioIngreso) {
        this.usuarioByUsuarioIngreso = usuarioByUsuarioIngreso;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public String getNombre1() {
        return this.nombre1;
    }
    
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }
    public String getNombre2() {
        return this.nombre2;
    }
    
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    public String getApellido1() {
        return this.apellido1;
    }
    
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return this.apellido2;
    }
    
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public String getNit() {
        return this.nit;
    }
    
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Date getFechaModifica() {
        return this.fechaModifica;
    }
    
    public void setFechaModifica(Date fechaModifica) {
        this.fechaModifica = fechaModifica;
    }
    public Set<Venta> getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set<Venta> ventas) {
        this.ventas = ventas;
    }




}

