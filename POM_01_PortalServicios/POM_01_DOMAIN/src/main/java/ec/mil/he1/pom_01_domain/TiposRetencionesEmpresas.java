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
@Table(name = "TIPOS_RETENCIONES_EMPRESAS")
@NamedQueries({
    @NamedQuery(name = "TiposRetencionesEmpresas.findAll", query = "SELECT t FROM TiposRetencionesEmpresas t")})
public class TiposRetencionesEmpresas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TiposRetencionesEmpresasPK tiposRetencionesEmpresasPK;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "CUENTA_DE_CONTABILIDAD")
    private String cuentaDeContabilidad;
    @Column(name = "NOMBRE_SECUENCIA")
    private String nombreSecuencia;

    public TiposRetencionesEmpresas() {
    }

    public TiposRetencionesEmpresas(TiposRetencionesEmpresasPK tiposRetencionesEmpresasPK) {
        this.tiposRetencionesEmpresasPK = tiposRetencionesEmpresasPK;
    }

    public TiposRetencionesEmpresas(String empCodigo, short tportnCodigo) {
        this.tiposRetencionesEmpresasPK = new TiposRetencionesEmpresasPK(empCodigo, tportnCodigo);
    }

    public TiposRetencionesEmpresasPK getTiposRetencionesEmpresasPK() {
        return tiposRetencionesEmpresasPK;
    }

    public void setTiposRetencionesEmpresasPK(TiposRetencionesEmpresasPK tiposRetencionesEmpresasPK) {
        this.tiposRetencionesEmpresasPK = tiposRetencionesEmpresasPK;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getCuentaDeContabilidad() {
        return cuentaDeContabilidad;
    }

    public void setCuentaDeContabilidad(String cuentaDeContabilidad) {
        this.cuentaDeContabilidad = cuentaDeContabilidad;
    }

    public String getNombreSecuencia() {
        return nombreSecuencia;
    }

    public void setNombreSecuencia(String nombreSecuencia) {
        this.nombreSecuencia = nombreSecuencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tiposRetencionesEmpresasPK != null ? tiposRetencionesEmpresasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposRetencionesEmpresas)) {
            return false;
        }
        TiposRetencionesEmpresas other = (TiposRetencionesEmpresas) object;
        if ((this.tiposRetencionesEmpresasPK == null && other.tiposRetencionesEmpresasPK != null) || (this.tiposRetencionesEmpresasPK != null && !this.tiposRetencionesEmpresasPK.equals(other.tiposRetencionesEmpresasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TiposRetencionesEmpresas[ tiposRetencionesEmpresasPK=" + tiposRetencionesEmpresasPK + " ]";
    }
    
}
