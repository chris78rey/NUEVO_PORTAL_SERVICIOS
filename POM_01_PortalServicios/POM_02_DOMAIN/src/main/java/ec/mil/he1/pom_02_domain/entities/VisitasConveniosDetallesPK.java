/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class VisitasConveniosDetallesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "VALOR")
    private String valor;
    @Basic(optional = false)
    @Column(name = "CNV_CONVENIO")
    private String cnvConvenio;
    @Basic(optional = false)
    @Column(name = "SECUENCIA")
    private short secuencia;

    public VisitasConveniosDetallesPK() {
    }

    public VisitasConveniosDetallesPK(String valor, String cnvConvenio, short secuencia) {
        this.valor = valor;
        this.cnvConvenio = cnvConvenio;
        this.secuencia = secuencia;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCnvConvenio() {
        return cnvConvenio;
    }

    public void setCnvConvenio(String cnvConvenio) {
        this.cnvConvenio = cnvConvenio;
    }

    public short getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(short secuencia) {
        this.secuencia = secuencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (valor != null ? valor.hashCode() : 0);
        hash += (cnvConvenio != null ? cnvConvenio.hashCode() : 0);
        hash += (int) secuencia;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisitasConveniosDetallesPK)) {
            return false;
        }
        VisitasConveniosDetallesPK other = (VisitasConveniosDetallesPK) object;
        if ((this.valor == null && other.valor != null) || (this.valor != null && !this.valor.equals(other.valor))) {
            return false;
        }
        if ((this.cnvConvenio == null && other.cnvConvenio != null) || (this.cnvConvenio != null && !this.cnvConvenio.equals(other.cnvConvenio))) {
            return false;
        }
        if (this.secuencia != other.secuencia) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.VisitasConveniosDetallesPK[ valor=" + valor + ", cnvConvenio=" + cnvConvenio + ", secuencia=" + secuencia + " ]";
    }
    
}
