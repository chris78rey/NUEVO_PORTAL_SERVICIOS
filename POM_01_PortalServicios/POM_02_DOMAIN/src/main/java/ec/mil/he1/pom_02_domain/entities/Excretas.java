/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "EXCRETAS")
@NamedQueries({
    @NamedQuery(name = "Excretas.findAll", query = "SELECT e FROM Excretas e")})
public class Excretas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExcretasPK excretasPK;
    @JoinColumn(name = "FCHSCL_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FichasSociales fichasSociales;
    @OneToMany(mappedBy = "excretas", fetch = FetchType.LAZY)
    private List<DisposicionesFinalesExcreta> disposicionesFinalesExcretaList;

    public Excretas() {
    }

    public Excretas(ExcretasPK excretasPK) {
        this.excretasPK = excretasPK;
    }

    public Excretas(int fchsclNumero, String tipo) {
        this.excretasPK = new ExcretasPK(fchsclNumero, tipo);
    }

    public ExcretasPK getExcretasPK() {
        return excretasPK;
    }

    public void setExcretasPK(ExcretasPK excretasPK) {
        this.excretasPK = excretasPK;
    }

    public FichasSociales getFichasSociales() {
        return fichasSociales;
    }

    public void setFichasSociales(FichasSociales fichasSociales) {
        this.fichasSociales = fichasSociales;
    }

    public List<DisposicionesFinalesExcreta> getDisposicionesFinalesExcretaList() {
        return disposicionesFinalesExcretaList;
    }

    public void setDisposicionesFinalesExcretaList(List<DisposicionesFinalesExcreta> disposicionesFinalesExcretaList) {
        this.disposicionesFinalesExcretaList = disposicionesFinalesExcretaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (excretasPK != null ? excretasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Excretas)) {
            return false;
        }
        Excretas other = (Excretas) object;
        if ((this.excretasPK == null && other.excretasPK != null) || (this.excretasPK != null && !this.excretasPK.equals(other.excretasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Excretas[ excretasPK=" + excretasPK + " ]";
    }
    
}
