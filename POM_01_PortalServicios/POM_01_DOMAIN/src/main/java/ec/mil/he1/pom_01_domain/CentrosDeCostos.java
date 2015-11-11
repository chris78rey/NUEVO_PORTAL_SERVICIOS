/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "CENTROS_DE_COSTOS")
@NamedQueries({
    @NamedQuery(name = "CentrosDeCostos.findAll", query = "SELECT c FROM CentrosDeCostos c")})
public class CentrosDeCostos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CentrosDeCostosPK centrosDeCostosPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "CUENTA_CONTABLE_MAYOR")
    private String cuentaContableMayor;
    @Column(name = "CONTRACUENTA_CONTABLE_MAYOR")
    private String contracuentaContableMayor;

    public CentrosDeCostos() {
    }

    public CentrosDeCostos(CentrosDeCostosPK centrosDeCostosPK) {
        this.centrosDeCostosPK = centrosDeCostosPK;
    }

    public CentrosDeCostos(String empCodigo, String tipo, String agrupador) {
        this.centrosDeCostosPK = new CentrosDeCostosPK(empCodigo, tipo, agrupador);
    }

    public CentrosDeCostosPK getCentrosDeCostosPK() {
        return centrosDeCostosPK;
    }

    public void setCentrosDeCostosPK(CentrosDeCostosPK centrosDeCostosPK) {
        this.centrosDeCostosPK = centrosDeCostosPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCuentaContableMayor() {
        return cuentaContableMayor;
    }

    public void setCuentaContableMayor(String cuentaContableMayor) {
        this.cuentaContableMayor = cuentaContableMayor;
    }

    public String getContracuentaContableMayor() {
        return contracuentaContableMayor;
    }

    public void setContracuentaContableMayor(String contracuentaContableMayor) {
        this.contracuentaContableMayor = contracuentaContableMayor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (centrosDeCostosPK != null ? centrosDeCostosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentrosDeCostos)) {
            return false;
        }
        CentrosDeCostos other = (CentrosDeCostos) object;
        if ((this.centrosDeCostosPK == null && other.centrosDeCostosPK != null) || (this.centrosDeCostosPK != null && !this.centrosDeCostosPK.equals(other.centrosDeCostosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CentrosDeCostos[ centrosDeCostosPK=" + centrosDeCostosPK + " ]";
    }
    
}
