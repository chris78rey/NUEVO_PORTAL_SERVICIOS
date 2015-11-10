/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "TECNICAS_BIOPSIAS")
@NamedQueries({
    @NamedQuery(name = "TecnicasBiopsias.findAll", query = "SELECT t FROM TecnicasBiopsias t")})
public class TecnicasBiopsias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TecnicasBiopsiasPK tecnicasBiopsiasPK;
    @JoinColumn(name = "TCNPTL_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TecnicasPatologicas tecnicasPatologicas;

    public TecnicasBiopsias() {
    }

    public TecnicasBiopsias(TecnicasBiopsiasPK tecnicasBiopsiasPK) {
        this.tecnicasBiopsiasPK = tecnicasBiopsiasPK;
    }

    public TecnicasBiopsias(int bpsdtlExmNumero, int bpsdtlVrbexmCodigo, String tcnptlCodigo) {
        this.tecnicasBiopsiasPK = new TecnicasBiopsiasPK(bpsdtlExmNumero, bpsdtlVrbexmCodigo, tcnptlCodigo);
    }

    public TecnicasBiopsiasPK getTecnicasBiopsiasPK() {
        return tecnicasBiopsiasPK;
    }

    public void setTecnicasBiopsiasPK(TecnicasBiopsiasPK tecnicasBiopsiasPK) {
        this.tecnicasBiopsiasPK = tecnicasBiopsiasPK;
    }

    public TecnicasPatologicas getTecnicasPatologicas() {
        return tecnicasPatologicas;
    }

    public void setTecnicasPatologicas(TecnicasPatologicas tecnicasPatologicas) {
        this.tecnicasPatologicas = tecnicasPatologicas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tecnicasBiopsiasPK != null ? tecnicasBiopsiasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TecnicasBiopsias)) {
            return false;
        }
        TecnicasBiopsias other = (TecnicasBiopsias) object;
        if ((this.tecnicasBiopsiasPK == null && other.tecnicasBiopsiasPK != null) || (this.tecnicasBiopsiasPK != null && !this.tecnicasBiopsiasPK.equals(other.tecnicasBiopsiasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TecnicasBiopsias[ tecnicasBiopsiasPK=" + tecnicasBiopsiasPK + " ]";
    }
    
}
