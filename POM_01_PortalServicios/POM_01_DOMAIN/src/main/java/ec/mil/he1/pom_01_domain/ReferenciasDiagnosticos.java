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
@Table(name = "REFERENCIAS_DIAGNOSTICOS")
@NamedQueries({
    @NamedQuery(name = "ReferenciasDiagnosticos.findAll", query = "SELECT r FROM ReferenciasDiagnosticos r")})
public class ReferenciasDiagnosticos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CNTRFR_NUMERO")
    private Integer cntrfrNumero;
    @Column(name = "ENF_CODIGO")
    private String enfCodigo;
    @Column(name = "TIPO")
    private String tipo;

    public ReferenciasDiagnosticos() {
    }

    public ReferenciasDiagnosticos(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCntrfrNumero() {
        return cntrfrNumero;
    }

    public void setCntrfrNumero(Integer cntrfrNumero) {
        this.cntrfrNumero = cntrfrNumero;
    }

    public String getEnfCodigo() {
        return enfCodigo;
    }

    public void setEnfCodigo(String enfCodigo) {
        this.enfCodigo = enfCodigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReferenciasDiagnosticos)) {
            return false;
        }
        ReferenciasDiagnosticos other = (ReferenciasDiagnosticos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ReferenciasDiagnosticos[ id=" + id + " ]";
    }
    
}
