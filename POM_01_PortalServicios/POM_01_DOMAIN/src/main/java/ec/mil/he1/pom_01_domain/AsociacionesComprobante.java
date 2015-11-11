/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "ASOCIACIONES_COMPROBANTE")
@NamedQueries({
    @NamedQuery(name = "AsociacionesComprobante.findAll", query = "SELECT a FROM AsociacionesComprobante a")})
public class AsociacionesComprobante implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AsociacionesComprobantePK asociacionesComprobantePK;
    @Column(name = "DOCUMENTO")
    private String documento;
    @Column(name = "SECUENCIA")
    private Short secuencia;

    public AsociacionesComprobante() {
    }

    public AsociacionesComprobante(AsociacionesComprobantePK asociacionesComprobantePK) {
        this.asociacionesComprobantePK = asociacionesComprobantePK;
    }

    public AsociacionesComprobante(String cmpTpocmpempEmpCodigo, String asctpocmpTpocmpCodigo, Date cmpFecha, int cmpClave, String asctpocmpNombre) {
        this.asociacionesComprobantePK = new AsociacionesComprobantePK(cmpTpocmpempEmpCodigo, asctpocmpTpocmpCodigo, cmpFecha, cmpClave, asctpocmpNombre);
    }

    public AsociacionesComprobantePK getAsociacionesComprobantePK() {
        return asociacionesComprobantePK;
    }

    public void setAsociacionesComprobantePK(AsociacionesComprobantePK asociacionesComprobantePK) {
        this.asociacionesComprobantePK = asociacionesComprobantePK;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Short getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Short secuencia) {
        this.secuencia = secuencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asociacionesComprobantePK != null ? asociacionesComprobantePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsociacionesComprobante)) {
            return false;
        }
        AsociacionesComprobante other = (AsociacionesComprobante) object;
        if ((this.asociacionesComprobantePK == null && other.asociacionesComprobantePK != null) || (this.asociacionesComprobantePK != null && !this.asociacionesComprobantePK.equals(other.asociacionesComprobantePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.AsociacionesComprobante[ asociacionesComprobantePK=" + asociacionesComprobantePK + " ]";
    }
    
}
