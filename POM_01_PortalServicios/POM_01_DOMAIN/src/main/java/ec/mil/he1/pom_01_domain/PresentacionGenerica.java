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
@Table(name = "PRESENTACION_GENERICA")
@NamedQueries({
    @NamedQuery(name = "PresentacionGenerica.findAll", query = "SELECT p FROM PresentacionGenerica p")})
public class PresentacionGenerica implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PresentacionGenericaPK presentacionGenericaPK;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "GEN_CODIGO_S")
    private String genCodigoS;

    public PresentacionGenerica() {
    }

    public PresentacionGenerica(PresentacionGenericaPK presentacionGenericaPK) {
        this.presentacionGenericaPK = presentacionGenericaPK;
    }

    public PresentacionGenerica(String genCodigoP, int preCodigo) {
        this.presentacionGenericaPK = new PresentacionGenericaPK(genCodigoP, preCodigo);
    }

    public PresentacionGenericaPK getPresentacionGenericaPK() {
        return presentacionGenericaPK;
    }

    public void setPresentacionGenericaPK(PresentacionGenericaPK presentacionGenericaPK) {
        this.presentacionGenericaPK = presentacionGenericaPK;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGenCodigoS() {
        return genCodigoS;
    }

    public void setGenCodigoS(String genCodigoS) {
        this.genCodigoS = genCodigoS;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (presentacionGenericaPK != null ? presentacionGenericaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresentacionGenerica)) {
            return false;
        }
        PresentacionGenerica other = (PresentacionGenerica) object;
        if ((this.presentacionGenericaPK == null && other.presentacionGenericaPK != null) || (this.presentacionGenericaPK != null && !this.presentacionGenericaPK.equals(other.presentacionGenericaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PresentacionGenerica[ presentacionGenericaPK=" + presentacionGenericaPK + " ]";
    }
    
}
