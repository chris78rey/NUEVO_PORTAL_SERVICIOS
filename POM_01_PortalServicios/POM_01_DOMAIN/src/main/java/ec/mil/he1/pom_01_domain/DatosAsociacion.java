/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DATOS_ASOCIACION")
@NamedQueries({
    @NamedQuery(name = "DatosAsociacion.findAll", query = "SELECT d FROM DatosAsociacion d")})
public class DatosAsociacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Id
    @Basic(optional = false)
    @Column(name = "DTOASC_ID")
    private Long dtoascId;
    @Column(name = "SISTEMA_ASOCIACION")
    private String sistemaAsociacion;
    @Column(name = "SISTEMA_ASOCIADO")
    private String sistemaAsociado;
    @Column(name = "CLAVE_RELACIONADA")
    private String claveRelacionada;
    @Column(name = "ASOCIACION")
    private String asociacion;
    @Column(name = "OBSERVACION")
    private String observacion;

    public DatosAsociacion() {
    }

    public DatosAsociacion(Long dtoascId) {
        this.dtoascId = dtoascId;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public Long getDtoascId() {
        return dtoascId;
    }

    public void setDtoascId(Long dtoascId) {
        this.dtoascId = dtoascId;
    }

    public String getSistemaAsociacion() {
        return sistemaAsociacion;
    }

    public void setSistemaAsociacion(String sistemaAsociacion) {
        this.sistemaAsociacion = sistemaAsociacion;
    }

    public String getSistemaAsociado() {
        return sistemaAsociado;
    }

    public void setSistemaAsociado(String sistemaAsociado) {
        this.sistemaAsociado = sistemaAsociado;
    }

    public String getClaveRelacionada() {
        return claveRelacionada;
    }

    public void setClaveRelacionada(String claveRelacionada) {
        this.claveRelacionada = claveRelacionada;
    }

    public String getAsociacion() {
        return asociacion;
    }

    public void setAsociacion(String asociacion) {
        this.asociacion = asociacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtoascId != null ? dtoascId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosAsociacion)) {
            return false;
        }
        DatosAsociacion other = (DatosAsociacion) object;
        if ((this.dtoascId == null && other.dtoascId != null) || (this.dtoascId != null && !this.dtoascId.equals(other.dtoascId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DatosAsociacion[ dtoascId=" + dtoascId + " ]";
    }
    
}
