/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CARGOS_TAREAS")
@NamedQueries({
    @NamedQuery(name = "CargosTareas.findAll", query = "SELECT c FROM CargosTareas c")})
public class CargosTareas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CargosTareasPK cargosTareasPK;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private String estadoDeDisponibilidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO")
    private BigDecimal peso;

    public CargosTareas() {
    }

    public CargosTareas(CargosTareasPK cargosTareasPK) {
        this.cargosTareasPK = cargosTareasPK;
    }

    public CargosTareas(int tradprCodigo, Character crgTipo, String crgCodigo) {
        this.cargosTareasPK = new CargosTareasPK(tradprCodigo, crgTipo, crgCodigo);
    }

    public CargosTareasPK getCargosTareasPK() {
        return cargosTareasPK;
    }

    public void setCargosTareasPK(CargosTareasPK cargosTareasPK) {
        this.cargosTareasPK = cargosTareasPK;
    }

    public String getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(String estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cargosTareasPK != null ? cargosTareasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargosTareas)) {
            return false;
        }
        CargosTareas other = (CargosTareas) object;
        if ((this.cargosTareasPK == null && other.cargosTareasPK != null) || (this.cargosTareasPK != null && !this.cargosTareasPK.equals(other.cargosTareasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CargosTareas[ cargosTareasPK=" + cargosTareasPK + " ]";
    }
    
}
