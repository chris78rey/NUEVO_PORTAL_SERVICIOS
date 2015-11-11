/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "TECNICAS_APLICADAS")
@NamedQueries({
    @NamedQuery(name = "TecnicasAplicadas.findAll", query = "SELECT t FROM TecnicasAplicadas t")})
public class TecnicasAplicadas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TecnicasAplicadasPK tecnicasAplicadasPK;

    public TecnicasAplicadas() {
    }

    public TecnicasAplicadas(TecnicasAplicadasPK tecnicasAplicadasPK) {
        this.tecnicasAplicadasPK = tecnicasAplicadasPK;
    }

    public TecnicasAplicadas(int bpsExmNumero, String tcnptlCodigo) {
        this.tecnicasAplicadasPK = new TecnicasAplicadasPK(bpsExmNumero, tcnptlCodigo);
    }

    public TecnicasAplicadasPK getTecnicasAplicadasPK() {
        return tecnicasAplicadasPK;
    }

    public void setTecnicasAplicadasPK(TecnicasAplicadasPK tecnicasAplicadasPK) {
        this.tecnicasAplicadasPK = tecnicasAplicadasPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tecnicasAplicadasPK != null ? tecnicasAplicadasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TecnicasAplicadas)) {
            return false;
        }
        TecnicasAplicadas other = (TecnicasAplicadas) object;
        if ((this.tecnicasAplicadasPK == null && other.tecnicasAplicadasPK != null) || (this.tecnicasAplicadasPK != null && !this.tecnicasAplicadasPK.equals(other.tecnicasAplicadasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TecnicasAplicadas[ tecnicasAplicadasPK=" + tecnicasAplicadasPK + " ]";
    }
    
}
