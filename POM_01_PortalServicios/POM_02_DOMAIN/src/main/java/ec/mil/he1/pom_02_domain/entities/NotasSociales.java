/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "NOTAS_SOCIALES")
@NamedQueries({
    @NamedQuery(name = "NotasSociales.findAll", query = "SELECT n FROM NotasSociales n")})
public class NotasSociales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NotasSocialesPK notasSocialesPK;
    @Column(name = "TRATAMIENTO_SOCIAL")
    private String tratamientoSocial;
    @JoinColumn(name = "FCHSCL_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FichasSociales fichasSociales;

    public NotasSociales() {
    }

    public NotasSociales(NotasSocialesPK notasSocialesPK) {
        this.notasSocialesPK = notasSocialesPK;
    }

    public NotasSociales(int fchsclNumero, String diagnosticoSocial) {
        this.notasSocialesPK = new NotasSocialesPK(fchsclNumero, diagnosticoSocial);
    }

    public NotasSocialesPK getNotasSocialesPK() {
        return notasSocialesPK;
    }

    public void setNotasSocialesPK(NotasSocialesPK notasSocialesPK) {
        this.notasSocialesPK = notasSocialesPK;
    }

    public String getTratamientoSocial() {
        return tratamientoSocial;
    }

    public void setTratamientoSocial(String tratamientoSocial) {
        this.tratamientoSocial = tratamientoSocial;
    }

    public FichasSociales getFichasSociales() {
        return fichasSociales;
    }

    public void setFichasSociales(FichasSociales fichasSociales) {
        this.fichasSociales = fichasSociales;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notasSocialesPK != null ? notasSocialesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotasSociales)) {
            return false;
        }
        NotasSociales other = (NotasSociales) object;
        if ((this.notasSocialesPK == null && other.notasSocialesPK != null) || (this.notasSocialesPK != null && !this.notasSocialesPK.equals(other.notasSocialesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.NotasSociales[ notasSocialesPK=" + notasSocialesPK + " ]";
    }
    
}
