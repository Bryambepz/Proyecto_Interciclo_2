/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
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
public class Ticket extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name ="lugar")
    private int lugar;
    @Column(name ="fecha_Ingreso")
    private LocalDateTime fechaIngreso;
    @Column(name ="fecha_Salida")
    private LocalDateTime fechaSalida;
    @Column(name ="Tipo_Contrato")
    private String tipoContrato;

    public Ticket() {
        super(null, null, null, null);
    }
    
    public Ticket(Long id, int lugar, LocalDateTime fechaIngreso, LocalDateTime fechaSalida, String tipoContrato, String cedula, String nombre, String apellido, String telefono) {
        super(cedula, nombre, apellido, telefono);
        this.id = id;
        this.lugar = lugar;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.tipoContrato = tipoContrato;
    }

    public Ticket(Long id, int lugar, LocalDateTime fechaIngreso, LocalDateTime fechaSalida, String tipoContrato) {
        super(null, null, null, null);
        this.id = id;
        this.lugar = lugar;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.tipoContrato = tipoContrato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
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
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.Ticket[ id=" + id + " ]";
    }
    
}
