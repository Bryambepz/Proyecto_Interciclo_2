/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author braya
 */
@Entity
public class Admin extends Persona implements Serializable {
a
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Lugares_Disponibles")
    private int lugaresDisp;
    @Column(name = "Lugares_Ocupados")
    private int lugaresOcupados;

    public Admin() {
        super(null, null, null, null);
        this.lugaresDisp = 40;
        this.lugaresOcupados = 0;
    }
    
    public Admin(int lugaresDisp, int lugaresOcupados, String cedula, String nombre, String apellido, String telefono, String correo, String cotrasenia) {
        super(cedula, nombre, apellido, telefono, correo, cotrasenia);
        this.lugaresDisp = lugaresDisp;
        this.lugaresOcupados = lugaresOcupados;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLugaresDisp() {
        return lugaresDisp;
    }

    public void setLugaresDisp(int lugaresDisp) {
        this.lugaresDisp = lugaresDisp;
    }

    public int getLugaresOcupados() {
        return lugaresOcupados;
    }

    public void setLugaresOcupados(int lugaresOcupados) {
        this.lugaresOcupados = lugaresOcupados;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.Admin[ id=" + id + " ]";
    }
    
}
