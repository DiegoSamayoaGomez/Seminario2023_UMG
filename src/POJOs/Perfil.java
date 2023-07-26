package POJOs;
// Generated 17/07/2023 07:01:33 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Perfil generated by hbm2java
 */
public class Perfil  implements java.io.Serializable {


     private int idPerfil;
     private Boolean estado;
     private String descripcion;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Perfil() {
    }

	
    public Perfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }
    public Perfil(int idPerfil, Boolean estado, String descripcion, Set<Usuario> usuarios) {
       this.idPerfil = idPerfil;
       this.estado = estado;
       this.descripcion = descripcion;
       this.usuarios = usuarios;
    }
   
    public int getIdPerfil() {
        return this.idPerfil;
    }
    
    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}

