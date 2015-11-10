/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CLASIFICACIONES_DGN")
@NamedQueries({
    @NamedQuery(name = "ClasificacionesDgn.findAll", query = "SELECT c FROM ClasificacionesDgn c")})
public class ClasificacionesDgn implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Short numero;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "ESTADIO")
    private String estadio;
    @OneToMany(mappedBy = "clasificacionesDgn", fetch = FetchType.LAZY)
    private List<Tnms> tnmsList;

    public ClasificacionesDgn() {
    }

    public ClasificacionesDgn(Short numero) {
        this.numero = numero;
    }

    public Short getNumero() {
        return numero;
    }

    public void setNumero(Short numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public List<Tnms> getTnmsList() {
        return tnmsList;
    }

    public void setTnmsList(List<Tnms> tnmsList) {
        this.tnmsList = tnmsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasificacionesDgn)) {
            return false;
        }
        ClasificacionesDgn other = (ClasificacionesDgn) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ClasificacionesDgn[ numero=" + numero + " ]";
    }
    
}
