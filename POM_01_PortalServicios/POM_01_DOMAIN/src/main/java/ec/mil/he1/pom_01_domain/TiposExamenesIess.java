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
@Table(name = "TIPOS_EXAMENES_IESS")
@NamedQueries({
    @NamedQuery(name = "TiposExamenesIess.findAll", query = "SELECT t FROM TiposExamenesIess t")})
public class TiposExamenesIess implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TiposExamenesIessPK tiposExamenesIessPK;
    @Column(name = "TIPO_EXAMEN")
    private String tipoExamen;

    public TiposExamenesIess() {
    }

    public TiposExamenesIess(TiposExamenesIessPK tiposExamenesIessPK) {
        this.tiposExamenesIessPK = tiposExamenesIessPK;
    }

    public TiposExamenesIess(String convenio, String tipo, String grupo, String subgrupo) {
        this.tiposExamenesIessPK = new TiposExamenesIessPK(convenio, tipo, grupo, subgrupo);
    }

    public TiposExamenesIessPK getTiposExamenesIessPK() {
        return tiposExamenesIessPK;
    }

    public void setTiposExamenesIessPK(TiposExamenesIessPK tiposExamenesIessPK) {
        this.tiposExamenesIessPK = tiposExamenesIessPK;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tiposExamenesIessPK != null ? tiposExamenesIessPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposExamenesIess)) {
            return false;
        }
        TiposExamenesIess other = (TiposExamenesIess) object;
        if ((this.tiposExamenesIessPK == null && other.tiposExamenesIessPK != null) || (this.tiposExamenesIessPK != null && !this.tiposExamenesIessPK.equals(other.tiposExamenesIessPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TiposExamenesIess[ tiposExamenesIessPK=" + tiposExamenesIessPK + " ]";
    }
    
}
