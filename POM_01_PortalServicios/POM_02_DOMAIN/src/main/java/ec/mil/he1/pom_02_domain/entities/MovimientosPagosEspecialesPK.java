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
public class MovimientosPagosEspecialesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PAGESPPRMESP_PRMROL_EMP_CODIGO")
    private String pagespprmespPrmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "PAGESP_PRMESP_PRMROL_CODIGO")
    private String pagespPrmespPrmrolCodigo;
    @Basic(optional = false)
    @Column(name = "EMPROL_EMP_CODIGO")
    private String emprolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "EMPROL_CODIGO")
    private int emprolCodigo;
    @Basic(optional = false)
    @Column(name = "PAGESP_NUMERO")
    private int pagespNumero;

    public MovimientosPagosEspecialesPK() {
    }

    public MovimientosPagosEspecialesPK(String pagespprmespPrmrolEmpCodigo, String pagespPrmespPrmrolCodigo, String emprolEmpCodigo, int emprolCodigo, int pagespNumero) {
        this.pagespprmespPrmrolEmpCodigo = pagespprmespPrmrolEmpCodigo;
        this.pagespPrmespPrmrolCodigo = pagespPrmespPrmrolCodigo;
        this.emprolEmpCodigo = emprolEmpCodigo;
        this.emprolCodigo = emprolCodigo;
        this.pagespNumero = pagespNumero;
    }

    public String getPagespprmespPrmrolEmpCodigo() {
        return pagespprmespPrmrolEmpCodigo;
    }

    public void setPagespprmespPrmrolEmpCodigo(String pagespprmespPrmrolEmpCodigo) {
        this.pagespprmespPrmrolEmpCodigo = pagespprmespPrmrolEmpCodigo;
    }

    public String getPagespPrmespPrmrolCodigo() {
        return pagespPrmespPrmrolCodigo;
    }

    public void setPagespPrmespPrmrolCodigo(String pagespPrmespPrmrolCodigo) {
        this.pagespPrmespPrmrolCodigo = pagespPrmespPrmrolCodigo;
    }

    public String getEmprolEmpCodigo() {
        return emprolEmpCodigo;
    }

    public void setEmprolEmpCodigo(String emprolEmpCodigo) {
        this.emprolEmpCodigo = emprolEmpCodigo;
    }

    public int getEmprolCodigo() {
        return emprolCodigo;
    }

    public void setEmprolCodigo(int emprolCodigo) {
        this.emprolCodigo = emprolCodigo;
    }

    public int getPagespNumero() {
        return pagespNumero;
    }

    public void setPagespNumero(int pagespNumero) {
        this.pagespNumero = pagespNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagespprmespPrmrolEmpCodigo != null ? pagespprmespPrmrolEmpCodigo.hashCode() : 0);
        hash += (pagespPrmespPrmrolCodigo != null ? pagespPrmespPrmrolCodigo.hashCode() : 0);
        hash += (emprolEmpCodigo != null ? emprolEmpCodigo.hashCode() : 0);
        hash += (int) emprolCodigo;
        hash += (int) pagespNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosPagosEspecialesPK)) {
            return false;
        }
        MovimientosPagosEspecialesPK other = (MovimientosPagosEspecialesPK) object;
        if ((this.pagespprmespPrmrolEmpCodigo == null && other.pagespprmespPrmrolEmpCodigo != null) || (this.pagespprmespPrmrolEmpCodigo != null && !this.pagespprmespPrmrolEmpCodigo.equals(other.pagespprmespPrmrolEmpCodigo))) {
            return false;
        }
        if ((this.pagespPrmespPrmrolCodigo == null && other.pagespPrmespPrmrolCodigo != null) || (this.pagespPrmespPrmrolCodigo != null && !this.pagespPrmespPrmrolCodigo.equals(other.pagespPrmespPrmrolCodigo))) {
            return false;
        }
        if ((this.emprolEmpCodigo == null && other.emprolEmpCodigo != null) || (this.emprolEmpCodigo != null && !this.emprolEmpCodigo.equals(other.emprolEmpCodigo))) {
            return false;
        }
        if (this.emprolCodigo != other.emprolCodigo) {
            return false;
        }
        if (this.pagespNumero != other.pagespNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.MovimientosPagosEspecialesPK[ pagespprmespPrmrolEmpCodigo=" + pagespprmespPrmrolEmpCodigo + ", pagespPrmespPrmrolCodigo=" + pagespPrmespPrmrolCodigo + ", emprolEmpCodigo=" + emprolEmpCodigo + ", emprolCodigo=" + emprolCodigo + ", pagespNumero=" + pagespNumero + " ]";
    }
    
}
