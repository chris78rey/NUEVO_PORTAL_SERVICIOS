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
@Table(name = "CENTROS_DE_GASTOS")
@NamedQueries({
    @NamedQuery(name = "CentrosDeGastos.findAll", query = "SELECT c FROM CentrosDeGastos c")})
public class CentrosDeGastos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CentrosDeGastosPK centrosDeGastosPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "CUENTA_CONTABLE_MAYOR")
    private String cuentaContableMayor;
    @Column(name = "CONTRACUENTA_CONTABLE_MAYOR")
    private String contracuentaContableMayor;

    public CentrosDeGastos() {
    }

    public CentrosDeGastos(CentrosDeGastosPK centrosDeGastosPK) {
        this.centrosDeGastosPK = centrosDeGastosPK;
    }

    public CentrosDeGastos(String empCodigo, String tipo, String agrupador) {
        this.centrosDeGastosPK = new CentrosDeGastosPK(empCodigo, tipo, agrupador);
    }

    public CentrosDeGastosPK getCentrosDeGastosPK() {
        return centrosDeGastosPK;
    }

    public void setCentrosDeGastosPK(CentrosDeGastosPK centrosDeGastosPK) {
        this.centrosDeGastosPK = centrosDeGastosPK;
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
        hash += (centrosDeGastosPK != null ? centrosDeGastosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentrosDeGastos)) {
            return false;
        }
        CentrosDeGastos other = (CentrosDeGastos) object;
        if ((this.centrosDeGastosPK == null && other.centrosDeGastosPK != null) || (this.centrosDeGastosPK != null && !this.centrosDeGastosPK.equals(other.centrosDeGastosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CentrosDeGastos[ centrosDeGastosPK=" + centrosDeGastosPK + " ]";
    }
    
}
