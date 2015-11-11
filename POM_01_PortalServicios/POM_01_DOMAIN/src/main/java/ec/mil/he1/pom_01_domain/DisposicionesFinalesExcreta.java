/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DISPOSICIONES_FINALES_EXCRETA")
@NamedQueries({
    @NamedQuery(name = "DisposicionesFinalesExcreta.findAll", query = "SELECT d FROM DisposicionesFinalesExcreta d")})
public class DisposicionesFinalesExcreta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DSPFNLEXC_ID")
    private Long dspfnlexcId;
    @Column(name = "DISPOSICION")
    private String disposicion;
    @Column(name = "EXC_TIPO")
    private String excTipo;
    @Column(name = "EXC_FCHSCL_NUMERO")
    private Integer excFchsclNumero;

    public DisposicionesFinalesExcreta() {
    }

    public DisposicionesFinalesExcreta(Long dspfnlexcId) {
        this.dspfnlexcId = dspfnlexcId;
    }

    public Long getDspfnlexcId() {
        return dspfnlexcId;
    }

    public void setDspfnlexcId(Long dspfnlexcId) {
        this.dspfnlexcId = dspfnlexcId;
    }

    public String getDisposicion() {
        return disposicion;
    }

    public void setDisposicion(String disposicion) {
        this.disposicion = disposicion;
    }

    public String getExcTipo() {
        return excTipo;
    }

    public void setExcTipo(String excTipo) {
        this.excTipo = excTipo;
    }

    public Integer getExcFchsclNumero() {
        return excFchsclNumero;
    }

    public void setExcFchsclNumero(Integer excFchsclNumero) {
        this.excFchsclNumero = excFchsclNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dspfnlexcId != null ? dspfnlexcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DisposicionesFinalesExcreta)) {
            return false;
        }
        DisposicionesFinalesExcreta other = (DisposicionesFinalesExcreta) object;
        if ((this.dspfnlexcId == null && other.dspfnlexcId != null) || (this.dspfnlexcId != null && !this.dspfnlexcId.equals(other.dspfnlexcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DisposicionesFinalesExcreta[ dspfnlexcId=" + dspfnlexcId + " ]";
    }
    
}
