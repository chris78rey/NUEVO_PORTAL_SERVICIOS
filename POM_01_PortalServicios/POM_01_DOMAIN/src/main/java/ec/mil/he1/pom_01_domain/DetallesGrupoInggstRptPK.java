/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class DetallesGrupoInggstRptPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GRPINGGST_CODIGO")
    private String grpinggstCodigo;
    @Basic(optional = false)
    @Column(name = "GRPINGGST_EMP_CODIGO")
    private String grpinggstEmpCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public DetallesGrupoInggstRptPK() {
    }

    public DetallesGrupoInggstRptPK(String grpinggstCodigo, String grpinggstEmpCodigo, String codigo) {
        this.grpinggstCodigo = grpinggstCodigo;
        this.grpinggstEmpCodigo = grpinggstEmpCodigo;
        this.codigo = codigo;
    }

    public String getGrpinggstCodigo() {
        return grpinggstCodigo;
    }

    public void setGrpinggstCodigo(String grpinggstCodigo) {
        this.grpinggstCodigo = grpinggstCodigo;
    }

    public String getGrpinggstEmpCodigo() {
        return grpinggstEmpCodigo;
    }

    public void setGrpinggstEmpCodigo(String grpinggstEmpCodigo) {
        this.grpinggstEmpCodigo = grpinggstEmpCodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grpinggstCodigo != null ? grpinggstCodigo.hashCode() : 0);
        hash += (grpinggstEmpCodigo != null ? grpinggstEmpCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesGrupoInggstRptPK)) {
            return false;
        }
        DetallesGrupoInggstRptPK other = (DetallesGrupoInggstRptPK) object;
        if ((this.grpinggstCodigo == null && other.grpinggstCodigo != null) || (this.grpinggstCodigo != null && !this.grpinggstCodigo.equals(other.grpinggstCodigo))) {
            return false;
        }
        if ((this.grpinggstEmpCodigo == null && other.grpinggstEmpCodigo != null) || (this.grpinggstEmpCodigo != null && !this.grpinggstEmpCodigo.equals(other.grpinggstEmpCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesGrupoInggstRptPK[ grpinggstCodigo=" + grpinggstCodigo + ", grpinggstEmpCodigo=" + grpinggstEmpCodigo + ", codigo=" + codigo + " ]";
    }
    
}
