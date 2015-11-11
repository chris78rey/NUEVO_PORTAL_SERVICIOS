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
public class DetallesEspecialesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PAGESPPRMESP_PRMROL_EMP_CODIGO")
    private String pagespprmespPrmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "MVMPAGESP_PRMESP_PRMROL_CODIGO")
    private String mvmpagespPrmespPrmrolCodigo;
    @Basic(optional = false)
    @Column(name = "MVMPAGESP_EMPROL_EMP_CODIGO")
    private String mvmpagespEmprolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "MVMPAGESP_EMPROL_CODIGO")
    private int mvmpagespEmprolCodigo;
    @Basic(optional = false)
    @Column(name = "MVMPAGESP_PAGESP_NUMERO")
    private int mvmpagespPagespNumero;
    @Basic(optional = false)
    @Column(name = "PRMROL_EMP_CODIGO")
    private String prmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "PRMROL_CODIGO")
    private String prmrolCodigo;

    public DetallesEspecialesPK() {
    }

    public DetallesEspecialesPK(String pagespprmespPrmrolEmpCodigo, String mvmpagespPrmespPrmrolCodigo, String mvmpagespEmprolEmpCodigo, int mvmpagespEmprolCodigo, int mvmpagespPagespNumero, String prmrolEmpCodigo, String prmrolCodigo) {
        this.pagespprmespPrmrolEmpCodigo = pagespprmespPrmrolEmpCodigo;
        this.mvmpagespPrmespPrmrolCodigo = mvmpagespPrmespPrmrolCodigo;
        this.mvmpagespEmprolEmpCodigo = mvmpagespEmprolEmpCodigo;
        this.mvmpagespEmprolCodigo = mvmpagespEmprolCodigo;
        this.mvmpagespPagespNumero = mvmpagespPagespNumero;
        this.prmrolEmpCodigo = prmrolEmpCodigo;
        this.prmrolCodigo = prmrolCodigo;
    }

    public String getPagespprmespPrmrolEmpCodigo() {
        return pagespprmespPrmrolEmpCodigo;
    }

    public void setPagespprmespPrmrolEmpCodigo(String pagespprmespPrmrolEmpCodigo) {
        this.pagespprmespPrmrolEmpCodigo = pagespprmespPrmrolEmpCodigo;
    }

    public String getMvmpagespPrmespPrmrolCodigo() {
        return mvmpagespPrmespPrmrolCodigo;
    }

    public void setMvmpagespPrmespPrmrolCodigo(String mvmpagespPrmespPrmrolCodigo) {
        this.mvmpagespPrmespPrmrolCodigo = mvmpagespPrmespPrmrolCodigo;
    }

    public String getMvmpagespEmprolEmpCodigo() {
        return mvmpagespEmprolEmpCodigo;
    }

    public void setMvmpagespEmprolEmpCodigo(String mvmpagespEmprolEmpCodigo) {
        this.mvmpagespEmprolEmpCodigo = mvmpagespEmprolEmpCodigo;
    }

    public int getMvmpagespEmprolCodigo() {
        return mvmpagespEmprolCodigo;
    }

    public void setMvmpagespEmprolCodigo(int mvmpagespEmprolCodigo) {
        this.mvmpagespEmprolCodigo = mvmpagespEmprolCodigo;
    }

    public int getMvmpagespPagespNumero() {
        return mvmpagespPagespNumero;
    }

    public void setMvmpagespPagespNumero(int mvmpagespPagespNumero) {
        this.mvmpagespPagespNumero = mvmpagespPagespNumero;
    }

    public String getPrmrolEmpCodigo() {
        return prmrolEmpCodigo;
    }

    public void setPrmrolEmpCodigo(String prmrolEmpCodigo) {
        this.prmrolEmpCodigo = prmrolEmpCodigo;
    }

    public String getPrmrolCodigo() {
        return prmrolCodigo;
    }

    public void setPrmrolCodigo(String prmrolCodigo) {
        this.prmrolCodigo = prmrolCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagespprmespPrmrolEmpCodigo != null ? pagespprmespPrmrolEmpCodigo.hashCode() : 0);
        hash += (mvmpagespPrmespPrmrolCodigo != null ? mvmpagespPrmespPrmrolCodigo.hashCode() : 0);
        hash += (mvmpagespEmprolEmpCodigo != null ? mvmpagespEmprolEmpCodigo.hashCode() : 0);
        hash += (int) mvmpagespEmprolCodigo;
        hash += (int) mvmpagespPagespNumero;
        hash += (prmrolEmpCodigo != null ? prmrolEmpCodigo.hashCode() : 0);
        hash += (prmrolCodigo != null ? prmrolCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesEspecialesPK)) {
            return false;
        }
        DetallesEspecialesPK other = (DetallesEspecialesPK) object;
        if ((this.pagespprmespPrmrolEmpCodigo == null && other.pagespprmespPrmrolEmpCodigo != null) || (this.pagespprmespPrmrolEmpCodigo != null && !this.pagespprmespPrmrolEmpCodigo.equals(other.pagespprmespPrmrolEmpCodigo))) {
            return false;
        }
        if ((this.mvmpagespPrmespPrmrolCodigo == null && other.mvmpagespPrmespPrmrolCodigo != null) || (this.mvmpagespPrmespPrmrolCodigo != null && !this.mvmpagespPrmespPrmrolCodigo.equals(other.mvmpagespPrmespPrmrolCodigo))) {
            return false;
        }
        if ((this.mvmpagespEmprolEmpCodigo == null && other.mvmpagespEmprolEmpCodigo != null) || (this.mvmpagespEmprolEmpCodigo != null && !this.mvmpagespEmprolEmpCodigo.equals(other.mvmpagespEmprolEmpCodigo))) {
            return false;
        }
        if (this.mvmpagespEmprolCodigo != other.mvmpagespEmprolCodigo) {
            return false;
        }
        if (this.mvmpagespPagespNumero != other.mvmpagespPagespNumero) {
            return false;
        }
        if ((this.prmrolEmpCodigo == null && other.prmrolEmpCodigo != null) || (this.prmrolEmpCodigo != null && !this.prmrolEmpCodigo.equals(other.prmrolEmpCodigo))) {
            return false;
        }
        if ((this.prmrolCodigo == null && other.prmrolCodigo != null) || (this.prmrolCodigo != null && !this.prmrolCodigo.equals(other.prmrolCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesEspecialesPK[ pagespprmespPrmrolEmpCodigo=" + pagespprmespPrmrolEmpCodigo + ", mvmpagespPrmespPrmrolCodigo=" + mvmpagespPrmespPrmrolCodigo + ", mvmpagespEmprolEmpCodigo=" + mvmpagespEmprolEmpCodigo + ", mvmpagespEmprolCodigo=" + mvmpagespEmprolCodigo + ", mvmpagespPagespNumero=" + mvmpagespPagespNumero + ", prmrolEmpCodigo=" + prmrolEmpCodigo + ", prmrolCodigo=" + prmrolCodigo + " ]";
    }
    
}
