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
@Table(name = "INDICES_MORFOLOGICOS")
@NamedQueries({
    @NamedQuery(name = "IndicesMorfologicos.findAll", query = "SELECT i FROM IndicesMorfologicos i")})
public class IndicesMorfologicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INDMRF_ID")
    private Long indmrfId;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "MRF_CODIGO")
    private String mrfCodigo;
    @Column(name = "MRF_CODIGO_UNA")
    private String mrfCodigoUna;

    public IndicesMorfologicos() {
    }

    public IndicesMorfologicos(Long indmrfId) {
        this.indmrfId = indmrfId;
    }

    public Long getIndmrfId() {
        return indmrfId;
    }

    public void setIndmrfId(Long indmrfId) {
        this.indmrfId = indmrfId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMrfCodigo() {
        return mrfCodigo;
    }

    public void setMrfCodigo(String mrfCodigo) {
        this.mrfCodigo = mrfCodigo;
    }

    public String getMrfCodigoUna() {
        return mrfCodigoUna;
    }

    public void setMrfCodigoUna(String mrfCodigoUna) {
        this.mrfCodigoUna = mrfCodigoUna;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indmrfId != null ? indmrfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndicesMorfologicos)) {
            return false;
        }
        IndicesMorfologicos other = (IndicesMorfologicos) object;
        if ((this.indmrfId == null && other.indmrfId != null) || (this.indmrfId != null && !this.indmrfId.equals(other.indmrfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.IndicesMorfologicos[ indmrfId=" + indmrfId + " ]";
    }
    
}
