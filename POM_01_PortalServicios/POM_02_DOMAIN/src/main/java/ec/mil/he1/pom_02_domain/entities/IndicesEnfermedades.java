/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "INDICES_ENFERMEDADES")
@NamedQueries({
    @NamedQuery(name = "IndicesEnfermedades.findAll", query = "SELECT i FROM IndicesEnfermedades i")})
public class IndicesEnfermedades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INDENF_ID")
    private Long indenfId;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "ENF_ID_FINAL", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Enfermedades enfermedades;
    @JoinColumn(name = "ENF_ID_INICIAL", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Enfermedades enfermedades1;

    public IndicesEnfermedades() {
    }

    public IndicesEnfermedades(Long indenfId) {
        this.indenfId = indenfId;
    }

    public Long getIndenfId() {
        return indenfId;
    }

    public void setIndenfId(Long indenfId) {
        this.indenfId = indenfId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Enfermedades getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(Enfermedades enfermedades) {
        this.enfermedades = enfermedades;
    }

    public Enfermedades getEnfermedades1() {
        return enfermedades1;
    }

    public void setEnfermedades1(Enfermedades enfermedades1) {
        this.enfermedades1 = enfermedades1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indenfId != null ? indenfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndicesEnfermedades)) {
            return false;
        }
        IndicesEnfermedades other = (IndicesEnfermedades) object;
        if ((this.indenfId == null && other.indenfId != null) || (this.indenfId != null && !this.indenfId.equals(other.indenfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.IndicesEnfermedades[ indenfId=" + indenfId + " ]";
    }
    
}
