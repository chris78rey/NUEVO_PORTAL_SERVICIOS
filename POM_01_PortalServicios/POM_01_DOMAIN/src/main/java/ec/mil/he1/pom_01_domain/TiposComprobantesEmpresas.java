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
@Table(name = "TIPOS_COMPROBANTES_EMPRESAS")
@NamedQueries({
    @NamedQuery(name = "TiposComprobantesEmpresas.findAll", query = "SELECT t FROM TiposComprobantesEmpresas t")})
public class TiposComprobantesEmpresas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TiposComprobantesEmpresasPK tiposComprobantesEmpresasPK;
    @Column(name = "NOMBRE_SECUENCIA")
    private String nombreSecuencia;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "NOMBRE_REPORTE")
    private String nombreReporte;

    public TiposComprobantesEmpresas() {
    }

    public TiposComprobantesEmpresas(TiposComprobantesEmpresasPK tiposComprobantesEmpresasPK) {
        this.tiposComprobantesEmpresasPK = tiposComprobantesEmpresasPK;
    }

    public TiposComprobantesEmpresas(String empCodigo, String tpocmpCodigo) {
        this.tiposComprobantesEmpresasPK = new TiposComprobantesEmpresasPK(empCodigo, tpocmpCodigo);
    }

    public TiposComprobantesEmpresasPK getTiposComprobantesEmpresasPK() {
        return tiposComprobantesEmpresasPK;
    }

    public void setTiposComprobantesEmpresasPK(TiposComprobantesEmpresasPK tiposComprobantesEmpresasPK) {
        this.tiposComprobantesEmpresasPK = tiposComprobantesEmpresasPK;
    }

    public String getNombreSecuencia() {
        return nombreSecuencia;
    }

    public void setNombreSecuencia(String nombreSecuencia) {
        this.nombreSecuencia = nombreSecuencia;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tiposComprobantesEmpresasPK != null ? tiposComprobantesEmpresasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposComprobantesEmpresas)) {
            return false;
        }
        TiposComprobantesEmpresas other = (TiposComprobantesEmpresas) object;
        if ((this.tiposComprobantesEmpresasPK == null && other.tiposComprobantesEmpresasPK != null) || (this.tiposComprobantesEmpresasPK != null && !this.tiposComprobantesEmpresasPK.equals(other.tiposComprobantesEmpresasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TiposComprobantesEmpresas[ tiposComprobantesEmpresasPK=" + tiposComprobantesEmpresasPK + " ]";
    }
    
}
